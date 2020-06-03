import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Interpreter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        Visitor visitor = new Visitor(new MyStack(), new Register());
        Scanner scanner = new Scanner(System.in);
        String line;
        ParseTree parseTree = null;
        CharStream charStream = CharStreams.fromString("");
        while(scanner.hasNext()) {
            line = scanner.nextLine();
            if(line.isEmpty())
                continue;
            charStream = CharStreams.fromString(line);
            PseudoAssemblerLexer pseudoAssemblerLexer = new PseudoAssemblerLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(pseudoAssemblerLexer);
            PseudoAssemblerParser pseudoAssemblerParser = new PseudoAssemblerParser(commonTokenStream);
            pseudoAssemblerParser.removeErrorListeners();
            pseudoAssemblerParser.addErrorListener(ErrorListener.INSTANCE);
            pseudoAssemblerLexer.removeErrorListeners();
            pseudoAssemblerLexer.addErrorListener(ErrorListener.INSTANCE);

            try {
                parseTree = pseudoAssemblerParser.rule_set();
            }catch (ParseCancellationException e){
                System.out.println("Error");
                parseTree = null;
            }
            try{
                visitor.visit(parseTree);
            } catch(NullPointerException e){

            }


        }

    }
}
