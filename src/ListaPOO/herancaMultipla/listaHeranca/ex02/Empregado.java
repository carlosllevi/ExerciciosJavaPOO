package ListaPOO.herancaMultipla.listaHeranca.ex02;

public class Empregado extends Pessoa  {
    protected double salario;
    protected String matricula;

    public double valorInss() {
        return salario*1.1;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
