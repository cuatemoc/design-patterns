package visitors.hierarchical;

import model.Credit;
import visitors.acyclic.Visitor;

public interface CreditVisitor extends Visitor {
    void visit(Credit credit);
}
