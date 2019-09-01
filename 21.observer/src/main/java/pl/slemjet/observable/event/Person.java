package pl.slemjet.observable.event;

class Person
{
    public Event<PropertyChangedEventArgs>
            propertyChanged = new Event<>();

    private int age;

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        if (this.age == age) return;

        boolean oldCanVote = getCanVote();

        this.age = age;
        propertyChanged.fire(new PropertyChangedEventArgs(
                this, "age", age
        ));

        if (oldCanVote != getCanVote())
        {
            propertyChanged.fire(new PropertyChangedEventArgs(
                    this, "canVote",
                    getCanVote()));
        }
    }

    public boolean getCanVote()
    {
        return age >= 18;
    }
}
