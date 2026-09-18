import design_patterns.creational.factory.NotificationFactory;
import design_patterns.creational.factory.services.Notification;

void main() {

    Notification notification1 = NotificationFactory.createNotification("email");
    Notification notification2 = NotificationFactory.createNotification("sms");
    notification1.send("Seu pedido foi enviado com sucesso!");
    notification2.send("Seu pedido foi enviado com sucesso!");
}