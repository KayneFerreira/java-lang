package design_patterns.behavioral.strategy.shipping;

public class ExpressShipping implements ShippingMethod {

    @Override
    public double calculate(double weight) {
        return (weight * 2.0) + 10.0;
    }
}
