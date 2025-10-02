package situacaoProblema;

public class Livro implements Emprestavel{
    private int codigo;
    private String titulo;

    private String autor;
    private boolean status = false;

    public Livro(int codigo, String titulo, String autor, boolean status) {
        super();
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    @Override
    public void emprestar(Usuario u) {
        System.out.println("Livro emprestado para: "+ u.getNome());
        status = true;
    }

    @Override
    public void devolver() {
        status = false;
    }
}
