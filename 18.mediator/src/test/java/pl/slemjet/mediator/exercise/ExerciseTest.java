package pl.slemjet.mediator.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {
    @Test
    void test() {
        Exercise.Mediator mediator = new Exercise.Mediator();
        Exercise.Participant p1 = new Exercise.Participant(mediator);
        Exercise.Participant p2 = new Exercise.Participant(mediator);

        assertEquals(0, p1.value);
        assertEquals(0, p2.value);

        p1.say(2);

        assertEquals(0, p1.value);
        assertEquals(2, p2.value);

        p2.say(4);

        assertEquals(4, p1.value);
        assertEquals(2, p2.value);
    }
}