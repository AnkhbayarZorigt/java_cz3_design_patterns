package cz.sda.composite;

import java.util.ArrayList;
import java.util.List;

public class CEO extends Employee {

    private final List<Employee> subordinates;

    public CEO(String name) {
        super(name);
        subordinates = new ArrayList<>();
    }

    @Override
    public void setSuperior(Employee e) {

    }

    @Override
    public void add(Employee e) {
        subordinates.add(e);
        e.setSuperior(this);
    }

    @Override
    public void remove(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public void moveToSuperior(Employee e, Employee s) {
        subordinates.remove(e);
        s.add(e);
    }

    @Override
    public void printSubordinates() {
        System.out.println(name);
        subordinates.forEach(Employee::printSubordinates
        );
    }

    @Override
    public void printSuperiors() {
        System.out.println(name);
    }

    @Override
    public int getLevel() {
        return 0;
    }
}
