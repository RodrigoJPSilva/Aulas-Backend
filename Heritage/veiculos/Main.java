package veiculos;

public class Main {
    public static void main(String[] args) {
        Carro car = new Carro("Honda", "Civic G10", "Preto");
        car.iniciar();

        Veiculo vei = new Veiculo("Test", "Test", "Preto");
        vei.iniciar();
    }
}
