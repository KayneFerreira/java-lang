package design_patterns.creational.singleton;

/**
 * Eager Initialization:
 * Na abordagem Eager, a instância do Singleton é criada imediatamente no momento em que a classe é carregada pela JVM,
 * o que garante thread-safety por padrão graças ao funcionamento seguro do carregamento de classes em Java.
 * Em contrapartida, se a classe for pesada e a aplicação nunca a utilizar durante a execução, haverá um desperdício
 * desnecessário de memória e de recursos do sistema.
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }

}
