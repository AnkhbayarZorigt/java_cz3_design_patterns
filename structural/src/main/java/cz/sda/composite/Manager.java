package cz.sda.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    private Employee superior;
    private final List<Employee> subordinates;

    public Manager(String name) {
        super(name);
        this.subordinates = new ArrayList<>();
    }

    @Override
    public void setSuperior(Employee e) {
        this.superior = e;
    }

    @Override
    public void add(Employee e) {
        e.setSuperior(this);
        subordinates.add(e);
    }

    @Override
    public void remove(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public void moveToSuperior(Employee employee, Employee newSuperior) {
        remove(employee);
        newSuperior.add(employee);
    }

    @Override
    public void printSubordinates() {
        System.out.println("  ".repeat(getLevel()) + "↳ " + name);
        subordinates.forEach(Employee::printSubordinates);
    }

    @Override
    public void printSuperiors() {
        superior.printSuperiors();
        System.out.println("    ↓");
        System.out.println(name);
    }

    @Override
    public int getLevel() {
        return superior.getLevel() + 1;
    }
}
