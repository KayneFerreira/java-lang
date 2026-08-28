package oop.interfaces;

/*
Interfaces em Java são contratos que definem o que uma classe deve fazer, mas
não como deve fazer. Ela estabelece um conjunto de métodos que as classes
implementadoras são obrigadas a fornecer. Por padrão, interfaces são abstratas.

 - Permite escrever código genérico focado no comportamento, sem depender da
implementação concreta.

 - O Java não permite herdar de várias classes, mas uma classe pode implementar
múltiplas interfaces.

 - Possibilita tratar objetos totalmente diferentes de forma padronizada, desde
 que implementem a mesma interface.
 */
public interface FirstInterface {

    void printFirstInterface();
    double calculateAverage(double inputValue);
}
