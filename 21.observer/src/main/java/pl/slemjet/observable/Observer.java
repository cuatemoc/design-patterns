package pl.slemjet.observable;

interface Observer<T> {

    void handle(PropertyChangedEventArgs<T> args);
}
