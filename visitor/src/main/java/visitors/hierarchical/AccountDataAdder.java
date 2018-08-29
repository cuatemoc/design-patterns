package visitors.hierarchical;

import model.Account;
import model.Credit;
import model.Customer;

import static java.util.Objects.nonNull;

public class AccountDataAdder implements
        AccountVisitor, CreditVisitor, CustomerVisitor, Visitor {
    private Double eadSum = 0d;
    private Double pdSum = 0d;

    @Override
    public void visit(Customer customer) {
        if(nonNull(customer) && nonNull(customer.getCredits())){
            customer.getCredits().stream().forEach(credit -> credit.accept(this));
        }
    }

    @Override
    public void visit(Credit credit) {
        if (nonNull(credit) && nonNull(credit.getAccounts())) {
            credit.getAccounts().stream().forEach(account -> account.accept(this));
        }
    }

    @Override
    public void visit(Account account) {
        if(nonNull(account)){
            eadSum += account.getEad();
            pdSum += account.getPd();
        }
    }

    public Double getEadSum() {
        return eadSum;
    }

    public Double getPdSum() {
        return pdSum;
    }
}
