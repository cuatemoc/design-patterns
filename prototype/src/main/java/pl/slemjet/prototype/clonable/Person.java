package pl.slemjet.prototype.clonable;

import java.util.Arrays;

public class Person implements Cloneable {
    public String[] names;
    public Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return new Person(
                // clone() creates a shallow copy!
                /*names */ names.clone(),

                // fixes address but not names
                /*address */ // (Address) address.clone()
                address instanceof Cloneable ? (Address) address.clone() : address
        );
    }
}