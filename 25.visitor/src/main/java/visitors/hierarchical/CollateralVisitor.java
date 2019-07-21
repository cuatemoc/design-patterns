package visitors.hierarchical;

import model.Collateral;
import visitors.acyclic.Visitor;

public interface CollateralVisitor extends Visitor {
    void visit(Collateral collateral);
}
