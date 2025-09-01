package ListaPOO.ConstrutoresEncapsulamento.Parte1;

public class Pessoa {
    String nome;
    String cpf;
    int anoNascimento;
    double altura;

    public Pessoa (String nome, String cpf, int anoNascimento, double altura) {
       this.nome = nome;
       this.cpf = cpf;
       this.anoNascimento = anoNascimento;
       this.altura = altura;
    }

    int anoAtual;

    public int idade (int anoAtual) {
        this.anoAtual = anoAtual;
        return anoAtual-anoNascimento;
    }

    public void print () {
        System.out.println("---Dados---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Idade: " + idade(anoAtual));
        System.out.println("Altura: " + altura);
    }
}
