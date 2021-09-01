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

            if (Character.isWhitespace(nextChar())) {
                consume();
            } else if ('[' == nextChar()) {
                tokens.add(Token.LEFT_BRACKET);
                consume();
            } else if (']' == nextChar()) {
                tokens.add(Token.RIGHT_BRACKET);
                consume();
            } else if (',' == nextChar()) {
                tokens.add(Token.COMMA);
                consume();
            } else if (isDigit(nextChar())) {
                tokens.add(Token.number(readNumber()));
            } else {
                throw new RuntimeException("unexpected character: " + nextChar());
            }
        }

        return tokens;
    }

    private Integer readNumber() {
        StringBuilder sb = new StringBuilder();
        while (!eof() && isDigit(nextChar())) {
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

    private char nextChar() {
        return data.charAt(pos);
    }
}
