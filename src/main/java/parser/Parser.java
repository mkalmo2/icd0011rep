package parser;

import java.util.List;

public class Parser {

    private final List<Token> tokens;
    private int pos = 0;

    public Parser(List<Token> tokens) {
        this.tokens = tokens;
    }

    public Object parse() {
        list();

        return null;
    }

    private void list() {
        match(TokenType.LEFT_BRACKET); elements(); match(TokenType.RIGHT_BRACKET);
    }

    private void elements() {
        element();
        while (lookahead().getType() == TokenType.COMMA) {
            match(TokenType.COMMA); element();
        }
    }

    private void element() {
        if (lookahead().getType() == TokenType.NUMBER) {
            number();
        } else if (lookahead().getType() == TokenType.LEFT_BRACKET) {
            list();
        } else {
            throw new Error("Expecting name or list; found " + lookahead());
        }
    }

    private void number() {
        match(TokenType.NUMBER);
    }

    private Token match(TokenType type) {
        if (lookahead().getType() == type) {
            return consume();
        } else {
            throw new RuntimeException(
                    "Unexpected token '%s' at position %s".formatted(lookahead(), pos));
        }
    }

    private Token lookahead() {
        return tokens.get(pos);
    }

    private Token consume() {
        return tokens.get(pos++);
    }

}
