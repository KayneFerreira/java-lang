package design_patterns.structural.facade;

import design_patterns.structural.facade.services.*;

/**
 * Os serviços são instanciados no construtor da classe Facade, a qual possui um método que executa os processos e
 * devolve um boolean certificando que nenhum processo falhou durante a execução.
 */
public class OrderFacade {
    private final StockService stockService;
    private final PaymentService paymentService;
    private final ShipmentService shipmentService;

    public OrderFacade() {
        this.stockService = new StockService();
        this.paymentService = new PaymentService();
        this.shipmentService = new ShipmentService();
    }

    public boolean checkout(String clientId, double price) {
        if (!stockService.holdItems(clientId)) {
            return false;
        }

        if (!paymentService.processPayment(clientId, price)) {
            return false;
        }

        shipmentService.generateOrder(clientId);
        return true;
    }
}