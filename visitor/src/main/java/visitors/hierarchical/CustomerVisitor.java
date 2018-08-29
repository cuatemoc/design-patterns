package visitors.hierarchical;

import model.Customer;
import visitors.acyclic.Visitor;

public interface CustomerVisitor extends Visitor {
    void visit(Customer customer);
}
