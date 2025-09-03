package contaAbstrata;

abstract public class Conta {
    private String agencia;
    private String titular;
    private double saldo;
    private int numero;

    public Conta(String agencia, String titular, double saldo, int numero) {
        this.agencia = agencia;
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract void calcularTarifaMensal();


    public void  depositar(double valor){
        saldo += valor;
        System.out.printf("Foram depositados R$%.2f\n",valor);
        System.out.printf("Saldo atual: R$%.2f\n",saldo);

    }
    public void sacar(double valor){
        saldo -= valor;
        System.out.printf("Foram sacados R$%.2f\n",valor);
        System.out.printf("Saldo atual: R$%.2f\n",saldo);
    }
    public void exibirDados(){
        System.out.printf("Numero: %d \nAgencia: %s \nTitular: %s \nSaldo atual: R$%.2f \n\n",numero,agencia,titular,saldo);
    }
}
