package veiculos;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo ,String cor) {
        super(marca, modelo,cor);
    }
    @Override
    public void iniciar() {
        System.out.println("Carro está iniciando...");
    }

}
