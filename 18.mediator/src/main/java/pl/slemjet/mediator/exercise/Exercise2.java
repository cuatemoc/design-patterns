package pl.slemjet.mediator.exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

    class Participant {
        public int value;
        Mediator mediator;

        public Participant(Mediator mediator) {
            this.mediator = mediator;
            mediator.participants.add(this);
        }

        public void say(int n) {
            mediator.broadcast(n, this);
        }

        public void notify(int value) {
            value += value;
        }
    }

    class Mediator {
        List<Participant> participants = new ArrayList<>();

        public void broadcast(int value, Participant sender) {
            participants.stream()
                    .filter(participant -> !participant.equals(sender))
                    .forEach(participant -> participant.notify(value));
        }
    }
}
