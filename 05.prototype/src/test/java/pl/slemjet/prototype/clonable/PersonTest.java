package pl.slemjet.prototype.clonable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Person john = new Person(new String[]{"John", "Smith"},
                new Address("London Road", 123));

        // shallow copy, not good:
        //Person jane = john;

        // jane is the girl next door
        Person jane = (Person) john.clone();
        jane.names[0] = "Jane"; // clone is (originally) shallow copy
        jane.address.houseNumber = 124; // oops, also changed john

        System.out.println(john);
        System.out.println(jane);

        assertNotEquals(john, jane);
    }
}