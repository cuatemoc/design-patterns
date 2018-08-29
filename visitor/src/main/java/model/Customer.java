package model;

import lombok.Builder;
import lombok.Data;
import visitors.hierarchical.CustomerVisitor;
import visitors.hierarchical.Visitor;

import java.util.List;

@Data
@Builder
public class Customer {
    private Long id;
    private String name;

    private List<Credit> credits;

    public void accept(Visitor visitor) {
        if (visitor instanceof CustomerVisitor) {
            CustomerVisitor customerVisitor = (CustomerVisitor) visitor;
            customerVisitor.visit(this);
        }
    }
}
