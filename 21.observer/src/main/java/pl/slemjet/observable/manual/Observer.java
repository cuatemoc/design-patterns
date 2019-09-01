package pl.slemjet.observable.manual;

interface Observer<T> {

    void handle(PropertyChangedEventArgs<T> args);
}
