package heranca;

public class Funcionario {

    private String nome;
    private Double salario;
    private String rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public double calculoSalario(double salario) {
        return salario = salario - 100;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public Funcionario(String nome, Double salario, String rg) {
        super();
        this.nome = nome;
        this.salario = salario;
        this.rg = rg;
    }
}
