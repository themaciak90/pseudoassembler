// Generated from C:/Users/Maciek/Desktop/studia/JFK/PseudoAssembler/src/main/antlr\PseudoAssembler.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseudoAssemblerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseudoAssemblerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PseudoAssemblerParser#rule_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_set(PseudoAssemblerParser.Rule_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code movxorexpr}
	 * labeled alternative in {@link PseudoAssemblerParser#single_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovxorexpr(PseudoAssemblerParser.MovxorexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pushexpr}
	 * labeled alternative in {@link PseudoAssemblerParser#single_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushexpr(PseudoAssemblerParser.PushexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intrule}
	 * labeled alternative in {@link PseudoAssemblerParser#single_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntrule(PseudoAssemblerParser.IntruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAssemblerParser#multiarg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiarg(PseudoAssemblerParser.MultiargContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAssemblerParser#singlearg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglearg(PseudoAssemblerParser.SingleargContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAssemblerParser#intexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntexpr(PseudoAssemblerParser.IntexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digexpr}
	 * labeled alternative in {@link PseudoAssemblerParser#arthmeticexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigexpr(PseudoAssemblerParser.DigexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regexpr}
	 * labeled alternative in {@link PseudoAssemblerParser#arthmeticexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexpr(PseudoAssemblerParser.RegexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multexpr}
	 * labeled alternative in {@link PseudoAssemblerParser#arthmeticexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultexpr(PseudoAssemblerParser.MultexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsubexpr}
	 * labeled alternative in {@link PseudoAssemblerParser#arthmeticexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsubexpr(PseudoAssemblerParser.AddsubexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenexpr}
	 * labeled alternative in {@link PseudoAssemblerParser#arthmeticexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenexpr(PseudoAssemblerParser.ParenexprContext ctx);
}