package Lista5e6.Parte3;

public class Produto {

    String codigo;
    double peso;
    double preco;

    public Produto (String codigo, double peso, double preco) {
    this.codigo = codigo;
    this.peso = peso;
    this.preco = preco;
    }

    public void informacoes () {
        System.out.println("Código:" + codigo);
        System.out.println("Preco:" + preco);
        System.out.println("Peso:" + peso);
    }

}
