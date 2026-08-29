package oop.upcasting;

public class Salesman extends Employee {

    public final int id = 1;

    @Override
    public void work() {
        System.out.println("Vendedor trabalhando! ID: " + id);
    }

    public int getId() {
        return id;
    }

}
