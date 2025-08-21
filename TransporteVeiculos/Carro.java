package TransporteVeiculos;

public class Carro extends Veiculo {

    public Carro(String modelo) {
        super(modelo);
    }
    public void calcularTempo(float distancia) {
        super.calcularTempo(distancia, 20.00f);
    }
}
