package visitors.doubledispatch;

public class AdditionExpression extends Expression {
    private Expression left, right;

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
