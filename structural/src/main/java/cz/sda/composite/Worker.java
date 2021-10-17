package cz.sda.composite;

public class Worker extends Employee {

    private Employee superior;

    public Worker(String name) {
        super(name);
    }

    @Override
    public void setSuperior(Employee e) {
        this.superior = e;
    }

    @Override
    public void add(Employee e) {

    }

    @Override
    public void remove(Employee e) {

    }

    @Override
    public void moveToSuperior(Employee employee, Employee newSuperior) {

    }

    @Override
    public void printSubordinates() {
        System.out.println("  ".repeat(getLevel()) + "↳ " + name);
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
