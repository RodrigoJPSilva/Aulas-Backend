package contaAbstrata;

public class Poupanca extends Conta{
    public Poupanca(String agencia, String titular, double saldo, int numero) {
        super(agencia, titular, saldo, numero);
    }

    @Override
    void calcularTarifaMensal() {
    }
}
