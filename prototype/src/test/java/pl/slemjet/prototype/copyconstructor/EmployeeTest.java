package pl.slemjet.prototype.copyconstructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class EmployeeTest {

    @Test
    public void testCopy() {
        Employee john = new Employee("John",
                new Address("123 London Road", "London", "UK"));

        //Employee chris = john;
        Employee chris = new Employee(john);

        chris.name = "Chris";
        System.out.println(john);
        System.out.println(chris);

        assertNotEquals(john, chris);
    }
}