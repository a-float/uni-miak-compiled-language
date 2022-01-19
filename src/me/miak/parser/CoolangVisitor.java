// Generated from C:\Users\mati8\Desktop\Semestr5\MIAK\Colang\ColangCompiler\resources\Coolang.g4 by ANTLR 4.9.3

package me.miak.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoolangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoolangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoolangParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(CoolangParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CoolangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CoolangParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(CoolangParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#funDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDefinition(CoolangParser.FunDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#funRetType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunRetType(CoolangParser.FunRetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#funDefBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDefBody(CoolangParser.FunDefBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(CoolangParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(CoolangParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#funDefinitionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDefinitionArgs(CoolangParser.FunDefinitionArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#funCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(CoolangParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#funCallParentheses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallParentheses(CoolangParser.FunCallParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#funArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunArgs(CoolangParser.FunArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#outStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutStat(CoolangParser.OutStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CoolangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CoolangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#arrayCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreation(CoolangParser.ArrayCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#declarationWithAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationWithAssignment(CoolangParser.DeclarationWithAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CoolangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#funType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunType(CoolangParser.FunTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#mutability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutability(CoolangParser.MutabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(CoolangParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#conditionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBlock(CoolangParser.ConditionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#statBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatBlock(CoolangParser.StatBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(CoolangParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(CoolangParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(CoolangParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunExpr(CoolangParser.FunExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addressExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressExpr(CoolangParser.AddressExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(CoolangParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(CoolangParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(CoolangParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(CoolangParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(CoolangParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(CoolangParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(CoolangParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(CoolangParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(CoolangParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(CoolangParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pointerExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerExpr(CoolangParser.PointerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link CoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(CoolangParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtom(CoolangParser.IntAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(CoolangParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(CoolangParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexedAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexedAtom(CoolangParser.IndexedAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link CoolangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaAtom(CoolangParser.LambdaAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(CoolangParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CoolangParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#idxAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdxAtom(CoolangParser.IdxAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolangParser#ptrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrExpr(CoolangParser.PtrExprContext ctx);
}