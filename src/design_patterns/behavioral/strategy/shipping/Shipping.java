package design_patterns.behavioral.strategy.shipping;

public class Shipping {

    private final ShippingMethod strategy;

    public Shipping(ShippingMethod strategy) {
        this.strategy = strategy;
    }

    public double calculate(double weight) {
        return strategy.calculate(weight);
    }

}
