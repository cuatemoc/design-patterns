package pl.slemjet.memento.simple;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BankAccountMemento {

    private final int balance;

    public BankAccountMemento(int balance) {
        this.balance = balance;
    }
}
