package pl.slemjet.command;

public class BankAccountCommand implements Command {

    private final BankAccount account;
    private final Action action;
    private final int amount;
    private boolean succeeded;

    public BankAccountCommand(BankAccount account, Action action, int amount) {
        this.account = account;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void call() {
        switch (action) {
            case DEPOSIT:
                account.deposit(amount);
                succeeded = true;
                break;
            case WITHDRAW:
                succeeded = account.withdraw(amount);
                break;
        }
    }

    @Override
    public void undo() {
        if (succeeded) {
            switch (action) {
                case DEPOSIT:
                    account.withdraw(amount);
                    break;
                case WITHDRAW:
                    account.deposit(amount);
                    break;
            }
        }
    }

    enum Action {
        DEPOSIT, WITHDRAW;
    }
}
