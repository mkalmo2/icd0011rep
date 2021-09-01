package parser;

public class Token {

    public static Token LEFT_BRACKET = new Token(TokenType.LEFT_BRACKET);
    public static Token RIGHT_BRACKET = new Token(TokenType.RIGHT_BRACKET);
    public static Token COMMA = new Token(TokenType.COMMA);

    private TokenType type;
    private Integer value;

    public static Token number(Integer value) {
        return new Token(TokenType.NUMBER, value);
    }

    private Token(TokenType type, Integer value) {
        this.type = type;
        this.value = value;
    }

    private Token(TokenType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type.toString() + (value != null ? "(%s)".formatted(value) : "");
    }

    public TokenType getType() {
        return type;
    }

    public Integer getValue() {
        return value;
    }
}

