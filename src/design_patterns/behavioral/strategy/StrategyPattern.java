import design_patterns.behavioral.strategy.robot_behaviour.*;
import design_patterns.behavioral.strategy.shipping.*;

/**
 * O Factory Method é um padrão de projeto criacional que tem como objetivo fornecer uma interface para criar objetos
 * em uma classe mãe, mas permitir que as subclasses ou métodos utilitários alterem o tipo de objetos que serão criados.
 */
void main() {
//    robotBehaviour();
    shippingStrategy();
}


static void shippingStrategy() {

    ShippingMethod strategy1 = new NormalShipping();
    ShippingMethod strategy2 = new ExpressShipping();
    double costPerKg = 5.0;
    double serviceCost;

    Shipping shipping = new Shipping(strategy1);
    serviceCost = shipping.calculate(costPerKg);
    System.out.printf("\nValor do frete regular: R$%.2f\n", serviceCost);

    shipping.setStrategy(strategy2);
    serviceCost = shipping.calculate(costPerKg);
    System.out.printf("\nValor do frete expresso: R$%.2f\n", serviceCost);
}


static void robotBehaviour() {

    Behaviour normal = new NormalBehaviour();
    Behaviour passive = new PassiveBehaviour();
    Behaviour aggressive = new AggressiveBehaviour();

    Robot r1 = new Robot(normal);
    r1.move();
    r1.move();

    r1.setBehaviour(passive);
    r1.move();

    r1.setBehaviour(aggressive);
    r1.move();
    r1.move();
}