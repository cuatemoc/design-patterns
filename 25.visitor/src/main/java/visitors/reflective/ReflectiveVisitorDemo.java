package visitors.reflective;

public class ReflectiveVisitorDemo {

    public static void main(String[] args) {
        // 1+(2+3)

        AdditionExpression expression = new AdditionExpression(new DoubleExpression(1d),
                new AdditionExpression(new DoubleExpression(2d), new DoubleExpression(3d)));

        StringBuilder stringBuilder = new StringBuilder();
        ExpressionPrinter.print(expression, stringBuilder);
        System.out.println(stringBuilder);
    }
}
