package pl.slemjet.command;

import com.google.common.collect.Lists;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;

import java.util.List;

@Log
class BankAccountCommandTest {

    @Test
    void test() {

        BankAccount bankAccount = new BankAccount();
        log.info(bankAccount.toString());

        List<BankAccountCommand> commands = List.of(
                new BankAccountCommand(bankAccount, BankAccountCommand.Action.DEPOSIT, 300),
                new BankAccountCommand(bankAccount, BankAccountCommand.Action.WITHDRAW, 100),
                new BankAccountCommand(bankAccount, BankAccountCommand.Action.WITHDRAW, 1000));

        for (Command command : commands) {
            command.call();
            log.info(bankAccount.toString());
        }

        List<BankAccountCommand> reversedCommands = Lists.reverse(commands);
        for (Command command : reversedCommands) {
            command.undo();
            log.info(bankAccount.toString());
        }
    }
}