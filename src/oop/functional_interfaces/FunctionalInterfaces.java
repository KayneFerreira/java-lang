package oop.functional_interfaces;

/*
Interfaces funcionais são interfaces que possuem apenas um método abstrato
(conhecida como SAM - Single Abstract Method). Ela é anotada (opcionalmente,
mas recomendado) com @FunctionalInterface.
Interfaces funcionais podem conter métodos 'default', 'static' e métodos da
classe 'Object' como equals(), hashCode() e toString().

 - Elas servem como o "tipo" de uma lambda expression ou method reference. Como
só existe um método abstrato, o Java sabe exatamente qual método está sendo
implementado ao ler a sintaxe curta da lambda.

 - Permitem passar comportamentos (funções) como argumentos para métodos.
 */
@FunctionalInterface
public interface FunctionalInterfaces {

    // Único método abstrato (obrigatório para ser funcional)
    void execute();

    // Métodos default (permitidos)
    default void log(String msg) {
        System.out.println("Log: " + msg);
    }

    // Métodos estáticos (permitidos)
    static boolean isValid(String text) {
        return text != null && !text.isEmpty();
    }

    // Método do Object (não conta como método abstrato da interface)
    @Override
    boolean equals(Object obj);

}
