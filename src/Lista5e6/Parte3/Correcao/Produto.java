package Lista5e6.Parte3.Correcao;

public class Produto {
        public String codigo;
        public double peso;
        public double preco;

        public Produto(String codigo, double peso, double preco) {
            this.codigo = codigo;
            this.peso = peso;
            this.preco = preco;
        }

        public void informacoes() {
            System.out.println("Código: " + this.codigo);
            System.out.println("Peso: " + this.peso);
            System.out.println("Preço: " + this.preco);
        }
    }
