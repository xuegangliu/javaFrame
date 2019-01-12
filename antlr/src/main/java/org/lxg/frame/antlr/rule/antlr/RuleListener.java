// Generated from D:/WorkSpaces/Self/antlr-demo/src/main/resources\Rule.g4 by ANTLR 4.7

package org.lxg.frame.antlr.rule.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuleParser}.
 */
public interface RuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuleParser#regulation}.
	 * @param ctx the parse tree
	 */
	void enterRegulation(RuleParser.RegulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#regulation}.
	 * @param ctx the parse tree
	 */
	void exitRegulation(RuleParser.RegulationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(RuleParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(RuleParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#regular}.
	 * @param ctx the parse tree
	 */
	void enterRegular(RuleParser.RegularContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#regular}.
	 * @param ctx the parse tree
	 */
	void exitRegular(RuleParser.RegularContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#sql}.
	 * @param ctx the parse tree
	 */
	void enterSql(RuleParser.SqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#sql}.
	 * @param ctx the parse tree
	 */
	void exitSql(RuleParser.SqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#equationModule}.
	 * @param ctx the parse tree
	 */
	void enterEquationModule(RuleParser.EquationModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#equationModule}.
	 * @param ctx the parse tree
	 */
	void exitEquationModule(RuleParser.EquationModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equStringFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 */
	void enterEquStringFun(RuleParser.EquStringFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equStringFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 */
	void exitEquStringFun(RuleParser.EquStringFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equAddSubFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 */
	void enterEquAddSubFun(RuleParser.EquAddSubFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equAddSubFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 */
	void exitEquAddSubFun(RuleParser.EquAddSubFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equMulDivFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 */
	void enterEquMulDivFun(RuleParser.EquMulDivFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equMulDivFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 */
	void exitEquMulDivFun(RuleParser.EquMulDivFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equIdFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 */
	void enterEquIdFun(RuleParser.EquIdFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equIdFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 */
	void exitEquIdFun(RuleParser.EquIdFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equNumberFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 */
	void enterEquNumberFun(RuleParser.EquNumberFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equNumberFun}
	 * labeled alternative in {@link RuleParser#equExpression}.
	 * @param ctx the parse tree
	 */
	void exitEquNumberFun(RuleParser.EquNumberFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#regularModule}.
	 * @param ctx the parse tree
	 */
	void enterRegularModule(RuleParser.RegularModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#regularModule}.
	 * @param ctx the parse tree
	 */
	void exitRegularModule(RuleParser.RegularModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularString}
	 * labeled alternative in {@link RuleParser#regularExpression}.
	 * @param ctx the parse tree
	 */
	void enterRegularString(RuleParser.RegularStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularString}
	 * labeled alternative in {@link RuleParser#regularExpression}.
	 * @param ctx the parse tree
	 */
	void exitRegularString(RuleParser.RegularStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#sqlModule}.
	 * @param ctx the parse tree
	 */
	void enterSqlModule(RuleParser.SqlModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#sqlModule}.
	 * @param ctx the parse tree
	 */
	void exitSqlModule(RuleParser.SqlModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlString}
	 * labeled alternative in {@link RuleParser#sqlExpression}.
	 * @param ctx the parse tree
	 */
	void enterSqlString(RuleParser.SqlStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlString}
	 * labeled alternative in {@link RuleParser#sqlExpression}.
	 * @param ctx the parse tree
	 */
	void exitSqlString(RuleParser.SqlStringContext ctx);
}