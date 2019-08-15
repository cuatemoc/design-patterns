package pl.slemjet.chainofresponsibility.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {

    @Test
    void test() {
        Exercise.Game game = new Exercise.Game();

        Exercise.Goblin goblin = new Exercise.Goblin(game);

        game.creatures.add(goblin);

        assertEquals(1, goblin.getAttack());
        assertEquals(1, goblin.getDefense());
    }

    @Test
    void test2() {

            Exercise.Game game = new Exercise.Game();
            Exercise.Goblin goblin = new Exercise.Goblin(game);
            game.creatures.add(goblin);

            assertEquals(1, goblin.getAttack());
            assertEquals(1, goblin.getDefense());

            Exercise.Goblin goblin2 = new Exercise.Goblin(game);
            game.creatures.add(goblin2);

            assertEquals(1, goblin.getAttack());
            assertEquals(2, goblin.getDefense());

            Exercise.GoblinKing goblin3 = new Exercise.GoblinKing(game);
            game.creatures.add(goblin3);

            assertEquals(2, goblin.getAttack());
            assertEquals(3, goblin.getDefense());
        }

}