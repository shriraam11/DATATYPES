// Generated from /Users/shriraamreddyb/IdeaProjects/datatype/src/main/java/data.g4 by ANTLR 4.8

import java.util.*;
import java.io.FileNotFoundException;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dataParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dataVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dataParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(dataParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link dataParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(dataParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opstmt}
	 * labeled alternative in {@link dataParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpstmt(dataParser.OpstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compstmt}
	 * labeled alternative in {@link dataParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompstmt(dataParser.CompstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isobjprop}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsobjprop(dataParser.IsobjpropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringend}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringend(dataParser.StringendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intend}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntend(dataParser.IntendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolend}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolend(dataParser.BoolendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatend}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatend(dataParser.FloatendContext ctx);
}