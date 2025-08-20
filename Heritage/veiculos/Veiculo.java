package veiculos;


public class Veiculo {
    private String marca;
    private String modelo;
    private String cor;

    public Veiculo(String marca, String modelo, String cor) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public void iniciar() {
        System.out.println("Veiculo está iniciando...");
    }
}
