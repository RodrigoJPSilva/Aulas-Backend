package TransporteVeiculos;

public class Bicicleta extends Veiculo {

    public Bicicleta(String modelo) {
        super(modelo);
    }
    public void calcularTempo(float distancia) {
        super.calcularTempo(distancia, 60);
    }
}
