package oop.interfaces;

/*
Em Java, não é possível que uma classe herde de múltiplas classes (herança
múltipla), porém é possível implementar múltiplas interfaces.
 */
public final class InterfaceImpl implements FirstInterface, SecondInterface {

    // Métodos da primeira interface
    @Override
    public void printFirstInterface() {
        System.out.println("Primeira interface: Calcula média");
    }

    @Override
    public double calculateAverage(double inputValue) {
        return inputValue / 3;
    }


    // Métodos da segunda interface
    @Override
    public void printSecondInterface() {
        System.out.println("Segunda interface: Soma dois valores de entrada");
    }

    @Override
    public int sumValues(int firstValue, int secondValue) {
        return 0;
    }

}
