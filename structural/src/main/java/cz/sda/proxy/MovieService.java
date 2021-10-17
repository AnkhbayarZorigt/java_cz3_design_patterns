package cz.sda.proxy;

import java.util.Optional;

public interface MovieService {
    Optional<Movie> find(String name);
}
