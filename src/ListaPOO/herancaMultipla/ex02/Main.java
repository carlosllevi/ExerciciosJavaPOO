package ListaPOO.herancaMultipla.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas formas você deseja criar?");
        short numeroFormas = scan.nextShort();
        short[] tipoForma = new short[numeroFormas];
        short tipo1 = 0;
        short tipo2 = 0;
        short tipo3 = 0;

        for (short i = 0; i < numeroFormas; i++) {
            System.out.println("---" + (i+1) + "º Forma---");
            System.out.println("Digite 1 para Quadrado, 2 para Retangulo e 3 para Circulo:");
            tipoForma[i] = scan.nextShort();
            if (tipoForma[i] == 1) {
                tipo1 +=1;
            } else if (tipoForma[i] == 2) {
                tipo2 +=1;
            } else {
                tipo3 +=1;
            }

        }

        Quadrado[] quadrado = new Quadrado[tipo1];
        Retangulo[] retangulo = new Retangulo[tipo2];
        Circulo[] circulo = new Circulo[tipo3];

        for (short i = 0; i < numeroFormas; i++) {
            System.out.println("---" + (i+1) + "º Forma---");
            if (tipoForma[i] == 1) {
                System.out.println("Informe a medida do lado");
                float lado = scan.nextFloat();
                short aux=0;
                quadrado[aux] = new Quadrado(lado);
                aux++;
            } else if (tipoForma[i] == 2) {
                System.out.println("Informe a medida da base:");
                float base = scan.nextFloat();
                System.out.println("Informe a medida da altura:");
                float altura = scan.nextFloat();
                short aux=0;
                retangulo[aux] = new Retangulo(altura, base);
                aux++;
            } else {
                System.out.println("Informe a medida de raio");
                float raio = scan.nextFloat();
                short aux=0;
                circulo[aux] = new Circulo(raio);
                aux++;
            }
            System.out.println("-------");
        }

        for (short i = 0; i < numeroFormas; i++) {
            System.out.println("---" + (i+1) + "º Forma---");
            if (tipoForma[i] == 1) {
                short aux=0;
                System.out.println("Lado: " + quadrado[aux].getLado());
                System.out.println("Perimetro: " + quadrado[aux].calculoPerimetro() );
                System.out.println("Area: " + quadrado[aux].calculoArea() );
                aux++;
            } else if (tipoForma[i] == 2) {
                short aux=0;
                System.out.println("Base: " + retangulo[aux].getBase());
                System.out.println("Altura: " + retangulo[aux].getAltura());
                System.out.println("Perimetro: " + retangulo[aux].calculoPerimetro() );
                System.out.println("Area: " + retangulo[aux].calculoArea() );
                aux++;
            } else {
                short aux=0;
                System.out.println("Raio: " + circulo[aux].getRaio());
                System.out.println("Perimetro: " + circulo[aux].calculoPerimetro() );
                System.out.println("Area: " + circulo[aux].calculoArea() );
                aux++;
            }
            System.out.println("-------");
        }
    }
}
