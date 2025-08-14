package herancaDomestica;

public class Microondas {
    private int numCrea;

    public Microondas(String nome, String cor, int tensao, Double preco, int numCrea) {
        super(nome, cor, tensao, preco, numCrea);
        this.numCrea = numCrea;
    }
    public int getNumCrea() {
        return numCrea;
    }

    public void setNumCrea(int numCrea) {
        this.numCrea = numCrea;
    }
}
