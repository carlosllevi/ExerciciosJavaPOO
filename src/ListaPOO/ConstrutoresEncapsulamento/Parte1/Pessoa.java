package ListaPOO.ConstrutoresEncapsulamento.Parte1;

import java.util.Calendar;

public class Pessoa {
    String nome;
    String cpf;
    short anoNascimento;
    float altura;

    public Pessoa (String nome, String cpf, short anoNascimento, float altura) {
       this.nome = nome;
       this.cpf = cpf;
       this.anoNascimento = anoNascimento;
       this.altura = altura;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public short getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(short anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public byte idade () {
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        return (byte)(anoAtual-anoNascimento);
//        this.anoAtual = anoAtual;
//        return anoAtual-anoNascimento;
    }
    // ou usa o print ou o print 2 e o to sting
    public void print () {
        System.out.println("---Dados---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Idade: " + idade());
        System.out.println("Altura: " + altura);
    }

    public void print2() {
        System.out.println(this);
    }

    public String toString() {
        return "Pessoa - nome: " + nome + ", CPF: " + cpf+ ", Ano de Nascimento: " + anoNascimento + ", Altura: " + altura;
    }
}
