package cz.sda.singleton;

import java.util.List;

public interface PeopleService {

    int getCount();

    List<String> getPeople();

    void add(String name);
}
