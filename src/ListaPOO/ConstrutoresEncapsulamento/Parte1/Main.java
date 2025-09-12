package ListaPOO.ConstrutoresEncapsulamento.Parte1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = scan.nextLine();
        System.out.println("Informe seu CPF:");
        String cpf = scan.nextLine();
        System.out.println("Informe seu Ano de Nascimento:");
        short anoNascimento = scan.nextShort();
        System.out.println("Informe o Ano Atual:");
        int anoAtual = scan.nextInt();
        System.out.println("Informe a sua altura:");
        float altura = scan.nextFloat();

        Pessoa pessoa = new Pessoa(nome, cpf, anoNascimento, altura );

        pessoa.idade();

        pessoa.print();
    }
}
