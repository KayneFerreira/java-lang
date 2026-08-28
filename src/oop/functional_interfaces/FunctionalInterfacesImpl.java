package oop.functional_interfaces;

/*
As classes que implementam uma interface funcional (ou as lambdas que a
fornecem) não são obrigadas a implementar ou sobrescrever os métodos concretos
(default ou static). Métodos default já possuem uma implementação padrão pronta
na própria interface. A classe só sobrescreve se quiser alterar o
comportamento. Métodos static pertencem à interface, não às instâncias. Eles
não podem ser sobrescritos.
 */
public class FunctionalInterfacesImpl implements FunctionalInterfaces {

    // Método abstrato obrigatório
    @Override
    public void execute() {
        System.out.println("Executando método abstrato da interface funcional!");
    }

    // Método de interface sobrescrito
    @Override
    public void log(String msg) {
        System.out.println("Log override: " + msg);
    }

    /*
    Métodos estáticos de interfaces não são herdados pelas classes que a
    implementam, pois o mesmo pertence exclusivamente ao escopo da interface.
    Ele não faz parte do contrato de herança da classe. O método a seguir,
    apesar de possuir o mesmo nome, assinatura e corpo, é totalmente distinto e
    independente do método da interface funcional.
     */
    static boolean isValid(String text) {
        return text != null && !text.isEmpty();
    }
}
