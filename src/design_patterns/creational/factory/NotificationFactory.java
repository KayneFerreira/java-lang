package design_patterns.creational.factory;

import design_patterns.creational.factory.services.EmailNotification;
import design_patterns.creational.factory.services.Notification;
import design_patterns.creational.factory.services.SmsNotification;

public class NotificationFactory {

    public static Notification createNotification(String type) {
        if (type == null || type.isBlank()) {
            return null;
        }

        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            default -> throw new IllegalArgumentException("Tipo desconhecido: " + type);
        };
    }
}
