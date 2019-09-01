package pl.slemjet.observable.manual;

public class Person extends Observable<Person> {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age == this.age)
            return;
        this.age = age;
        propertyChanged(this, "age", age);
    }
}
