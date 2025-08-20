package animal;

public class Gato extends Animal {
    public Gato(String nome, String cor, int tamanho) {
        super(nome, cor, tamanho);
    }
    @Override
    public void fazerSom() {
        super.fazerSom();
        System.out.println("Miauuuuuu");
    }
}
