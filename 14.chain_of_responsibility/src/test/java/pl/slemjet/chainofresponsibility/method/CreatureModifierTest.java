package pl.slemjet.chainofresponsibility.method;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;

@Log
class CreatureModifierTest {

    @Test
    void test() {
        Creature goblin = new Creature("goblin", 5, 5);
        log.info(String.format("Created %s", goblin));

        CreatureModifier rootGoblinModifier = new CreatureModifier(goblin);
        rootGoblinModifier.add(new DoubleCreatureAttackModifier(goblin));
        rootGoblinModifier.add(new IncreaseCreatureDefenceModifier(goblin));
        rootGoblinModifier.handle();

        log.info(String.format("After modifiers %s", goblin));

        Creature ork = new Creature("ork", 10, 10);
        log.info(String.format("Created %s", ork));

        CreatureModifier rootOrkModifier = new CreatureModifier(goblin);
        rootOrkModifier.add(new DebufCreatureModifier(ork));
        rootOrkModifier.add(new DoubleCreatureAttackModifier(ork));
        rootOrkModifier.add(new IncreaseCreatureDefenceModifier(ork));
        rootOrkModifier.handle();

        log.info(String.format("After modifiers %s", ork));
    }
}