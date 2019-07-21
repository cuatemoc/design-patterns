package visitors.hierarchical;

import model.Account;
import model.Collateral;
import model.Credit;
import model.Customer;

import java.util.List;

public class GeneralTestData {
    public static Customer getTestCustomer() {
        return Customer.builder()
                .id(1l)
                .name("John")
                .credits(List.of(
                        Credit.builder()
                                .creditNumber("cr1_1")
                                .collaterals(List.of(
                                        Collateral.builder()
                                                .collateralNumber("col1_1_1").collateralAllocation(.11).collateralValue(110d).build(),
                                        Collateral.builder()
                                                .collateralNumber("col1_1_2").collateralAllocation(.12).collateralValue(120d).build(),
                                        Collateral.builder()
                                                .collateralNumber("col1_1_3").collateralAllocation(.13).collateralValue(130d).build()
                                ))
                                .accounts(List.of(
                                        Account.builder().accountNumber("acc_1_1_1").ead(111d).pd(.111).build(),
                                        Account.builder().accountNumber("acc_1_1_2").ead(112d).pd(.112).build(),
                                        Account.builder().accountNumber("acc_1_1_3").ead(113d).pd(.113).build()
                                ))
                                .build(),
                        Credit.builder()
                                .creditNumber("cr1_2")
                                .collaterals(List.of(
                                        Collateral.builder()
                                                .collateralNumber("col1_2_1").collateralAllocation(.21).collateralValue(210d).build(),
                                        Collateral.builder()
                                                .collateralNumber("col1_2_2").collateralAllocation(.22).collateralValue(20d).build(),
                                        Collateral.builder()
                                                .collateralNumber("col1_2_3").collateralAllocation(.23).collateralValue(230d).build()
                                ))
                                .accounts(List.of(
                                        Account.builder().accountNumber("acc_1_2_1").ead(121d).pd(.121).build(),
                                        Account.builder().accountNumber("acc_1_2_2").ead(122d).pd(.122).build(),
                                        Account.builder().accountNumber("acc_1_2_3").ead(123d).pd(.123).build()
                                ))
                                .build(),
                        Credit.builder()
                                .creditNumber("cr1_3")
                                .collaterals(List.of(
                                        Collateral.builder()
                                                .collateralNumber("col1_3_1").collateralAllocation(.31).collateralValue(310d).build(),
                                        Collateral.builder()
                                                .collateralNumber("col1_3_2").collateralAllocation(.32).collateralValue(320d).build(),
                                        Collateral.builder()
                                                .collateralNumber("col1_3_3")
                                                .collateralAllocation(.33)
                                                .collateralValue(330d)
                                                .build()
                                ))
                                .accounts(List.of(
                                        Account.builder().accountNumber("acc_1_3_1").ead(131d).pd(.131).build(),
                                        Account.builder().accountNumber("acc_1_3_2").ead(132d).pd(.132).build(),
                                        Account.builder().accountNumber("acc_1_3_3").ead(133d).pd(.133).build()
                                ))
                                .build())
                ).build();
    }
}
