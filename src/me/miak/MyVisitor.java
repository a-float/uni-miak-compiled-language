package me.miak;

import me.miak.parser.CoolangBaseVisitor;
import me.miak.parser.CoolangParser;
import me.miak.scopes.*;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class MyVisitor extends CoolangBaseVisitor<FType> {

    public final ScopeManager scopeManager = new ScopeManager();
    private final List<Instruction> comms;
    private final List<String> errors;
    private final List<Instruction> funcs = new ArrayList<>();

    public MyVisitor(List<Instruction> instructions, List<String> errors) {
        super();
        this.comms = instructions;
        this.errors = errors;
    }

    private String getErrorPos(ParserRuleContext ctx) {
        int line = ctx.getStart().getLine();
        int row = ctx.getStart().getCharPositionInLine();
        return line + ":" + row + " ";
    }

    @Override
    public FType visitParse(CoolangParser.ParseContext ctx) {
        visit(ctx.block());
        funcs.add(0, new Instruction(funcs.size()));    // starting instruction number first
        comms.addAll(0, funcs);     // function go first
        comms.add(new Instruction(Opcode.HALT));    // halt when done
        return new FType(Type.NULL);
    }

    @Override
    public FType visitBlock(CoolangParser.BlockContext ctx) {
        FType toReturn = new FType(Type.NULL);
        for (CoolangParser.StatContext stat : ctx.stat()) {
            if (stat.returnStat() != null) {
                return visit(stat);
            }
            toReturn = visit(stat);
        }
        return toReturn;
    }

    @Override
    public FType visitReturnStat(CoolangParser.ReturnStatContext ctx) {
        if (ctx.expr() != null) {
            FType returnType = visit(ctx.expr());
            comms.add(new Instruction(Opcode.RET));
            return returnType;
        } else {
            comms.add(new Instruction(Opcode.VRET));
            return new FType(Type.VOID);
        }
    }

    @Override
    public FType visitFunDefinition(CoolangParser.FunDefinitionContext ctx) {
        String id = ctx.ID().getText();
        FType declaredReturnType = visit(ctx.type());
        boolean isConst = ctx.mutability() == null || ctx.mutability().MUTABLE() == null;
        List<String> argIDs = new ArrayList<>();
        List<FType> argTypes = new ArrayList<>();
        CoolangParser.FunDefinitionArgsContext actx = ctx.funDefinitionArgs();
        if (actx != null) {
            for (int i = 0; i < actx.ID().size(); i++) {
                argIDs.add(actx.ID(i).getText());
                argTypes.add(visit(actx.type(i)));
            }
        }
        // function body instructions are pushed into the comms list.
        // when the whole body is compiled, the new instructions are extracted from comms and
        // pushed into the funcs list. The latter will be latter put at the beginning of the program code.
        int oldCommsSize = comms.size();
        FType funType = new FType(argTypes, declaredReturnType, funcs.size());
        scopeManager.top().declare(funType, id, isConst, 1);
        // compile the function body
        scopeManager.pushFunctionScope(argTypes, argIDs);
        FType returnType;
        if (ctx.funDefBody().statBlock() != null) {
            returnType = visit(ctx.funDefBody().statBlock());
        } else {
            returnType = visit(ctx.funDefBody().expr());
            comms.add(new Instruction(Opcode.RET)); // expr function bodies need explicit return
        }
        scopeManager.popScope();
        List<Instruction> funcBody = comms.subList(oldCommsSize, comms.size());
        funcs.addAll(new ArrayList<>(funcBody));
        if (comms.size() > oldCommsSize) {
            comms.subList(oldCommsSize, comms.size()).clear();
        }
        // make sure actual return type is equal to the declared one
        if (!returnType.equals(declaredReturnType)) {
            errors.add(getErrorPos(ctx) + "Invalid return type in function " + id + ". Expected " + declaredReturnType + " got " + returnType);
        }
        return new FType(Type.NULL);
    }

    @Override
    public FType visitLambda(CoolangParser.LambdaContext ctx) {
        List<FType> argFTypes = new ArrayList<>();
        List<String> argIDs = new ArrayList<>();

        CoolangParser.FunDefinitionArgsContext actx = ctx.funDefinitionArgs();
        if (actx != null) {
            for (int i = 0; i < actx.ID().size(); i++) {
                argFTypes.add(visit(actx.type(i)));
                argIDs.add(actx.ID(i).getText());
            }
        }
        int oldCommsSize = comms.size();
        int funcStart = funcs.size();
        // compile the function body
        scopeManager.pushFunctionScope(argFTypes, argIDs);
        FType returnType;
        if (ctx.lambdaBody().statBlock() != null) {
            returnType = visit(ctx.lambdaBody().statBlock());
        } else {
            returnType = visit(ctx.lambdaBody().expr());
            // expr function bodies may need explicit return
            if (returnType.type != Type.VOID) comms.add(new Instruction(Opcode.RET));
        }
        FType inferredReturnType = returnType;
        scopeManager.popScope();
        List<Instruction> funcBody = comms.subList(oldCommsSize, comms.size());
        funcs.addAll(new ArrayList<>(funcBody));
        if (comms.size() > oldCommsSize) {
            comms.subList(oldCommsSize, comms.size()).clear();
        }
        comms.add(new Instruction(Opcode.CONST_I32));
        comms.add(new Instruction(funcStart));
        // make sure actual return type is equal to the declared one
        return new FType(argFTypes, inferredReturnType, funcStart);
    }

    @Override
    public FType visitFunCall(CoolangParser.FunCallContext ctx) {
        String id = ctx.ID().getText();
        List<FType> argFTypes = new ArrayList<>();
        CoolangParser.FunArgsContext actx = ctx.funArgs();
        if (actx != null) {
            for (int i = 0; i < actx.expr().size(); i++) {
                argFTypes.add(visit(actx.expr(i)));
            }
        }
        VariableInfo varInfo;
        try {
            varInfo = scopeManager.getVariableInfo(id);
            if (varInfo.ftype.type != Type.FUNC) {
                throw new RuntimeException("Variable " + id + " is not callable");
            }
            if (varInfo.addr == -1) {
                throw new RuntimeException("Function " + id + " is not defined");
            }
        } catch (RuntimeException e) {
            errors.add(getErrorPos(ctx) + e.getMessage());
            return new FType(Type.NULL);
        }
        FType funInfo = varInfo.ftype;
        if (argFTypes.size() != funInfo.argFTypes.size()) {
            errors.add(getErrorPos(ctx) + "Expected " + funInfo.argFTypes.size() + " arguments but got " + argFTypes.size());
        }
        for (int i = 0; i < argFTypes.size(); i++) {
            if (!argFTypes.get(i).equals(funInfo.argFTypes.get(i))) {
                errors.add(getErrorPos(ctx) + "Function " + id + " expected arguments of types " + funInfo.argFTypes + " but got " + argFTypes);
                break;
            }
        }
        comms.add(new Instruction(Opcode.LOAD));
        comms.add(new Instruction(varInfo.addr));
        comms.add(new Instruction(Opcode.SCALL));
        comms.add(new Instruction(funInfo.argFTypes.size()));
        return funInfo.returnType;
    }

    @Override
    public FType visitOutStat(CoolangParser.OutStatContext ctx) {
        visit(ctx.expr());
        comms.add(new Instruction(Opcode.PRINT));
        return new FType(Type.NULL);
    }

    @Override
    public FType visitAssignment(CoolangParser.AssignmentContext ctx) {
        FType exprType = visit(ctx.expr());
        String id = ctx.ID().getText();
        VariableInfo varInfo;
        try {
            varInfo = scopeManager.getVariableInfo(id);
            varInfo.assign(id, exprType);
        } catch (RuntimeException e) {
            this.errors.add(getErrorPos(ctx) + e.getMessage());
            return new FType(Type.NULL);
        }
        if (!varInfo.ftype.equals(exprType)) {
            this.errors.add(getErrorPos(ctx) + "Tried to assign " + exprType + " to " + varInfo.ftype);
        }
//        if (varInfo.ftype.type == Type.FUNC) {
//
//        } else {
        comms.add(new Instruction(Opcode.STORE));
        comms.add(new Instruction(varInfo.addr));
//        }
        return new FType(Type.NULL);
    }

    @Override
    public FType visitDeclaration(CoolangParser.DeclarationContext ctx) {
        boolean isConst = ctx.mutability() == null || ctx.mutability().MUTABLE() == null;
        if (isConst) this.errors.add(getErrorPos(ctx) + "Constant declaration without assignment.");
        FType ftype = visit(ctx.type());
        try {
            scopeManager.top().declare(ftype, ctx.ID().getText(), isConst, 1);
            comms.add(new Instruction(Opcode.CONST_I32));
            comms.add(new Instruction(-1));  // init variables to -1
        } catch (RuntimeException e) {
            errors.add(getErrorPos(ctx) + e.getMessage());
        }
        return new FType(Type.NULL);
    }

    @Override
    public FType visitDeclarationWithAssignment(CoolangParser.DeclarationWithAssignmentContext ctx) {
        FType exprType = visit(ctx.expr());
        FType type = visit(ctx.type());
        if (!type.equals(exprType)) {
            this.errors.add(getErrorPos(ctx) + "Tried to declare " + exprType.toString() + " to " + type);
        }
        String id = ctx.ID().getText();
        boolean isConst = ctx.mutability() == null || ctx.mutability().MUTABLE() == null;
        try {
            scopeManager.top().declare(type, id, isConst, 1);

        } catch (RuntimeException e) {
            this.errors.add(getErrorPos(ctx) + e.getMessage());
        }
        // the value to store is already on top of the stack
        // no need to use STORE here
        return new FType(Type.NULL);
    }

    @Override
    public FType visitFunType(CoolangParser.FunTypeContext ctx) {
        List<FType> argFTypes = new ArrayList<>();
        // the last type is the return type
        for (int i = 0; i < ctx.type().size() - 1; i++) {
            argFTypes.add(visit(ctx.type(i)));
        }
        FType returnFType = visit(ctx.type(ctx.type().size() - 1));
        return new FType(argFTypes, returnFType, -1);   // -1 should be overwritten during assignment
    }

    @Override
    public FType visitType(CoolangParser.TypeContext ctx) {
        Type type = Type.typeFromString(ctx.getText());
        if (type == Type.FUNC) {
            return visit(ctx.funType());
        }
        return new FType(type);
    }

    @Override
    public FType visitIfStat(CoolangParser.IfStatContext ctx) {
        List<FType> retTypes = new ArrayList<>();
        int falseJump, blockStart;
        List<String> nextJumps = new ArrayList<>();
        List<Integer> blockSizes = new ArrayList<>();
        String nextBlockStart;
        scopeManager.pushScope();
        for (int i = 0; i < ctx.conditionBlock().size(); i++) {
            blockStart = comms.size();
            FType condType = visit(ctx.conditionBlock(i).expr());
            if (condType.type != Type.BOOL) {
                this.errors.add(getErrorPos(ctx) + "Condition not of type BOOL: " + ctx.conditionBlock(i).expr().getText());
            }
            comms.add(new Instruction(Opcode.JMPF));
            falseJump = comms.size();
            nextBlockStart = Instruction.getLabelName("nextIfBlockStart");
            nextJumps.add(Instruction.getLabelName("nextJMP"));
            comms.add(new Instruction(nextBlockStart));
            FType retType = visit(ctx.conditionBlock(i).statBlock());
            retTypes.add(retType);
            blockSizes.add(comms.size() - blockStart);
            comms.add(new Instruction(Opcode.JMP));
            comms.add(new Instruction(nextJumps.get(nextJumps.size()-1)));
            Instruction.map.put(nextBlockStart, comms.size() - falseJump - 1); // -1 for the jmp argument
        }
        if (ctx.statBlock() != null) {
            blockStart = comms.size();
            retTypes.add(visit(ctx.statBlock()));
            blockSizes.add(comms.size() - blockStart);
        }
        scopeManager.popScope();
        for (int i = 1; i < retTypes.size(); i++) {
            if (!retTypes.get(i - 1).equals(retTypes.get(i))) {
                this.errors.add(getErrorPos(ctx) + "Different return types from if statement: " + retTypes.get(i - 1) + " and " + retTypes.get(i));
            }
        }
        for(int i = 0; i < nextJumps.size(); i++){
            int jmpVal = i == blockSizes.size()-1 ? 0 : blockSizes.get(i+1);
            Instruction.map.put(nextJumps.get(i), jmpVal);
        }
        return retTypes.get(0);
    }

    @Override
    public FType visitStatBlock(CoolangParser.StatBlockContext ctx) {
        FType toReturn = visit(ctx.block());
        int declaredVariables = scopeManager.top().getTotalSize();
        if (declaredVariables > 0) {
            comms.add(new Instruction(Opcode.POPN));
            comms.add(new Instruction(declaredVariables));
        }
        return toReturn;
    }

    @Override
    public FType visitWhileStat(CoolangParser.WhileStatContext ctx) {
        scopeManager.pushScope();
        int whileStart = comms.size();

        String whileEnd = Instruction.getLabelName("whileEnd");
        FType condType = visit(ctx.expr());
        if (condType.type != Type.BOOL) {
            this.errors.add(getErrorPos(ctx) + "While condition is not of type BOOL: " + ctx.expr().getText());
        }
        int beforeJMPF = comms.size();
        comms.add(new Instruction(Opcode.JMPF));
        comms.add(new Instruction(whileEnd));
        FType retType = visit(ctx.statBlock());
        System.out.println(comms.size() + " " + whileStart);
        comms.add(new Instruction(Opcode.JMP));
        comms.add(new Instruction(whileStart - comms.size() - 1));
        Instruction.map.put(whileEnd, comms.size() - beforeJMPF - 2);
        scopeManager.popScope();
        return retType;
    }

    /*
    Looks scary, but that's because contrary to the while loop all the required comparisons are written by hand
    Having no expr to visit I load, store and compare the necessary values
    Iterator is can be modified during the looping influencing the loop count.
     */
    @Override
    public FType visitForStat(CoolangParser.ForStatContext ctx) {
        int currStackEnd = scopeManager.top().getEndAddr();
        CoolangParser.RangeContext rctx = ctx.range();
        visit(rctx.expr(1));    // end val
        visit(rctx.expr(2));    // step
        int forStart = comms.size();
        String forEnd = Instruction.getLabelName("forEnd");
        scopeManager.pushScope();
        scopeManager.top().modifyStartAddr(2);
        scopeManager.top().declare(visit(rctx.expr(0)), ctx.ID().getText(), false, 1);
        VariableInfo iter = scopeManager.top().getVariableInfo(ctx.ID().getText());
        comms.add(new Instruction(Opcode.LOAD));
        comms.add(new Instruction(iter.addr));
        comms.add(new Instruction(Opcode.LOAD));
        comms.add(new Instruction(currStackEnd));
        comms.add(new Instruction(Opcode.EQ_I32));
        comms.add(new Instruction(Opcode.JMPT));
        comms.add(new Instruction(forEnd)); // stop looping
        FType toReturn = visit(ctx.statBlock());
        // decrease statBlock's POPN by one - don't remove iter
        comms.set(comms.size() - 1, new Instruction(comms.get(comms.size() - 1).immVal - 1));
        comms.add(new Instruction(Opcode.LOAD));
        comms.add(new Instruction(iter.addr));
        comms.add(new Instruction(Opcode.LOAD));
        comms.add(new Instruction(currStackEnd + 1));
        comms.add(new Instruction(Opcode.ADD_I32));
        comms.add(new Instruction(Opcode.STORE));
        comms.add(new Instruction(iter.addr));
        comms.add(new Instruction(Opcode.JMP));
        comms.add(new Instruction(forStart));
        Instruction.map.put(forEnd, comms.size() - forStart);
        scopeManager.popScope();
        return toReturn;
    }

    @Override
    public FType visitFunExpr(CoolangParser.FunExprContext ctx) {
        return super.visitFunExpr(ctx);
    }

    @Override
    public FType visitAtomExpr(CoolangParser.AtomExprContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public FType visitAdditiveExpr(CoolangParser.AdditiveExprContext ctx) {
        FType returnType = visit(ctx.expr(0));
        visit(ctx.expr(1));
        if (ctx.PLUS() != null) {
            comms.add(new Instruction(Opcode.ADD_I32));
        } else {
            comms.add(new Instruction(Opcode.SUB_I32));
        }
        return returnType;
    }

    @Override
    public FType visitRelationalExpr(CoolangParser.RelationalExprContext ctx) {
        visit(ctx.expr(0));
        visit(ctx.expr(1));
        if (ctx.LT() != null) {
            comms.add(new Instruction(Opcode.LT_I32));
        } else if (ctx.LTEQ() != null) {
            comms.add(new Instruction(Opcode.LTE_I32));
        } else if (ctx.GT() != null) {
            comms.add(new Instruction(Opcode.LTE_I32));
            comms.add(new Instruction(Opcode.NOT));
        } else {
            comms.add(new Instruction(Opcode.LT_I32));
            comms.add(new Instruction(Opcode.NOT));
        }
        return new FType(Type.BOOL);
    }

    @Override
    public FType visitParExpr(CoolangParser.ParExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public FType visitNotExpr(CoolangParser.NotExprContext ctx) {
        visit(ctx.expr());
        comms.add(new Instruction(Opcode.NOT));
        return new FType(Type.BOOL);
    }

    @Override
    public FType visitIndexedExpr(CoolangParser.IndexedExprContext ctx) {
        return super.visitIndexedExpr(ctx);
    }

    @Override
    public FType visitUnaryMinusExpr(CoolangParser.UnaryMinusExprContext ctx) {
        visit(ctx.expr());
        comms.add(new Instruction(Opcode.CONST_I32));
        comms.add(new Instruction(-1));
        comms.add(new Instruction(Opcode.MUL_I32));
        return new FType(Type.INT);
    }

    @Override
    public FType visitMultiplicationExpr(CoolangParser.MultiplicationExprContext ctx) {
        FType returnType = visit(ctx.expr(0));
        visit(ctx.expr(1));
        comms.add(new Instruction(Opcode.MUL_I32));
        return returnType;
    }

    @Override
    public FType visitPowExpr(CoolangParser.PowExprContext ctx) {
        FType returnType = visit(ctx.expr(0));
        visit(ctx.expr(1));
        comms.add(new Instruction(Opcode.POW));
        return returnType;
    }

    @Override
    public FType visitEqualityExpr(CoolangParser.EqualityExprContext ctx) {
        visit(ctx.expr(0));
        visit(ctx.expr(1));
        comms.add(new Instruction(Opcode.EQ_I32));
        return new FType(Type.BOOL);
    }

    @Override
    public FType visitAndExpr(CoolangParser.AndExprContext ctx) {
        visit(ctx.expr(0));
        visit(ctx.expr(1));
        comms.add(new Instruction(Opcode.MUL_I32));
        return new FType(Type.BOOL);
    }

    @Override
    public FType visitOrExpr(CoolangParser.OrExprContext ctx) {
        visit(ctx.expr(0));
        visit(ctx.expr(1));
        comms.add(new Instruction(Opcode.MUL_I32));
        return new FType(Type.BOOL);
    }

    @Override
    public FType visitIndexSingle(CoolangParser.IndexSingleContext ctx) {
        return super.visitIndexSingle(ctx);
    }

    @Override
    public FType visitIndexRange(CoolangParser.IndexRangeContext ctx) {
        return super.visitIndexRange(ctx);
    }

    @Override
    public FType visitRange(CoolangParser.RangeContext ctx) {
        return super.visitRange(ctx);
    }

    @Override
    public FType visitIntAtom(CoolangParser.IntAtomContext ctx) {
        comms.add(new Instruction(Opcode.CONST_I32));
        comms.add(new Instruction(Integer.parseInt(ctx.getText())));
        return new FType(Type.INT);
    }

    @Override
    public FType visitBooleanAtom(CoolangParser.BooleanAtomContext ctx) {
        comms.add(new Instruction(Opcode.CONST_I32));
        comms.add(new Instruction(ctx.TRUE() != null ? 1 : 0));
        return new FType(Type.BOOL);
    }

    @Override
    public FType visitIdAtom(CoolangParser.IdAtomContext ctx) {
        VariableInfo var;
        try {
            var = scopeManager.getVariableInfo(ctx.getText());
        } catch (RuntimeException e) {
            this.errors.add(getErrorPos(ctx) + e.getMessage());
            return new FType(Type.NULL);
        }
        if (var.ftype.type == Type.FUNC) {
            comms.add(new Instruction(Opcode.CONST_I32));
            comms.add(new Instruction(var.ftype.startAddr));
        } else {
            comms.add(new Instruction(Opcode.LOAD));
            comms.add(new Instruction(var.addr));
        }
        return var.ftype;
    }

    @Override
    public FType visitStringAtom(CoolangParser.StringAtomContext ctx) {
        return super.visitStringAtom(ctx);
    }

}
