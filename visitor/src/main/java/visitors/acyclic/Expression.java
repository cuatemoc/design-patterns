package visitors.acyclic;


public abstract class Expression {
    public void accept(Visitor visitor){
        if (visitor instanceof ExpressionVisitor){
            ExpressionVisitor expressionVisitor = (ExpressionVisitor) visitor;
            expressionVisitor.visit(this);
        }
    }
}
