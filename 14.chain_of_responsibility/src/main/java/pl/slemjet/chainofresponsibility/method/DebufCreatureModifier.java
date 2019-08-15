package pl.slemjet.chainofresponsibility.method;

import lombok.extern.java.Log;

@Log
public class DebufCreatureModifier extends CreatureModifier {

    public DebufCreatureModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {

        log.info("applying debuff");
    }
}
