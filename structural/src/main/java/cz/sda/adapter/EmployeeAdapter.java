package cz.sda.adapter;

public class EmployeeAdapter implements Employee {

    private Person person;

    public EmployeeAdapter(Person person) {
        this.person = person;
    }

    @Override
    public String getFullName() {
        return person.getName() + " " + person.getFamilyName();
    }
}
