package pl.slemjet.chainofresponsibility.brokerchain;

import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    void test() {

        Game game = new Game();
        Creature goblin = new Creature(game,
                "Strong Goblin", 2, 2);

        System.out.println(goblin);

        // modifiers can be piled up
        IncreasedDefenseModifier icm = new IncreasedDefenseModifier(game, goblin);

        try (DoubleAttackModifier dam
                     = new DoubleAttackModifier(game, goblin)) {
            System.out.println(goblin);
        }

        System.out.println(goblin);
    }
}