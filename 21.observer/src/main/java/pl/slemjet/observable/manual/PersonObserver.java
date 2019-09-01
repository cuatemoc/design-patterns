package pl.slemjet.observable.manual;

public class PersonObserver implements Observer<Person> {

    @Override
    public void handle(PropertyChangedEventArgs<Person> args) {
        System.out.println(String.format("Person has changed %s to new value: %s", args.propertyName, args.newValue));
    }
}
