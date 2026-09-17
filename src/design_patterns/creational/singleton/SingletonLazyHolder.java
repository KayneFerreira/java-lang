package design_patterns.creational.singleton;

/**
 * Bill Pugh Singleton Method:
 * Na abordagem com classe interna estática (Bill Pugh Singleton), a instância só é criada quando o método getInstance()
 * é chamado explicitamente, pois a JVM carrega a classe interna InstanceHolder apenas nesse momento. Isso une o melhor
 * dos dois mundos: garante a alocação sob demanda (Lazy) e a segurança entre threads (Thread-safe) nativa da JVM, sem a
 * necessidade de sincronização explícita com synchronized, tornando-a a forma mais recomendada em Java tradicional.
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        private static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }

}
