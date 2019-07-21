package visitors.doubledispatch;

public class ExpressionPrinter implements ExpressionVisitor {
    private StringBuilder stringBuilder = new StringBuilder();

    public void visit(DoubleExpression doubleExpression) {
        stringBuilder.append(doubleExpression.getValue());
    }

    public void visit(AdditionExpression additionExpression) {
        stringBuilder.append("(");
        additionExpression.getLeft().accept(this);
        stringBuilder.append("+");
        additionExpression.getRight().accept(this);
        stringBuilder.append(")");
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

}
