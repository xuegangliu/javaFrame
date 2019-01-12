// Generated from D:/WorkSpaces/Self/antlr-demo/src/main/resources\Rule.g4 by ANTLR 4.7

package org.lxg.frame.antlr.rule.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RuleParser#regulation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegulation(RuleParser.RegulationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(RuleParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#regular}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular(RuleParser.RegularContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(RuleParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#equationModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquationModule(RuleParser.EquationModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equStringFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquStringFun(RuleParser.EquStringFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equAddSubFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquAddSubFun(RuleParser.EquAddSubFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equMulDivFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquMulDivFun(RuleParser.EquMulDivFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equIdFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquIdFun(RuleParser.EquIdFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equNumberFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquNumberFun(RuleParser.EquNumberFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#regularModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularModule(RuleParser.RegularModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regularString}
	 * labeled alternative in {@link RuleParser#regularExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularString(RuleParser.RegularStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#sqlModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlModule(RuleParser.SqlModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlString}
	 * labeled alternative in {@link RuleParser#sqlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlString(RuleParser.SqlStringContext ctx);
}