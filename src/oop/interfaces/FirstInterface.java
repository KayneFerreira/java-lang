package oop.interfaces;

/*
Interfaces em Java são contratos que definem o que uma classe deve fazer, mas
não como deve fazer. Ela estabelece um conjunto de métodos que as classes
implementadoras são obrigadas a fornecer. Por padrão, interfaces são abstratas.
Variáveis declaradas em uma interface são implicitamente 'public', 'static' e
'final'. Como interfaces definem contratos e abstrações, o Java não permite que
elas possuam variáveis de instância.

 - Permite escrever código genérico focado no comportamento, sem depender da
implementação concreta;
 - O Java não permite herdar de várias classes, mas uma classe pode implementar
múltiplas interfaces;
 - Possibilita tratar objetos totalmente diferentes de forma padronizada, desde
que implementem a mesma interface;
 - Constantes são definidas com relação ao contexto da interface;
 - Uma classe que implementa a interface pode acessar a variável diretamente pelo
nome, mas não pode alterar seu valor.
 */
public interface FirstInterface {

    int DEFAULT_VALUE = 100;    // Definido por padrão como 'public', 'static' e 'final'

    void printFirstInterface();
    double calculateAverage(double inputValue);
}
