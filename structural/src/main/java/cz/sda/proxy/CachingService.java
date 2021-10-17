package cz.sda.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// toto je nasa "proxy"
public class CachingService implements MovieService {

    private final Map<String, Optional<Movie>> cache = new HashMap<>();
    private final MovieService service;

    public CachingService(MovieService service) {
        this.service = service;
    }

    @Override
    public Optional<Movie> find(String name) {
        return cache.computeIfAbsent(name, service::find);
    }
}
