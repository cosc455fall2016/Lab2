// Generated from /Users/jdehling/Desktop/test/Lab2/src/usps.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link uspsParser}.
 */
public interface uspsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link uspsParser#trackingnumber}.
	 * @param ctx the parse tree
	 */
	void enterTrackingnumber(uspsParser.TrackingnumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link uspsParser#trackingnumber}.
	 * @param ctx the parse tree
	 */
	void exitTrackingnumber(uspsParser.TrackingnumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link uspsParser#letter_part}.
	 * @param ctx the parse tree
	 */
	void enterLetter_part(uspsParser.Letter_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link uspsParser#letter_part}.
	 * @param ctx the parse tree
	 */
	void exitLetter_part(uspsParser.Letter_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link uspsParser#number_part}.
	 * @param ctx the parse tree
	 */
	void enterNumber_part(uspsParser.Number_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link uspsParser#number_part}.
	 * @param ctx the parse tree
	 */
	void exitNumber_part(uspsParser.Number_partContext ctx);
}