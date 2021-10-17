package cz.sda.singleton;

import java.util.ArrayList;
import java.util.List;

public enum EnumPeopleService implements PeopleService {
    INSTANCE;

    private final List<String> people = new ArrayList<>();

    public static PeopleService getInstance() {
        return INSTANCE;
    }

    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public List<String> getPeople() {
        return people;
    }

    @Override
    public void add(String name) {
        people.add(name);
    }
}
