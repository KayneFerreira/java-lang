package design_patterns.behavioral.strategy.shipping;

public class NormalShipping implements ShippingMethod {

    @Override
    public double calculate(double weight) {
        return weight * 1.5;
    }
}
