package model;

import lombok.Builder;
import lombok.Data;
import visitors.hierarchical.AccountVisitor;
import visitors.hierarchical.Visitor;

@Data
@Builder
public class Account {
    private String accountNumber;

    private Double ead;
    private Double pd;

    public void accept(Visitor visitor) {
        if (visitor instanceof AccountVisitor) {
            AccountVisitor accountVisitor = (AccountVisitor) visitor;
            accountVisitor.visit(this);
        }
    }
}
