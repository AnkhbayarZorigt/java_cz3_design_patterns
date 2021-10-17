package cz.sda.factory.service;

public class FileFactory implements NotificationServiceFactory {

    private final String fileName;

    public FileFactory() {
        fileName = null;
    }

    public FileFactory(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public NotificationService create() {
        var service = new FileNotificationService();
        if (fileName != null) {
            service.setFileName(fileName);
        }
        return service;
    }
}
