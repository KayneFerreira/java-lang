import design_patterns.behavioral.strategy.robot_behaviour.*;
import design_patterns.behavioral.strategy.shipping.*;

/**
 * O Strategy é um padrão de projeto comportamental que isola diferentes algoritmos (ou regras de negócio) em classes
 * separadas que implementam uma mesma interface, tornando-os intercambiáveis.
 * Ele tem o propósito de eliminar o uso de condicionais 'if/else' ou 'switch' que tendem a expandir tanto de forma
 * vertical quanto horizontal, desacoplando o código que decide qual regra usar do código que executa a regra.
 * Isso facilita a manutenção e a criação de novas lógicas sem alterar o código existente (respeitando o princípio
 * Open/Closed).
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

    serviceCost = strategy1.calculate(costPerKg);
    System.out.printf("\nValor do frete regular: R$%.2f\n", serviceCost);

    serviceCost = strategy2.calculate(costPerKg);
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