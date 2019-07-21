package pl.slemjet.factory.exerscise.e1;

import java.util.concurrent.atomic.AtomicInteger;

public class Person
{
    public int id;
    public String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

class PersonFactory
{

    private AtomicInteger nextId = new AtomicInteger(0);

    public Person createPerson(String name)
    {
        // todo
        return new Person(nextId.getAndIncrement(), name);
    }
}