package pl.slemjet.observable.manual;

public class PropertyChangedEventArgs<T> {

    T source;
    String propertyName;
    Object newValue;

    public PropertyChangedEventArgs(T source, String propertyName, Object newValue) {
        this.source = source;
        this.propertyName = propertyName;
        this.newValue = newValue;
    }
}
