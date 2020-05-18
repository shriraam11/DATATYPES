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
	 * Enter a parse tree produced by {@link dataParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(dataParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link dataParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(dataParser.StmtContext ctx);
}