// Generated from C:\Users\mati8\Desktop\Semestr5\MIAK\Colang\ColangCompiler\resources\Coolang.g4 by ANTLR 4.9.3

package me.miak.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolangParser}.
 */
public interface CoolangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolangParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(CoolangParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(CoolangParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CoolangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CoolangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CoolangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CoolangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(CoolangParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(CoolangParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#funDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunDefinition(CoolangParser.FunDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#funDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunDefinition(CoolangParser.FunDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#funRetType}.
	 * @param ctx the parse tree
	 */
	void enterFunRetType(CoolangParser.FunRetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#funRetType}.
	 * @param ctx the parse tree
	 */
	void exitFunRetType(CoolangParser.FunRetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#funDefBody}.
	 * @param ctx the parse tree
	 */
	void enterFunDefBody(CoolangParser.FunDefBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#funDefBody}.
	 * @param ctx the parse tree
	 */
	void exitFunDefBody(CoolangParser.FunDefBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(CoolangParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(CoolangParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(CoolangParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(CoolangParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#funDefinitionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunDefinitionArgs(CoolangParser.FunDefinitionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#funDefinitionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunDefinitionArgs(CoolangParser.FunDefinitionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(CoolangParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(CoolangParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#funCallParentheses}.
	 * @param ctx the parse tree
	 */
	void enterFunCallParentheses(CoolangParser.FunCallParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#funCallParentheses}.
	 * @param ctx the parse tree
	 */
	void exitFunCallParentheses(CoolangParser.FunCallParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#funArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunArgs(CoolangParser.FunArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#funArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunArgs(CoolangParser.FunArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#outStat}.
	 * @param ctx the parse tree
	 */
	void enterOutStat(CoolangParser.OutStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#outStat}.
	 * @param ctx the parse tree
	 */
	void exitOutStat(CoolangParser.OutStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CoolangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CoolangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CoolangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CoolangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#arrayCreation}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreation(CoolangParser.ArrayCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#arrayCreation}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreation(CoolangParser.ArrayCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#declarationWithAssignment}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationWithAssignment(CoolangParser.DeclarationWithAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#declarationWithAssignment}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationWithAssignment(CoolangParser.DeclarationWithAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CoolangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CoolangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#funType}.
	 * @param ctx the parse tree
	 */
	void enterFunType(CoolangParser.FunTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#funType}.
	 * @param ctx the parse tree
	 */
	void exitFunType(CoolangParser.FunTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#mutability}.
	 * @param ctx the parse tree
	 */
	void enterMutability(CoolangParser.MutabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#mutability}.
	 * @param ctx the parse tree
	 */
	void exitMutability(CoolangParser.MutabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(CoolangParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(CoolangParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionBlock(CoolangParser.ConditionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionBlock(CoolangParser.ConditionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#statBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatBlock(CoolangParser.StatBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#statBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatBlock(CoolangParser.StatBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(CoolangParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(CoolangParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(CoolangParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(CoolangParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(CoolangParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(CoolangParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunExpr(CoolangParser.FunExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunExpr(CoolangParser.FunExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addressExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddressExpr(CoolangParser.AddressExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addressExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddressExpr(CoolangParser.AddressExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(CoolangParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(CoolangParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(CoolangParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(CoolangParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(CoolangParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(CoolangParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(CoolangParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(CoolangParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(CoolangParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(CoolangParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(CoolangParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(CoolangParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(CoolangParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(CoolangParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(CoolangParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(CoolangParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(CoolangParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(CoolangParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(CoolangParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(CoolangParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pointerExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPointerExpr(CoolangParser.PointerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pointerExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPointerExpr(CoolangParser.PointerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(CoolangParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(CoolangParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntAtom(CoolangParser.IntAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntAtom(CoolangParser.IntAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(CoolangParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(CoolangParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(CoolangParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(CoolangParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexedAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIndexedAtom(CoolangParser.IndexedAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexedAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIndexedAtom(CoolangParser.IndexedAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterLambdaAtom(CoolangParser.LambdaAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitLambdaAtom(CoolangParser.LambdaAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(CoolangParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(CoolangParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(CoolangParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(CoolangParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#idxAtom}.
	 * @param ctx the parse tree
	 */
	void enterIdxAtom(CoolangParser.IdxAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#idxAtom}.
	 * @param ctx the parse tree
	 */
	void exitIdxAtom(CoolangParser.IdxAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolangParser#ptrExpr}.
	 * @param ctx the parse tree
	 */
	void enterPtrExpr(CoolangParser.PtrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolangParser#ptrExpr}.
	 * @param ctx the parse tree
	 */
	void exitPtrExpr(CoolangParser.PtrExprContext ctx);
}