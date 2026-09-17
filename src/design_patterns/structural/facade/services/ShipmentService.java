package design_patterns.structural.facade.services;

public class ShipmentService {
    public void generateOrder(String clientId) {
        System.out.println("3. Etiqueta de envio gerada e enviada para a transportadora. Cliente: " + clientId);
    }
}