package design_patterns.behavioral.strategy.shipping;

public class Shipping {

    private ShippingMethod strategy;

    // O construtor garante que o contexto nunca seja criado em um estado inválido (sem uma estratégia padrão)
    public Shipping(ShippingMethod strategy) {
        this.strategy = strategy;
    }

    // O setter impede a criação de novas instâncias sempre que a estratégia precisar ser alterada
    public void setStrategy(ShippingMethod strategy) {
        this.strategy = strategy;
    }

    // Chama o método calculate de acordo com a estratégia selecionada
    public double calculate(double weight) {
        return strategy.calculate(weight);
    }

}
