import oop.upcasting.Employee;
import oop.upcasting.Salesman;

/*
Quando uma classe é instanciada através de upcasting (uma sub-classe é
armazenada como sua super-classe) seus atributos ficam inacessíveis. Porém, é
possível acessar esses atributos através do Polimorfismo de sub tipagem.
Esse conceito, utiliza o polimorfismo para sobreescrever um método da super
classe, e assim o utilizar para acessar os atributos da sub-classe (vide
classes Employee e Salesman).
 */
void main() {

    Employee e2 = new Salesman();
    e2.work();
}