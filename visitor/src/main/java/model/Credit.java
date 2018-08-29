package model;

import lombok.Builder;
import lombok.Data;
import visitors.hierarchical.CreditVisitor;
import visitors.hierarchical.Visitor;

import java.util.List;

@Data
@Builder
public class Credit {
    private String creditNumber;

    private List<Account> accounts;
    private List<Collateral> collaterals;

    public void accept(Visitor visitor) {
        if (visitor instanceof CreditVisitor) {
            CreditVisitor creditVisitor = (CreditVisitor) visitor;
            creditVisitor.visit(this);
        }
    }

}
