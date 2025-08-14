package heranca;

public class Contador extends Funcionario{

    private int numCrea;


    public Contador(String nome, Double salario, String rg, int numCrea) {
        super(nome,salario,rg);
        this.numCrea = numCrea;
    }

    public int getNumCrea() {
        return numCrea;
    }

    public void setNumCrea(int numCrea) {
        this.numCrea = numCrea;
    }
}
