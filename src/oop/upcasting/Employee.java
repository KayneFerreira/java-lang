package oop.upcasting;

public class Employee {

    private String name;

    public void work() {
        System.out.println("Funcionário trabalhando! Nome: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
