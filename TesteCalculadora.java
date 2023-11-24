import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class TesteCalculadora {
    public static void main(String[] args) throws Exception {
        // Crie um stream de caracteres a partir do seu código de teste
        CharStream input = CharStreams.fromString("3+2*4");

        // Crie um lexer com o stream de entrada
        CalculadoraLexer lexer = new CalculadoraLexer(input);

        // Crie um stream de tokens a partir do lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crie um parser com o stream de tokens
        CalculadoraParser parser = new CalculadoraParser(tokens);

        // Inicie o parsing a partir da regra inicial (neste caso, "prog")
        ParseTree tree = parser.prog();

        // Crie um visitante
        EvalVisitor eval = new EvalVisitor();

        // Use o visitante para avaliar a expressão
        int result = eval.visit(tree);

        // Imprima o resultado
        System.out.println("Resultado: " + result);
    }
}