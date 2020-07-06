// Generated from D:/javaProject/antlrv4Lean/src/main/java\MyDSL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link MyDSLVisitor},
 * which can be extended to create a hello.visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class MyDSLBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements MyDSLVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitR(MyDSLParser.RContext ctx) { return visitChildren(ctx); }
}