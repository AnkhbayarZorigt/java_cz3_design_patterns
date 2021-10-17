package cz.sda.proxy;

import java.time.Duration;
import java.time.Year;

public class Movie {
    private final Year releaseYear;
    private final String name;
    private final Duration duration;

    public Movie(Year releaseYear, String name, Duration duration) {
        this.releaseYear = releaseYear;
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name + "(" + releaseYear + ") " + duration.toString().substring(2);
    }
}
