package pl.slemjet.chainofresponsibility.method;

public class CreatureModifier implements Modifier {

    protected Creature creature;
    private Modifier next;

    public CreatureModifier(Creature creature) {
        this.creature = creature;
    }

    @Override
    public void add(Modifier modifier) {
        if (next == null)
            next = modifier;
        else next.add(modifier);
    }

    @Override
    public void handle() {
        if (next != null)
            next.handle();
    }
}
