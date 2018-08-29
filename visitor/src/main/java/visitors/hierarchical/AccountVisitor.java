package visitors.hierarchical;

import model.Account;
import visitors.acyclic.Visitor;

public interface AccountVisitor extends Visitor {
    void visit(Account account);
}
