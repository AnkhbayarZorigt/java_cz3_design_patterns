package cz.sda.singleton;

import java.util.ArrayList;
import java.util.List;

public class EagerPeopleService implements PeopleService {

    private static PeopleService INSTANCE = new EagerPeopleService();

    private int count;
    private List<String> people;

    public static PeopleService getInstance() {
        return INSTANCE;
    }

    private EagerPeopleService() {
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
