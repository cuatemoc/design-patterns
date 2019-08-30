package pl.slemjet.nullobject.simple;

import org.junit.jupiter.api.Test;

class NullLogTest {
    @Test
    void test() {
        ConsoleLog log = new ConsoleLog();
        BankAccount ba = new BankAccount(log);
        ba.deposit(100);
        ba.withdraw(200);

        System.out.println("Testing on null log");
        NullLog nullLog = new NullLog();
        BankAccount baNullLog = new BankAccount(nullLog);
        baNullLog.deposit(100);
        baNullLog.withdraw(200);
    }
}