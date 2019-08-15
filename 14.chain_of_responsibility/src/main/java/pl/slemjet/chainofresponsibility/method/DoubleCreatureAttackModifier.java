package pl.slemjet.chainofresponsibility.method;

import lombok.extern.java.Log;

@Log
public class DoubleCreatureAttackModifier extends CreatureModifier {

    public DoubleCreatureAttackModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        log.info(String.format("Doubling %s attack", creature.getName()));
        creature.setAttack(creature.getAttack() * 2);
        super.handle();
    }
}
