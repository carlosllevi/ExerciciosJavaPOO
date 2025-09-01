package Lista5e6.Parte3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número de produtos que deseja cadastrar:");
        byte n = scan.nextByte();

        Produto[] produtos = new Produto[n];

        //Cadastro dos produtos
        for (byte i=0; i<n; i++) {
            System.out.println("Produto " + i + "Código: ");
            String codigo = scan.next();
            System.out.println("Produto " + i + "Peso: ");
            double peso = scan.nextDouble();
            System.out.println("Produto " + i + "Preço: ");
            double preco = scan.nextDouble();
            produtos[i] = new Produto(codigo, peso, preco);
        }

        int k = 0; //contador de produtos com peso > 10 e preço > 50
        double somatorioPeso = 0;
        String produtoLeve = produtos[0].codigo;
        double produtoCaro = produtos[0].preco;
        double somatorioPesosMaiores10 = 0;
        int l = 0; // pesos maiores que 10
        double j = 0;

        for (byte i = 0; i<n; i++) {
            if (produtos[i].peso>10 && produtos[i].preco>50) {
                k+=1;
            }
            somatorioPeso += produtos[i].peso;
            if (produtos[i].peso<produtos[i+1].peso) {
                produtoLeve = produtos[i].codigo;
            }
            if (produtos[i].preco> produtoCaro) {
                produtoCaro = produtos[i+1].preco;
                l = i;
            }
            if (produtos[i].peso>10) {
                somatorioPesosMaiores10 += produtos[i].preco;
                j +=1;
            }
        }

        System.out.println("Produtos com peso maior que 10  e valor menor que 50" + k);

        double mediaPeso = (somatorioPeso/n);
        System.out.println("Media dos pesos: " + mediaPeso);

        System.out.println("Produto mais leve: " + produtoLeve);

        System.out.println("Informações do prduto mais caro: ");
        produtos[l].informacoes();



        double mediaSomatorio= (somatorioPesosMaiores10/j);
        System.out.println("Media dos valores dos produtos com peso maior que 10" + mediaSomatorio);

    }
}
