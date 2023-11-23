// Generated from Calculadora.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraParser}.
 */
public interface CalculadoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalculadoraParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalculadoraParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPar(CalculadoraParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPar(CalculadoraParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(CalculadoraParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(CalculadoraParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpBin}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpBin(CalculadoraParser.OpBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpBin}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpBin(CalculadoraParser.OpBinContext ctx);
}