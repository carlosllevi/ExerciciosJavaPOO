package Lista5e6.Parte3.Correcao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número de produtos que deseja cadastrar:");
        // Usei um tipo de dado maior para 'n' caso o usuário queira cadastrar
        // mais de 127 produtos (limite do byte).
        int n = scan.nextInt();

        Produto[] produtos = new Produto[n];

        // Cadastro dos produtos
        for (int i = 0; i < n; i++) {
            System.out.println("--- Produto " + (i + 1) + " ---");
            System.out.print("Código: ");
            String codigo = scan.next();
            System.out.print("Peso: ");
            double peso = scan.nextDouble();
            System.out.print("Preço: ");
            double preco = scan.nextDouble();
            produtos[i] = new Produto(codigo, peso, preco);
        }

        // Variáveis de controle para as estatísticas
        int k = 0; // contador de produtos com peso > 10 e preco > 50
        double somatorioPeso = 0;
        double somatorioPrecosMaiores10 = 0;
        int contagemPrecosMaiores10 = 0;

        // Variaveis para encontrar o produto mais leve e o mais caro
        Produto produtoMaisLeve = produtos[0];
        Produto produtoMaisCaro = produtos[0];

        // Loop para realizar as análises
        for (int i = 0; i < n; i++) {
            // Conta produtos com peso > 10 e preco > 50
            if (produtos[i].peso > 10 && produtos[i].preco < 50) {
                k += 1;
            }

            // Calcula o somatório de todos os pesos
            somatorioPeso += produtos[i].peso;

            // Encontra o produto mais leve
            if (produtos[i].peso < produtoMaisLeve.peso) {
                produtoMaisLeve = produtos[i];
            }

            // Encontra o produto mais caro
            if (produtos[i].preco > produtoMaisCaro.preco) {
                produtoMaisCaro = produtos[i];
            }

            // Soma os preços dos produtos com peso > 10 para o cálculo da média
            if (produtos[i].peso > 10) {
                somatorioPrecosMaiores10 += produtos[i].preco;
                contagemPrecosMaiores10 += 1;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Produtos com peso maior que 10 e valor menor que 50: " + k);

        double mediaPeso = (somatorioPeso / n);
        System.out.println("Média dos pesos: " + mediaPeso);

        System.out.println("Produto mais leve: " + produtoMaisLeve.codigo);

        System.out.println("Informações do produto mais caro: ");
        produtoMaisCaro.informacoes();

        // Evita divisão por zero caso não haja produtos com peso > 10
        if (contagemPrecosMaiores10 > 0) {
            double mediaSomatorio = (somatorioPrecosMaiores10 / contagemPrecosMaiores10);
            System.out.println("Média dos preços dos produtos com peso maior que 10: " + mediaSomatorio);
        } else {
            System.out.println("Não há produtos com peso maior que 10 para calcular a média de preços.");
        }

        scan.close();
    }
}
