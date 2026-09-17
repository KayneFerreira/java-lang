package design_patterns.structural.facade.services;

public class PaymentService {
    public boolean processPayment(String clientId, double price) {
        System.out.println("2. Pagamento de R$ " + price + " aprovado para " + clientId);
        return true;
    }
}