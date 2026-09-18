package design_patterns.creational.factory.services;

public class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("SMS Enviado: " + message);
    }
}
