package ListaPOO.herancaSimples.ex01;

public class Funcionario {

    private String name;
    private String cpf;
    private float salario;

    public float calculaBonus() {
        return salario * 0.05f;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }
}
