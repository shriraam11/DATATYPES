// Generated from /Users/shriraamreddyb/IdeaProjects/datatype/src/main/java/data.g4 by ANTLR 4.8

import java.util.*;
import java.io.FileNotFoundException;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link dataVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class dataBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements dataVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStat(dataParser.StatContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStmt(dataParser.StmtContext ctx) { return visitChildren(ctx); }
}