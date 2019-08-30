package pl.slemjet.memento.simple;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class BankAccount {

    private int balance = 0;

    public BankAccountMemento deposit(int amount){
        balance += amount;
        return new BankAccountMemento(balance);
    }

    public void revert(BankAccountMemento memento){
        balance = memento.getBalance();
    }
}
