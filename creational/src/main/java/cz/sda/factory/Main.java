package cz.sda.factory;

import cz.sda.factory.service.FileFactory;
import cz.sda.factory.service.NotificationService;
import cz.sda.factory.service.NotificationServiceFactory;

public class Main {
    public static void main(String[] args) {
        NotificationServiceFactory factory = new FileFactory("output.log");
        NotificationService service = factory.create();

        service.sendNotification("Hello there");
    }
}
