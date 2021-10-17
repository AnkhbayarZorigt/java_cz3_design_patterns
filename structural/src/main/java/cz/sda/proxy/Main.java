package cz.sda.proxy;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        var proxy = new CachingService(new IMDBService());

        List.of("Aladdin", "Lion King", "Pulp Fiction", "Aladdin", "Star Wars", "Lion King", "Terminator 2: Judgment Day", "Aladdin")
                .forEach(movie -> proxy.find(movie).ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Didn't find " + movie)));
    }
}
