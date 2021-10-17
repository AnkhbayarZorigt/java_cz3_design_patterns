package cz.sda.singleton;

import java.util.ArrayList;
import java.util.List;

public class LazyPeopleService implements PeopleService {

    private static PeopleService INSTANCE;

    private int count;
    private List<String> people;

    public static PeopleService getInstance() {
        return INSTANCE == null
                ? INSTANCE = new LazyPeopleService()
                : INSTANCE;
    }

    private LazyPeopleService() {
        this.people = new ArrayList<>();
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public List<String> getPeople() {
        return people;
    }

    public void add(String name) {
        people.add(name);
        count++;
    }
}
