package ListaPOO.polimorfismo.parte1.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Cachorro cachorro = new Cachorro();
//        Preguica preguica = new Preguica();
//        System.out.println("A preguiça " );
//        preguica.somEmitido();
//        System.out.println("O cachorro ");
//        cachorro.somEmitido();
//        System.out.println("Animais ");
//        Animal animal = new Cachorro();
//        animal.somEmitido();
//        animal = new Preguica();
//        animal.somEmitido();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos animais você quer cadastrar?");
        short numeroAnimais = sc.nextShort();
        Animal [] animais = new Animal[numeroAnimais];
        for (short i = 0; i<numeroAnimais; i++) {
            System.out.println(i + "º Animal");
            System.out.println("Digite C para Cachorro ou P para Preguiça:");
            String tipo = sc.next();
            if (tipo.equalsIgnoreCase("C")) {
                animais[i] = new Cachorro();
                System.out.println("Qual o nome do cachorro?");
                String nome = sc.next();
                animais[i].setNome(nome);
                System.out.println("Qual a idade do cachorro?");
                byte idade = sc.nextByte();
                animais[i].setIdade(idade);
            } else {
                animais[i] = new Preguica();
                System.out.println("Qual o nome da preguiça?");
                String nome = sc.next();
                animais[i].setNome(nome);
                System.out.println("Qual a idade da preguiça?");
                byte idade = sc.nextByte();
                animais[i].setIdade(idade);
            }

        }

        for (short i = 0; i<numeroAnimais; i++) {
            System.out.println("Exibindo cadastro:");
            System.out.println(i + "º Animal:");
            System.out.println("Tipo");
            animais[i].tipo();
            System.out.println("Nome: " + animais[i].getNome());
            System.out.println("Idade: " + animais[i].getIdade());
        }


        byte idadeMedia = 0;
        for (short i = 0; i<numeroAnimais; i++) {
            idadeMedia += animais[i].getIdade();
        }
        idadeMedia = (byte) (idadeMedia/numeroAnimais);
        System.out.println("A média das idades dos animais cadastrados é:" + idadeMedia);



    }
}
