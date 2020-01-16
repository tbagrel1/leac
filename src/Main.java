import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, RecognitionException {
        LeacLexer lexer = new LeacLexer(new ANTLRFileStream("/home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/output/__Test___input.txt", "UTF8"));
        System.out.println("1");
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println("2");
        LeacParser parser = new LeacParser(tokens);
        System.out.println("3");
        parser.program();
        System.out.println("4");
    }
}
