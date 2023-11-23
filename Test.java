import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
    public static void main(String[] args) throws Exception {
        // Cria um lexer que alimenta caracteres para o analisador
        HelloLexer lexer = new HelloLexer(CharStreams.fromFileName("input.txt"));

        // Cria um buffer de tokens puxados do lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Cria um analisador que alimenta tokens no analisador
        HelloParser parser = new HelloParser(tokens);

        ParseTree tree = parser.r(); // Inicia a análise na regra 'r'

        // Imprime a árvore de análise em formato LISP
        System.out.println(tree.toStringTree(parser));
    }
}
