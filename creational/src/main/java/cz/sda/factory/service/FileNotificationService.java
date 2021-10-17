package cz.sda.factory.service;

import java.io.FileWriter;
import java.io.IOException;

public class FileNotificationService implements NotificationService {

    private String fileName = "out.txt";

    @Override
    public void sendNotification(String message) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
