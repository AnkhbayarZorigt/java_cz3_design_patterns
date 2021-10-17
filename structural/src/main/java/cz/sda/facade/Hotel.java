package cz.sda.facade;

public class Hotel {
    private final String name;

    public Hotel(String name) {
        this.name = name;
    }

    public void bookRoom(String person) {
        System.out.println("Booking room for " + person + " by " + name);
    }
}
