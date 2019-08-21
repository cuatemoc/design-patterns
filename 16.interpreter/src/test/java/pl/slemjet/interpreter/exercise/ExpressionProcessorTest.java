package pl.slemjet.interpreter.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionProcessorTest {

    @Test
    void calculate() {
        ExpressionProcessor ep = new ExpressionProcessor();
        ep.variables.put('x', 5);

        assertEquals(1, ep.calculate("1"));
        assertEquals(5, ep.calculate("x"));
        assertEquals(3, ep.calculate("1+2"));
        assertEquals(6, ep.calculate("1+x"));
        assertEquals(0, ep.calculate("1+xy"));
    }
}