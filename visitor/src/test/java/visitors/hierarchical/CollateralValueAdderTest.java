package visitors.hierarchical;

import model.Customer;
import org.junit.jupiter.api.Test;

class CollateralValueAdderTest {

    @Test
    public void test() {
        // given
        Customer customer = GeneralTestData.getTestCustomer();
        CollateralValueAdder collateralValueAdder = new CollateralValueAdder();

        // when
        collateralValueAdder.visit(customer);

        // then
        Double collateralSum = collateralValueAdder.getCollateralSum();
        System.out.println(collateralSum);
    }

}