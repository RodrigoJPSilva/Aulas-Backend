package herancaDomestica;

public class Microondas extends Eletrodomestico{
    private int numCrea;

    public Microondas(String nome, String cor, int tensao, Double preco, int numCrea) {
        super(nome, cor, tensao, preco);
        this.numCrea = numCrea;
    }
    public int getNumCrea() {
        return numCrea;
    }

    public void setNumCrea(int numCrea) {
        this.numCrea = numCrea;
    }
}
