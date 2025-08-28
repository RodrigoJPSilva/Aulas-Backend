package sistema_cache;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idDigitado;
        int opcao = 0;
        ArrayList<Pessoa> banco = new ArrayList<>();
        ArrayList<Pessoa> cache = new ArrayList<>();

        banco.add(new Pessoa(1, "João", 25));
        banco.add(new Pessoa(2, "Maria", 30));
        banco.add(new Pessoa(3, "Carlos", 22));
        banco.add(new Pessoa(4, "Ana", 28));
        banco.add(new Pessoa(5, "Pedro", 35));
        banco.add(new Pessoa(6, "Miguel", 25));
        banco.add(new Pessoa(7, "Vinicius", 30));
        banco.add(new Pessoa(8, "Gabriel", 22));
        banco.add(new Pessoa(9, "Ryan", 28));
        banco.add(new Pessoa(10, "Sylas", 35));
        banco.add(new Pessoa(11, "Fiama", 30));

//        cache.add(banco.get(0));
//        cache.add(banco.get(1));
//        cache.add(banco.get(2));
//        cache.add(banco.get(3));
//        cache.add(banco.get(5));
//        cache.add(banco.get(6));
//        cache.add(banco.get(7));
//        cache.add(banco.get(8));
//        cache.add(banco.get(9));
//        cache.add(banco.get(10));
        do {
            System.out.println("Insira o ID de usuário");
            idDigitado = sc.nextInt();
            for (Pessoa p : cache) {
                if (p.getId() == idDigitado) {
                    System.out.println("Pessoa encontrada no cache:");
                    System.out.println(p);
                }
            }
            for (Pessoa p : banco) {
                if (p.getId() == idDigitado) {
                    System.out.println("Pessoa encontrada no banco: \n" + p);
                    if (cache.size() == 10) {
                        cache.remove(0);
                        cache.add(p);
                    } else
                        cache.add(p);
                }
            }
            System.out.println("Deseja procurar alguma outra pessoa? \n1-Sim \n2-Não");
            opcao = sc.nextInt();
            if (opcao == 2) {
                cache.clear();
                sc.close();
                break;
            }
            for(Pessoa p : cache) {
                System.out.println(p);
            }
        }
        while (true);
    }
}