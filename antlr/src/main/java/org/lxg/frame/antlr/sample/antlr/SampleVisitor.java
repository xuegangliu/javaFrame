// Generated from D:/WorkSpaces/Self/antlr-demo/src/main/resources\Sample.g4 by ANTLR 4.7

package org.lxg.frame.antlr.sample.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SampleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SampleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SampleParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SampleParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SampleParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SampleParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(SampleParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(SampleParser.AtomContext ctx);
}