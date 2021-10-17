package cz.sda.proxy;

import java.time.Duration;
import java.time.Year;
import java.util.Map;
import java.util.Optional;

public class IMDBService implements MovieService {

    private final Map<String, Movie> database = Map.of(
            "Aladdin", new Movie(Year.of(1992), "Aladdin", Duration.ofMinutes(90)),
            "Lion King", new Movie(Year.of(1994), "Lion King", Duration.ofMinutes(88)),
            "Terminator 2: Judgment Day", new Movie(Year.of(1991), "Terminator 2: Judgment Day", Duration.ofMinutes(137))
    );

    @Override
    public Optional<Movie> find(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Optional.ofNullable(database.get(name));
    }
}
