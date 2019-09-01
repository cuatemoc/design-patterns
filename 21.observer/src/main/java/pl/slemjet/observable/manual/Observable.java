package pl.slemjet.observable.manual;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {

    private List<Observer<T>> observers = new ArrayList<Observer<T>>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    protected void propertyChanged(T source, String propertyName, Object propertyValue) {
        observers.stream().forEach(observer -> {
            observer.handle(new PropertyChangedEventArgs<>(source, propertyName, propertyValue));
        });
    }
}
