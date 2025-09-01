package Lista5e6.Parte1;

public class Pessoa {

    String nome;
    int anoNascimento;
    float peso;
    float altura;
    int anoAtual;

    public float IMC (float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
        return peso/(altura*altura);
    }

    public int idade (int anoNascimento, int anoAtual) {
        this.anoNascimento = anoNascimento;
        this.anoAtual = anoAtual;
        return anoAtual-anoNascimento;
    }

    public float agua (float peso) {
        this.peso = peso;
        return peso*40/1000; //litros
    }

    public void print () {
        System.out.println(IMC(altura, peso));
        System.out.println(idade(anoNascimento, anoAtual));
        System.out.println(agua(peso));
    }


}
