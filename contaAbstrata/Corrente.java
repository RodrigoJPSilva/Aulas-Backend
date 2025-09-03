package contaAbstrata;

public class Corrente extends Conta{
    double saldo;
    public Corrente(String agencia, String titular, double saldo, int numero) {
        super(agencia, titular, saldo, numero);
    }
    @Override
    void calcularTarifaMensal() {
        saldo = getSaldo();
        System.out.println("Tarifa mensal: R$12,00");
        saldo -= 12.00;
        System.out.println("Saldo após tarifa: R$" + saldo);
    }
}
