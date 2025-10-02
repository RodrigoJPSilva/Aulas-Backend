package contaAbstrata;

import interfaces.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Conta> list = new ArrayList<Conta>();
        list.add(new PessoaJuridica("Banco do Brasil", "Robson", 2000.00, 8001));
        list.add(new Corrente("Itaú", "Vinicius Barbosa", 2000.00, 4002));
        list.add(new Poupanca("Santander", "Ryan", 2000.00, 6060));

        for (Conta conta : list) {
            conta.exibirDados();
            conta.depositar(500);
            conta.sacar(500);
            conta.calcularTarifaMensal();
            System.out.println("\n\n\n");
        }
    }
}
