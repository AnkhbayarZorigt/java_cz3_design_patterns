package cz.sda.prototype.service;

public class DbConnection {

    private final String connection;

    public DbConnection(String connection) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.connection = connection;
    }

    @Override
    public String toString() {
        return "DbConnection:" + connection;
    }
}
