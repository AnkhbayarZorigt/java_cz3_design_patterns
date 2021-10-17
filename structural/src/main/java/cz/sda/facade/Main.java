package cz.sda.facade;

public class Main {
    public static void main(String[] args) {
        var travelAgency = new TravelAgency(
                "CK Šamorín",
                new AirLines("Air Hungary"),
                new Hotel("Plaza"));
        travelAgency.bookTrip("Frank Castle");
    }
}
