package situacaoProblema;

public class Professor extends Usuario implements Emprestavel{

    public Professor(int id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public void emprestar(Usuario u) {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void getLimiteEmprestimos() {

    }
}
