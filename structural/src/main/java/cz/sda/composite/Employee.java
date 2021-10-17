package cz.sda.composite;

public abstract class Employee {

    protected final String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract void setSuperior(Employee e);

    public abstract void add(Employee e);

    public abstract void remove(Employee e);

    public abstract void moveToSuperior(Employee employee, Employee newSuperior);

    public abstract void printSubordinates();

    public abstract void printSuperiors();

    public abstract int getLevel();
}
