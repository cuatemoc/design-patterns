package pl.slemjet.memento.simple;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BankAccountMementoTest {
    @Test
    void test() {
        BankAccount account = new BankAccount(100);
        System.out.println(account);

        System.out.println("adding 50");
        BankAccountMemento memento1 = account.deposit(50);
        System.out.println(memento1);
        System.out.println(account);
        Assertions.assertThat(account.getBalance()).isEqualTo(150);

        System.out.println("adding 75");
        BankAccountMemento memento2 = account.deposit(75);
        System.out.println(memento2);
        System.out.println(account);
        Assertions.assertThat(account.getBalance()).isEqualTo(225);

        System.out.println("reverting to memento1");
        account.revert(memento1);
        System.out.println(account);
        Assertions.assertThat(account.getBalance()).isEqualTo(150);
    }
}