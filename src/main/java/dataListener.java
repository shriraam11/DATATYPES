// Generated from /Users/shriraamreddyb/IdeaProjects/datatype/src/main/java/data.g4 by ANTLR 4.8

import java.util.*;
import java.io.FileNotFoundException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dataParser}.
 */
public interface dataListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dataParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(dataParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link dataParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(dataParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link dataParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterParens(dataParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link dataParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitParens(dataParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opstmt}
	 * labeled alternative in {@link dataParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterOpstmt(dataParser.OpstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opstmt}
	 * labeled alternative in {@link dataParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitOpstmt(dataParser.OpstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compstmt}
	 * labeled alternative in {@link dataParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompstmt(dataParser.CompstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compstmt}
	 * labeled alternative in {@link dataParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompstmt(dataParser.CompstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isobjprop}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIsobjprop(dataParser.IsobjpropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isobjprop}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIsobjprop(dataParser.IsobjpropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringend}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringend(dataParser.StringendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringend}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringend(dataParser.StringendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intend}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntend(dataParser.IntendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intend}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntend(dataParser.IntendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolend}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolend(dataParser.BoolendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolend}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolend(dataParser.BoolendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatend}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatend(dataParser.FloatendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatend}
	 * labeled alternative in {@link dataParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatend(dataParser.FloatendContext ctx);
}