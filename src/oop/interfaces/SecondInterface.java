package oop.interfaces;

/*
 * A partir da versão 17 do Java, assim como em classes, é possível criar sealed interfaces.
 */
public sealed interface SecondInterface permits InterfaceImpl {

    void printSecondInterface();
    int sumValues(int firstValue, int secondValue);
}
