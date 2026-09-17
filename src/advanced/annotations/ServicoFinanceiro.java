package advanced.annotations;

public class ServicoFinanceiro {

    @RequireAdmin
    public void deleteAccount() {
        System.out.println("-> SUCESSO: Conta deletada do banco!");
    }

    public void checkBalance() {
        System.out.println("-> SUCESSO: Saldo consultado!");
    }
}