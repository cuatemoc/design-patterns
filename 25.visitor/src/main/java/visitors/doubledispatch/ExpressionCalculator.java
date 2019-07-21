package visitors.doubledispatch;

public class ExpressionCalculator implements ExpressionVisitor {
    private double value;

    public void visit(DoubleExpression doubleExpression) {
        value = doubleExpression.getValue();
    }

    public void visit(AdditionExpression additionExpression) {
        additionExpression.getLeft().accept(this);
        double left = value;
        additionExpression.getRight().accept(this);
        double right = value;
        value = left + right;
    }

    public double getValue() {
        return value;
    }
}
