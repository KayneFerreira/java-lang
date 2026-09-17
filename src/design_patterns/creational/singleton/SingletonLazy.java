package design_patterns.creational.singleton;

/**
 * Lazy Initialization:
 * Na abordagem Lazy, a instância do Singleton só é criada quando o método getInstance() é chamado pela primeira vez, o
 * que economiza memória caso a classe não seja utilizada durante a execução. O ponto negativo é que esse modelo não é
 * thread-safe, permitindo que duas chamadas simultâneas no início criem instâncias diferentes e violem o padrão.
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}
