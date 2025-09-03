package abstracao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SerVivo dogao =  new Cachorro();
        SerVivo dora =  new Humano();
        SerVivo cachogato =  new Gato();

        dogao.respirar();

        dogao.getCor(Cores.AZUL);

        for (Cores cor : Cores.values()) {
            System.out.println(cor.getI());
        }

        List<Cachorro> lisDogs =  new ArrayList<Cachorro>();
        lisDogs.add(new Cachorro());
        lisDogs.add(new Cachorro());

        List<SerVivo> list = new ArrayList<SerVivo>();
        list.add(new Humano());
        list.add(new Gato());
        list.add(new Cachorro());
    }
}
