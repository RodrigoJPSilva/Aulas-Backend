package TransporteVeiculos;

public class Onibus extends Veiculo {
    private int numero_paradas;
    private float tempo_total;

    public Onibus(String modelo, int numero_paradas) {
        super(modelo);
        this.numero_paradas = numero_paradas;
        System.out.println("Modelo: " + modelo);
    }

    public int getNumero_paradas() {
        return numero_paradas;
    }

    public void setNumero_paradas(int numero_paradas) {
        this.numero_paradas = numero_paradas;
    }
    
    public void calcularTempo(float distancia) {
        super.calcularTempo(distancia, 60);
        tempo_total = super.getTempo() * 0.25f;
        System.out.println("Tempo Com paradas: " + tempo_total + " Horas");
    }
}
