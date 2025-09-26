package situacaoProblema;

abstract public class Usuario {
    private int id;
    private String nome;
    private String email;

    abstract public void getLimiteEmprestimos();
}
