package cz.sda.adapter;

public class Person {
    String name;
    String familyName;

    public Person(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }
}
