package parser;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String data = "[13, 2, [2, [401], 3], 89]";

        List<Token> tokens = new ListLexer(data).getTokens();

        System.out.println(tokens);

        var result = new Parser(tokens).parse();

        System.out.println(result);
    }
}
