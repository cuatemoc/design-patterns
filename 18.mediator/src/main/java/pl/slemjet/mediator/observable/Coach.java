package pl.slemjet.mediator.observable;

public class Coach {
    public Coach(EventBroker broker) {
        broker.subscribe(player ->
                System.out.println(String.format(" %s Scored! Total: %s goals!"
                        , player.getName()
                        , player.getGoals())));
    }
}
