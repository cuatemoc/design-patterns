package visitors.hierarchical;

import model.Customer;
import org.junit.jupiter.api.Test;

class AccountDataAdderTest {

    @Test
    public void test(){
        // given
        Customer customer = GeneralTestData.getTestCustomer();
        AccountDataAdder accountDataAdder = new AccountDataAdder();

        // when
        accountDataAdder.visit(customer);
        Double eadSum = accountDataAdder.getEadSum();
        Double pdSum = accountDataAdder.getPdSum();

        // then
        System.out.println(eadSum);
        System.out.println(pdSum);
    }

}