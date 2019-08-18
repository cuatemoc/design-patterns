package pl.slemjet.command.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {
    @Test
    void test() {

        Exercise.Account a = new Exercise.Account();

        Exercise.Command command = new Exercise.Command(Exercise.Command.Action.DEPOSIT, 100);
        a.process(command);

        assertEquals(100, a.balance);
        assertTrue(command.success);

        command = new Exercise.Command(Exercise.Command.Action.WITHDRAW, 50);
        a.process(command);

        assertEquals(50, a.balance);
        assertTrue(command.success);

        command = new Exercise.Command(Exercise.Command.Action.WITHDRAW, 150);
        a.process(command);

        assertEquals(50, a.balance);
        assertFalse(command.success);
    }
}