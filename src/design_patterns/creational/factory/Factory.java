import design_patterns.creational.factory.NotificationFactory;
import design_patterns.creational.factory.services.Notification;

/**
 * O Factory Method é um padrão de projeto criacional que tem como objetivo fornecer uma interface para criar objetos
 * em uma classe mãe, mas permitir que as subclasses ou métodos utilitários alterem o tipo de objetos que serão criados.
 */
void main() {

    // Chamadas estáticas do Factory enviando os parâmetros padrões
    Notification notification1 = NotificationFactory.createNotification("email");
    Notification notification2 = NotificationFactory.createNotification("sms");
    notification1.send("Seu pedido foi enviado com sucesso!");
    notification2.send("Seu pedido foi enviado com sucesso!");
}