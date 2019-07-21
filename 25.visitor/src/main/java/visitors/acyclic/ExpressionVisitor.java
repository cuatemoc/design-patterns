package visitors.acyclic;

public interface ExpressionVisitor extends Visitor{
    void visit(Expression expression);
}
