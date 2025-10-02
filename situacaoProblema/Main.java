package situacaoProblema;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Usuario a = new Aluno(1234, "Vinicius", "viniaraujo@gmail.com");
        Usuario b = new Aluno(4321,"Gabriel", "gabrielver@gmail.com");
        Usuario p = new Professor(3412,"Ryan","ryanferreiradasilva@gmail.com");

        Livro l = new Livro(5511,"A Bela e a Fera", "Lameque",true);
        List <Livro> list =new ArrayList<>();

        l.emprestar(b);
        Biblioteca loja = new Biblioteca();
    }
}
