package pl.slemjet.command;

import lombok.ToString;
import lombok.extern.java.Log;

@Log
@ToString(exclude = {"overdraftLimit"})
public class BankAccount {

    private int balance;
    private int overdraftLimit = -500;

    public BankAccount() {
    }

    public BankAccount(int balance, int overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(int amount) {
        balance += amount;
        log.info("Deposited " + amount);
    }

    public boolean withdraw(int amount) {
        if (balance - amount >= overdraftLimit) {
            balance -= amount;
            log.info("Withdrawn " + amount);
            return true;
        }
        return false;
    }
}
