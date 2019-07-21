package model.builders.inherited;

import model.Person;

public class PersonBuilderInherited<SELF extends PersonBuilderInherited<SELF>> {
    protected Person person = new Person();

    public SELF name(String name) {
        person.setName(name);
        return self();
    }

    public Person build() {
        return person;
    }

    protected SELF self() {
        return (SELF) this;
    }
}
