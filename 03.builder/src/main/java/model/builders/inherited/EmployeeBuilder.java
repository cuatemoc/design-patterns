package model.builders.inherited;

public class EmployeeBuilder extends PersonBuilderInherited<EmployeeBuilder> {

    public EmployeeBuilder position(String position) {
        person.setPosition(position);
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
