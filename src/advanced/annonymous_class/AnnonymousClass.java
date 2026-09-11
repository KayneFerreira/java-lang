/*
    Classes anônimas instanciam e sobrescrevem comportamentos de uma classe ou
    interface no próprio local onde ela é usada, sem a necessidade de criar um
    arquivo .java separado ou nomear uma nova classe. Útil quando você precisa de
    uma classe que será usada uma única vez naquele trecho de código. Elas permitem
    alterar o comportamento de um método de uma classe existente apenas para aquela
    instância específica. Elas também evitam poluir o projeto com dezenas de
    pequenas classes que não têm utilidade em nenhum outro lugar.

    (Nota: Para interfaces com apenas um método, as lambdas substituíram a maioria
    dos casos de uso das classes anônimas por serem bem menos verbosas).
 */
void main() {

    // Criando e instanciando a classe anônima
    Runnable tarefa = new Runnable() {
        @Override
        public void run() {
            System.out.println("Executando o método da classe anônima diretamente!");
        }
    };

    tarefa.run();


    /*
    Uma das vantagens das classes anônimas comparadas com lambdas, é a
    possibilidade de comportar múltiplos métodos em seu corpo.
     */
    EventListenerTest listener = new EventListenerTest() {
        @Override
        public void onClick() {
            System.out.println("Botão clicado!");
        }

        @Override
        public void onPressAndHold() {
            System.out.println("Botão pressionado!");
        }
    };

    listener.onClick();
    listener.onPressAndHold();

}

interface EventListenerTest {
    void onClick();
    void onPressAndHold();
}