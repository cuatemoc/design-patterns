package pl.slemjet.mediator.observable;

import org.junit.jupiter.api.Test;

class EventBrokerTest {
    @Test
    void test() {
        EventBroker broker = new EventBroker();

        Player player1 = new Player(broker, "Ronaldo");
        Player player2 = new Player(broker, "Beckham");
        new Coach(broker);

        player1.score();
        player2.score();
        player1.score();
    }
}