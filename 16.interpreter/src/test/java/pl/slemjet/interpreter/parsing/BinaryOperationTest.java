package pl.slemjet.interpreter.parsing;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import pl.slemjet.interpreter.lexing.Token;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@Log
class BinaryOperationTest {

    @Test
    void parse() {
        String expression = "(12+5) - (6-2)";
        List<Token> lex = Token.lex(expression);
        log.info(lex.stream().map(token -> token.toString()).collect(Collectors.joining("\t")));

        Element parse = BinaryOperation.parse(lex);
        int result = parse.eval();
        log.info(expression + " = " + result);
    }
}