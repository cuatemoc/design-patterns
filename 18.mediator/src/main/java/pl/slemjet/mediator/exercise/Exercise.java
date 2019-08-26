package pl.slemjet.mediator.exercise;

import io.reactivex.Observable;
import io.reactivex.Observer;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

    static class Participant {
        Mediator mediator;
        public int value = 0;

        public Participant(Mediator mediator) {
            this.mediator = mediator;
            mediator.filter(valueNotificationEvent -> !valueNotificationEvent.participant.equals(this))
                    .subscribe(notificationEvent -> this.value += notificationEvent.value);
        }

        public void say(int n) {
            mediator.publish(new Mediator.ValueNotificationEvent(this, n));
        }
    }

    static class Mediator extends Observable<Mediator.ValueNotificationEvent> {
        List<Observer> observers = new ArrayList<>();

        @Override
        protected void subscribeActual(Observer<? super ValueNotificationEvent> observer) {
            observers.add(observer);
        }

        public void publish(ValueNotificationEvent event) {
            observers.forEach(observer -> observer.onNext(event));
        }

        @Data
        @AllArgsConstructor
        static
        class ValueNotificationEvent {
            private Participant participant;
            private int value;
        }
    }
}
