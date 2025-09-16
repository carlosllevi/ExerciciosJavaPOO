package ListaPOO.herancaSimples.ex02;

public class Main {
    public static void main(String[] args) {
        Estudante e1 = new Estudante();
        e1.setCurso("CC");
        e1.setAnoIngresso((short) 2023);
        e1.setMatricula("2510481");
        System.out.println("O valor para tirar 50 copias é " + e1.valorGastoCopia(50));

        Bolsista b = new Bolsista();
        b.setCurso("ADS");
        b.setAnoIngresso((short) 2024);
        b.setMatricula("2510481");
        b.setBolsa(500f);
        System.out.println("O valor para tirar 50 copias é " + b.valorGastoCopia(50));
        System.out.println("Com o valor da bolsa " + b.qtdeCopias());

    }
}
