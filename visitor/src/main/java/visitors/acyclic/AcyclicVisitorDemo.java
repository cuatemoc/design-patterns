package visitors.acyclic;

public class AcyclicVisitorDemo {

    public static void main(String[] args) {
        // 1+(2+3)=6

        AdditionExpression expression = new AdditionExpression(new DoubleExpression(1d),
                new AdditionExpression(new DoubleExpression(2d), new DoubleExpression(3d)));

        ExpressionPrinter expressionPrinter = new ExpressionPrinter();
        expressionPrinter.visit(expression);
        ExpressionCalculator expressionCalculator = new ExpressionCalculator();
        expressionCalculator.visit(expression);
        System.out.println(expressionPrinter.toString() + "=" + expressionCalculator.getValue());
    }
}
