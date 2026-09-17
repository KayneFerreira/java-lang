import design_patterns.creational.singleton.*;

/**
 * O Singleton é um padrão de projeto criacional que tem como objetivo garantir que uma determinada classe tenha apenas
 * uma única instância em toda a memória durante a execução do programa, fornecendo um ponto central e global de acesso
 * a ela. Ele é amplamente utilizado para gerenciar recursos compartilhados que seriam prejudicados ou desperdiçados
 * caso existissem múltiplas cópias concorrentes, como pools de conexões com banco de dados, centralizadores de logs,
 * gerenciadores de arquivos de configuração e caches em memória.
 */

void main() {

    var lazy = SingletonLazy.getInstance();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstance();
    System.out.println(lazy);

    var eager = SingletonEager.getInstance();
    System.out.println(eager);
    eager = SingletonEager.getInstance();
    System.out.println(eager);

    var holder = SingletonLazyHolder.getInstance();
    System.out.println(holder);
    holder = SingletonLazyHolder.getInstance();
    System.out.println(holder);
}