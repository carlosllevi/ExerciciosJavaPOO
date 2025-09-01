package Lista5e6.Parte1;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.anoNascimento = 2006;
        p.altura = 1.72f;
        p.peso = 70f;
        p.anoAtual = 2025;
        p.nome = "levi";
        p.agua(p.peso);
        p.idade(p.anoNascimento,p.anoAtual);
        p.IMC(p.altura,p.peso);
        p.print();


    }
}
