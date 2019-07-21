package visitors.doubledispatch;

public class DoubleExpression extends Expression {
    private Double value;

    public Double getValue() {
        return value;
    }

    public DoubleExpression(Double value) {
        this.value = value;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
