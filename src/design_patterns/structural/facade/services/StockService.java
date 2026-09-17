package design_patterns.structural.facade.services;

public class StockService {
    public boolean holdItems(String clientId) {
        System.out.println("1. Itens reservados no estoque para " + clientId);
        return true;
    }
}