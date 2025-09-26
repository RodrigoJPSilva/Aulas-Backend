package situacaoProblema;

public class Livro implements Emprestavel{
    private String titulo;
    private String autor;
    private boolean status;

    public Livro(String titulo, String autor, boolean status) {
        super();
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
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

    public void emprestar() {

    }
    public void devolve() {

    }

    @Override
    public void emprestar(Usuario u) {

    }

    @Override
    public void devolver() {

    }
}
