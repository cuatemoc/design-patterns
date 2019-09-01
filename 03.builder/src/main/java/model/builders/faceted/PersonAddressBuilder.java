package model.builders.faceted;

import model.Person;

public class PersonAddressBuilder extends PersonBuilderFaceted {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder city(String city) {
        person.setCity(city);
        return this;
    }

    public PersonAddressBuilder streetAddress(String streetAddress) {
        person.setStreetAddress(streetAddress);
        return this;
    }

    public PersonAddressBuilder postCode(String postCode) {
        person.setPostCode(postCode);
        return this;
    }
}
