package pl.slemjet.mediator.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;

import java.util.ArrayList;
import java.util.List;

public class EventBroker extends Observable<Player> {

    List<Observer> observers = new ArrayList<>();

    @Override
    protected void subscribeActual(Observer<? super Player> observer) {
        observers.add(observer);
    }

    public void publish(Player player){
        observers.forEach(observer -> observer.onNext(player));
    }
}
