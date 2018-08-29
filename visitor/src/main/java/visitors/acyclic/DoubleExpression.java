package visitors.acyclic;

public class DoubleExpression extends Expression {
    private Double value;

    public Double getValue() {
        return value;
    }

    public DoubleExpression(Double value) {
        this.value = value;
    }

    public void accept(Visitor visitor) {
        if (visitor instanceof DoubleExpressionVisitor) {
            DoubleExpressionVisitor doubleExpressionVisitor = (DoubleExpressionVisitor) visitor;
            doubleExpressionVisitor.visit(this);
        }
    }
}
