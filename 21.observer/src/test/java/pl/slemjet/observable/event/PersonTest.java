package pl.slemjet.observable.event;

import org.junit.jupiter.api.Test;

class PersonTest {
    @Test
    void test() {

        Person person = new Person();
        Event<PropertyChangedEventArgs>.Subscription sub =
                person.propertyChanged.addHandler(x -> {
                    System.out.println("Person's "
                            + x.propertyName + " has changed to " + x.value.toString());
                });
        person.setAge(17);
        person.setAge(18);
        sub.close();
        person.setAge(19);
    }
}