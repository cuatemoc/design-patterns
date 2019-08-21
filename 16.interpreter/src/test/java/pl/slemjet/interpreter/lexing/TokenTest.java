package pl.slemjet.interpreter.lexing;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

class TokenTest {

    @Test
    void testLex() {
        List<Token> lex = Token.lex("(12+5) - (6-2)");
        System.out.println(lex.stream().map(token -> token.toString()).collect(Collectors.joining("\t")));
    }
}