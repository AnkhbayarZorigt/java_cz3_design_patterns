package cz.sda.prototype.service;

public class PeopleServiceManager {

    private final PeopleService baseService;

    public PeopleServiceManager(String connection) {
        baseService = new PeopleService(new DbConnection(connection), "");
    }

    public PeopleService createPeopleService(String dbName) {
        PeopleService newService = null;
        try {
            newService = baseService.createClone();
            newService.setDbName(dbName);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newService;
    }
}
