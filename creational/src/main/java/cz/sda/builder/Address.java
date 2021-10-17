package cz.sda.builder;

//@Builder // anotacia lomboku na automaticke generovanie kodu pre implementaciu builder patternu
public class Address {
    private String street;
    private Integer number;
    private String city;
    private String zip;
    private String state;
    private String district;
    private String municipality;
    private Integer floor;
    private Integer flatNumber;

    Address(String street, Integer number, String city, String zip, String state, String district, String municipality, Integer floor, Integer flatNumber) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.district = district;
        this.municipality = municipality;
        this.floor = floor;
        this.flatNumber = flatNumber;
    }

    public static AddressBuilder builder() {
        return new AddressBuilder();
    }

    public static class AddressBuilder {
        private String street;
        private Integer number;
        private String city;
        private String zip;
        private String state;
        private String district;
        private String municipality;
        private Integer floor;
        private Integer flatNumber;

        AddressBuilder() {
        }

        public AddressBuilder street(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder number(Integer number) {
            this.number = number;
            return this;
        }

        public AddressBuilder city(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder zip(String zip) {
            this.zip = zip;
            return this;
        }

        public AddressBuilder state(String state) {
            this.state = state;
            return this;
        }

        public AddressBuilder district(String district) {
            this.district = district;
            return this;
        }

        public AddressBuilder municipality(String municipality) {
            this.municipality = municipality;
            return this;
        }

        public AddressBuilder floor(Integer floor) {
            this.floor = floor;
            return this;
        }

        public AddressBuilder flatNumber(Integer flatNumber) {
            this.flatNumber = flatNumber;
            return this;
        }

        public Address build() {
            return new Address(street, number, city, zip, state, district, municipality, floor, flatNumber);
        }

        public String toString() {
            return "Address.AddressBuilder(street=" + this.street + ", number=" + this.number + ", city=" + this.city + ", zip=" + this.zip + ", state=" + this.state + ", district=" + this.district + ", municipality=" + this.municipality + ", floor=" + this.floor + ", flatNumber=" + this.flatNumber + ")";
        }
    }
}
