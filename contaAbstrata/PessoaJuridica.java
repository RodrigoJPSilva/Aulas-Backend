package contaAbstrata;

public class PessoaJuridica extends Conta{
    double saldo;

    public PessoaJuridica(String agencia, String titular, double saldo, int numero) {
        super(agencia, titular, saldo, numero);
    }

    @Override
    void calcularTarifaMensal() {
        saldo = getSaldo();
        System.out.println("Tarifa mensal: R$20,00");
        saldo -= 20.00;
        System.out.println("Saldo após tarifa: R$" + saldo);
    }

    @Override
    public void sacar(double valor) {
        valor += 1.50;
        System.out.println("Taxa adicional: R$1,50");
        super.sacar(valor);
    }
}
