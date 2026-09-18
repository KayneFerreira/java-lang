package oop.abstract_classes;

/*
 * Classes abstratas servem como um modelo base para outras classes e não podem ser instanciadas diretamente. Elas
 * podem conter atributos e métodos como outras classes, assim como métodos abstratos (sem corpo) que obrigam sua
 * implementação, como acontece com interfaces.
 */
public abstract class AbstractClass {

    public String name;
    public int age;

    // Método abstrato
    public abstract void printUser();

    // Método concreto
    public void logIn() {
        System.out.println("Usuário logado: " + name);
    }
}
