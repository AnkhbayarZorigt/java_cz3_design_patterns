package cz.sda.builder;

public class Person {
    private String fullName;
    private Address address;

    public Person(String fullName, Address address) {
        this.fullName = fullName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person " + fullName + " lives at:\n" + address;
    }
}
