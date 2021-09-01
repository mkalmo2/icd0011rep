package parser;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isDigit;

public class ListLexer {

    private final String data;
    private int pos = 0;

    public ListLexer(String data) {
        this.data = data;
    }

    public List<Token> getTokens() {
        ArrayList<Token> tokens = new ArrayList<>();

        while (!eof()) {

            if (Character.isWhitespace(lookahead())) {
               // ...
            } else {
                throw new RuntimeException("unexpected character: " + lookahead());
            }
        }

        return tokens;
    }

    private Integer readNumber() {
        StringBuilder sb = new StringBuilder();
        while (!eof() && isDigit(lookahead())) {
            sb.append(consume());
        }
        return Integer.parseInt(sb.toString());
    }

    private boolean eof() {
        return pos == data.length();
    }

    private char consume() {
        return data.charAt(pos++);
    }

    private char lookahead() {
        return data.charAt(pos);
    }
}
