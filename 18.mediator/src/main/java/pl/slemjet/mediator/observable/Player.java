package pl.slemjet.mediator.observable;

public class Player {

    private Integer goals = 0;
    private EventBroker broker;
    private String name;

    public Player(EventBroker broker, String name) {
        this.broker = broker;
        this.name = name;
    }

    public Integer getGoals() {
        return goals;
    }

    public String getName() {
        return name;
    }

    public void score(){
        ++goals;
        broker.publish(this);
    }
}
