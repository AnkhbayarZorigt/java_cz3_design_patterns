package cz.sda.facade;

// toto je nasa "facade"
public class TravelAgency {

    private final String name;
    private final AirLines airLines;
    private final Hotel hotel;

    public TravelAgency(String name, AirLines airLines, Hotel hotel) {
        this.name = name;
        this.airLines = airLines;
        this.hotel = hotel;
    }

    public void bookTrip(String person) {
        System.out.println("Buying trip for " + person + " by " + name);
        System.out.println("### Begin transaction ###");
        airLines.bookFlight(person);
        hotel.bookRoom(person);
        System.out.println("###  End transaction  ###");
    }
}
