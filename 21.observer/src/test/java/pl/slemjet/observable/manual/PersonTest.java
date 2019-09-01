package pl.slemjet.observable.manual;



import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class PersonTest {
    @Test
    void test() {

        Person person = new Person();
        Observer<Person> personObserver = new PersonObserver();
        person.subscribe(personObserver);

        IntStream.rangeClosed(10, 15).boxed().forEach(integer -> person.setAge(integer));
    }
}