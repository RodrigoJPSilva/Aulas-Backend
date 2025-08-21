package TransporteVeiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;

        System.out.println("Digite o numero para selecionar um dos seguintes veículos:" +
                "\n1-Carro\n2-Onibus\n3-Bicicleta");
        escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                Carro carro = new Carro("Carro");
                System.out.println("Carro selecionado para uma corrida de 80Km\n" +
                        "Insira a distância a ser percorrida");
                carro.calcularTempo(100.00f);
                break;
            case 2:
                Onibus onibus = new Onibus("Onibus", 5);
                System.out.println("Carro selecionado para uma corrida de 80Km\n" +
                        "Insira a distância a ser percorrida");
                onibus.calcularTempo(100.00f);
                break;
            case 3:
                Bicicleta bicicleta = new Bicicleta("Bicicleta");
                System.out.println("Carro selecionado para uma corrida de 80Km\n" +
                        "Insira a distância a ser percorrida");
                bicicleta.calcularTempo(100.00f);
                break;
        }

    }


}
