package herancaDomestica;

public class Batedeira extends Eletrodomestico {
    private int velocidade;

    public Batedeira(String nome, String cor, int tensao, Double preco, int velocidade) {
        super(nome, cor, tensao, preco);
        this.velocidade = velocidade;
    }
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
