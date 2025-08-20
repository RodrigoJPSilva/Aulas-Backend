package heranca;

public class MainEletricista {
    public static void main(String[] args) {
        Contador cont = new Contador("Danilo", 20.00,"ashuash", 1 );
        System.out.println(cont.calculoSalario(2000));

        Eletricista elet = new Eletricista("Daniela", 500.00, "530.201.5rg", true);
        System.out.println(elet.calculoSalario(2000));

    }

}
