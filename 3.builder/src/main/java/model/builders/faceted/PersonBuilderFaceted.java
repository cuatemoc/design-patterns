package model.builders.faceted;

import model.Person;

public class PersonBuilderFaceted {
    protected Person person = new Person();

    public PersonBuilderFaceted name(String name) {
        person.setName(name);
        return this;
    }

    public PersonAddressBuilder address() {
        return new PersonAddressBuilder(person);
    }

    public PersonJobBuilder job() {
        return new PersonJobBuilder(person);
    }

    public Person build() {
        return person;
    }
}
