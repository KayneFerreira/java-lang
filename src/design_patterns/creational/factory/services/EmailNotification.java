package design_patterns.creational.factory.services;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Email enviado: " + message);
    }
}
