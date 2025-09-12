package ListaPOO.ConstrutoresEncapsulamento.Parte1;

public class MainEmpregado {
    public static void main(String[] args) {

        Empregado e1 = new Empregado("Levi", "Castro", 1000.50f);
        System.out.println("O salario anual de " + e1.getNome() + "" + e1.getSobrenome() + " " + e1.getSalario());
        Empregado e2 = new Empregado("Giou", "Fer", 1000.50f);
        System.out.println("O salario anual de " + e2.getNome() + "" + e2.getSobrenome() + " " + e2.getSalario());
        e2.forneceAumento();
        System.out.println("O salario anual dps do eumento é " + e2.getSalario());
    }
}
