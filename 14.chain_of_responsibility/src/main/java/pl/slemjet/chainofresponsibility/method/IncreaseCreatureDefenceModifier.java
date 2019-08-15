package pl.slemjet.chainofresponsibility.method;

import lombok.extern.java.Log;

@Log
public class IncreaseCreatureDefenceModifier extends CreatureModifier {

    public IncreaseCreatureDefenceModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        log.info(String.format("Increasing %s defence", creature.getName()));
        creature.setDefence(creature.getDefence() +3);
        super.handle();
    }
}
