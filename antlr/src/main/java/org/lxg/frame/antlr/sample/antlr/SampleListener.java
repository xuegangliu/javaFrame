// Generated from D:/WorkSpaces/Self/antlr-demo/src/main/resources\Sample.g4 by ANTLR 4.7

package org.lxg.frame.antlr.sample.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SampleParser}.
 */
public interface SampleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SampleParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SampleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SampleParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SampleParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SampleParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SampleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SampleParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(SampleParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(SampleParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(SampleParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(SampleParser.AtomContext ctx);
}