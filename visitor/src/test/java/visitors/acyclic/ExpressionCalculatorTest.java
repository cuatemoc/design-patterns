package visitors.acyclic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionCalculatorTest {

    @Test
    public void test() {
        // given
        AdditionExpression expression = new AdditionExpression(new DoubleExpression(1d),
                new AdditionExpression(new DoubleExpression(2d), new DoubleExpression(3d)));

        ExpressionCalculator expressionCalculator = new ExpressionCalculator();

        // when
        expressionCalculator.visit(expression);

        //then
        assertEquals(6d, expressionCalculator.getValue());
    }
}