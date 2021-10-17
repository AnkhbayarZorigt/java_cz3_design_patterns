package cz.sda.prototype.service;

public class PeopleService implements Cloneable {
    private DbConnection dbConnection;
    private String dbName;

    public PeopleService(DbConnection dbConnection, String dbName) {
        this.dbConnection = dbConnection;
        this.dbName = dbName;
    }

    public void save(String fullName) {
        System.out.println("I'm saving " + fullName + " into database: " + dbName + " at: " + dbConnection);
    }

    void setDbConnection(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    void setDbName(String dbName) {
        this.dbName = dbName;
    }

    PeopleService createClone() throws CloneNotSupportedException {
        return (PeopleService) clone();
    }
}
