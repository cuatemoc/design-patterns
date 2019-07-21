package visitors.doubledispatch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionPrinterTest {

    @Test
    public void test() {
        // given
        AdditionExpression expression = new AdditionExpression(new DoubleExpression(1d),
                new AdditionExpression(new DoubleExpression(2d), new DoubleExpression(3d)));

        ExpressionPrinter expressionPrinter = new ExpressionPrinter();

        // when
        expressionPrinter.visit(expression);

        //then
        assertEquals("(1.0+(2.0+3.0))", expressionPrinter.toString());
    }
}