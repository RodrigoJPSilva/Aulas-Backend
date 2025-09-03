package abstracao;

abstract class SerVivo {

    private Cores cor;
    private double peso;

    public Cores getCor(Cores cor) {
        return cor;
    }

    public void setCor(Cores cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    abstract void respirar();
}
