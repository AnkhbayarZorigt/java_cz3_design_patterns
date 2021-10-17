package cz.sda.factory.service;

public class ConsoleFactory implements NotificationServiceFactory {
    @Override
    public NotificationService create() {
        return new ConsoleNotificationService();
    }
}
