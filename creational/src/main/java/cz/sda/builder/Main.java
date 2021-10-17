package cz.sda.builder;

public class Main {
    public static void main(String[] args) {
        var address = Address.builder()
                .city("LA")
                .street("Malibu Point")
                .number(10880)
                .zip("90265")
                .state("USA")
                .build();
        var person = new Person("Tony Stark", address);
        System.out.println(person);
    }
}
