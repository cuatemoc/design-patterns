package model;

import lombok.Builder;
import lombok.Data;
import visitors.hierarchical.CollateralVisitor;
import visitors.hierarchical.Visitor;

@Data
@Builder
public class Collateral {
    private String collateralNumber;

    private Double collateralValue;
    private Double collateralAllocation;

    public void accept(Visitor visitor) {
        if (visitor instanceof CollateralVisitor) {
            CollateralVisitor collateralVisitor = (CollateralVisitor) visitor;
            collateralVisitor.visit(this);
        }
    }
}
