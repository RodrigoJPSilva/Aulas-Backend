package TransporteVeiculos;

public abstract class Veiculo {
    private String modelo;
    private float tempo;
    private int escolha;

    public void escolha() {
        this.escolha = escolha;
    }

    public Veiculo(String modelo) {
        super();
        this.modelo = modelo;
    }

    public void calcularTempo(float distancia, float velocidade) {
        tempo = distancia / velocidade;
        System.out.println("Tempo estimado para sua viagem: " + tempo + " Horas");
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
