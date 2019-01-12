// Generated from D:/WorkSpaces/Self/antlr-demo/src/main/resources\Demo.g4 by ANTLR 4.7

package org.lxg.frame.antlr.demo.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DemoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DemoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DemoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(DemoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(DemoParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(DemoParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(DemoParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(DemoParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(DemoParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(DemoParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(DemoParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POW}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOW(DemoParser.POWContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DemoParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(DemoParser.IntContext ctx);
}