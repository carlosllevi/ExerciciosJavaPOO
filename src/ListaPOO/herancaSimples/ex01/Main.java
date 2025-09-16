package ListaPOO.herancaSimples.ex01;

public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        f.setName("Astrogildo");
        f.setCpf("123456789");
        f.setSalario(1000f);
        System.out.println("O bonus é " + f.calculaBonus());


        Presidente p = new Presidente();
        p.setQtdAcoes(10);
        p.setName("Bolsonaro");
        p.setCpf("123456789");
        p.setSalario(1000000f);
        System.out.println("O bonus é " + p.calculaBonus());

    }
}
