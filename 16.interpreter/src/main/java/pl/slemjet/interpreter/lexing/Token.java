package pl.slemjet.interpreter.lexing;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Log
public class Token {

    public TokenType tokenType;
    public String value;

    @Override
    public String toString() {
        return "`" + value + "`";
    }

    public static List<Token> lex(String s) {
        List<Token> result = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ' ':
                    break;
                case '+':
                    result.add(new Token(TokenType.PLUS, "+"));
                    break;
                case '-':
                    result.add(new Token(TokenType.MINUS, "-"));
                    break;
                case '(':
                    result.add(new Token(TokenType.LPAR, "("));
                    break;
                case ')':
                    result.add(new Token(TokenType.RPAR, ")"));
                    break;
                default:
                    StringBuilder value = new StringBuilder("" + s.charAt(i));
                    for (int j = i + 1; j < s.length(); j++)
                        if (Character.isDigit(s.charAt(j))) {
                            value.append(s.charAt(j));
                            ++i;
                        } else {
                            result.add(new Token(TokenType.VALUE, value.toString()));
                            break;
                        }
            }
        }

        return result;
    }
}
