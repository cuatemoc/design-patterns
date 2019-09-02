package pl.slemjet.state.classic;

public class OnState extends State {

    public OnState() {
        System.out.println("Light is on");
    }

    @Override
    void off(LightSwitch lightSwitch) {
        System.out.println("Turning light off");
        lightSwitch.setState(new OffState());
    }
}
