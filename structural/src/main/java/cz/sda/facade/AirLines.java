package cz.sda.facade;

public class AirLines {
    private final String name;

    public AirLines(String name) {
        this.name = name;
    }

    public void bookFlight(String person) {
        System.out.println("Booking flight for " + person + " by " + name);
    }
}
