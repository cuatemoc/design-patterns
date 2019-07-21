package visitors.doubledispatch;


public abstract class Expression {
    public abstract void accept(ExpressionVisitor visitor);
}
