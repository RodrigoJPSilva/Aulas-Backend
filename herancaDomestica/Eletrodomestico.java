package herancaDomestica;

public class Eletrodomestico {
    private String nome;
    private String cor;
    private int tensao;
    private Double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Eletrodomestico(String nome, String cor, int tensao, Double preco) {
        super();
        this.nome = nome;
        this.cor = cor;
        this.tensao = tensao;
        this.preco = preco;
    }
}
