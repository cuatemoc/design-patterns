package visitors.hierarchical;

import model.Collateral;
import model.Credit;
import model.Customer;

import static java.util.Objects.nonNull;

public class CollateralValueAdder implements
        CollateralVisitor, CreditVisitor, CustomerVisitor, Visitor {
    private Double collateralSum = 0d;

    @Override
    public void visit(Customer customer) {
        if(nonNull(customer) && nonNull(customer.getCredits())){
            customer.getCredits().stream().forEach(credit -> credit.accept(this));
        }
    }

    @Override
    public void visit(Credit credit) {
        if(nonNull(credit) && nonNull(credit.getCollaterals())){
            credit.getCollaterals().stream().forEach(account -> account.accept(this));
        }
    }

    @Override
    public void visit(Collateral collateral) {
        if(nonNull(collateral)){
            collateralSum += collateral.getCollateralAllocation() * collateral.getCollateralValue();
        }
    }

    public Double getCollateralSum() {
        return collateralSum;
    }
}
