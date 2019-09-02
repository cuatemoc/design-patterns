package pl.slemjet.state.classic;

public class OffState extends State {

    public OffState() {
        System.out.println("Light is off");
    }

    @Override
    void on(LightSwitch lightSwitch) {
        System.out.println("Turning light on");
        lightSwitch.setState(new OnState());
    }
}
