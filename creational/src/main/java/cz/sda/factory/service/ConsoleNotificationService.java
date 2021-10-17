package cz.sda.factory.service;

public class ConsoleNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
}
