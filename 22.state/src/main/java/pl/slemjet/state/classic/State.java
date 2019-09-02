package pl.slemjet.state.classic;

public class State {

    void on(LightSwitch lightSwitch) {
        System.out.println("Light is already on");
    }

    void off(LightSwitch lightSwitch) {
        System.out.println("Light is already off");
    }
}
