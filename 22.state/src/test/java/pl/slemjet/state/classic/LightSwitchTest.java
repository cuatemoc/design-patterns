package pl.slemjet.state.classic;

import org.junit.jupiter.api.Test;

class LightSwitchTest {
    @Test
    void test() {
        LightSwitch lightSwitch = new LightSwitch();

        lightSwitch.off();
        lightSwitch.on();
        lightSwitch.off();
        lightSwitch.off();
    }
}