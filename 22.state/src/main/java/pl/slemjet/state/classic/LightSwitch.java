package pl.slemjet.state.classic;

public class LightSwitch {

    private State state = new OffState();

    public void setState(State state) {
        this.state = state;
    }

    public void on() {
        state.on(this);
    }

    public void off() {
        state.off(this);
    }
}
