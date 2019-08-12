package pl.slemjet.proxy.property;

import org.junit.jupiter.api.Test;

class CreatureTest {

    @Test
    void test() {
        Creature c = new Creature();
        c.setAgility(12);
        System.out.println(c);
    }
}