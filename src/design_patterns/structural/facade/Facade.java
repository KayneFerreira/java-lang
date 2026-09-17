import design_patterns.structural.facade.services.*;
import design_patterns.structural.facade.OrderFacade;

/**
 * O Facade é um padrão de projeto estrutural que fornece uma interface simplificada e unificada para uma biblioteca,
 * framework ou conjunto complexo de classes (um subsistema). Ele é uma classe "fachada" que agrupa a chamada de vários
 * outros objetos em uma única função.
 * Seu propósito é esconder a complexidade técnica e as múltiplas dependências de um sistema atrás de um "painel de
 * controle" simples e fácil de usar, reduzindo o acoplamento entre quem chama o serviço e como ele realmente funciona
 * internamente. Ele evita que seja preciso instanciar e chamar múltiplas classes diferentes na ordem correta em vários
 * lugares do sistema. 
 */
void main() {
    String clientId = "USR-123";

    // =========================================================================
    // SEM FACADE
    // Quem chama precisa instanciar, conhecer e ordenar todas as classes
    // =========================================================================
    System.out.println("--- Sem Facade ---");
    StockService stock = new StockService();
    PaymentService payment = new PaymentService();
    ShipmentService shipment = new ShipmentService();

    boolean stockOk = stock.holdItems(clientId);
    if (stockOk) {
        boolean paid = payment.processPayment(clientId, 150.0);
        if (paid) {
            shipment.generateOrder(clientId);
            System.out.println("Pedido finalizado com sucesso!");
        }
    }

    // =========================================================================
    // COM FACADE
    // A complexidade das 3 classes e da ordem de chamada fica escondida
    // =========================================================================
    System.out.println("\n--- Com Facade ---");
    OrderFacade orderFacade = new OrderFacade();
    boolean success = orderFacade.checkout(clientId, 150.0);

    if (success) System.out.println("Pedido finalizado com sucesso!");

}
