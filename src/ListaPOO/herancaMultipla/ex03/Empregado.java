package ListaPOO.herancaMultipla.ex03;

public class Empregado extends Pessoa{
    protected int codigoSetor;
    protected double salarioBase;
    protected double impostos;

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double calcularSalario() {
        return salarioBase-(salarioBase*impostos);
    }
}
