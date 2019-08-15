package pl.slemjet.chainofresponsibility.method;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString
@Log
public class Creature {

    private String name;
    private int defence;
    private int attack;

    public Creature(String name, int defence, int attack) {
        this.name = name;
        this.defence = defence;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
