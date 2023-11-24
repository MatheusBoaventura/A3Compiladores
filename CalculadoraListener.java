// Generated from Calculadora.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraParser}.
 */
public interface CalculadoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculadoraParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculadoraParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalculadoraParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalculadoraParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CalculadoraParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CalculadoraParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CalculadoraParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CalculadoraParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalculadoraParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalculadoraParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CalculadoraParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CalculadoraParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CalculadoraParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CalculadoraParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(CalculadoraParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(CalculadoraParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CalculadoraParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CalculadoraParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(CalculadoraParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(CalculadoraParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void enterScanStatement(CalculadoraParser.ScanStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void exitScanStatement(CalculadoraParser.ScanStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CalculadoraParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CalculadoraParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculadoraParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculadoraParser.ExpressionContext ctx);
}