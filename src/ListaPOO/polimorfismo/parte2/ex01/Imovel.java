package ListaPOO.polimorfismo.parte2.ex01;

public abstract class Imovel {
    private double area;
    private byte qtdeQuartos;
    private double preco;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public byte getQtdeQuartos() {
        return qtdeQuartos;
    }

    public void setQtdeQuartos(byte qtdeQuartos) {
        this.qtdeQuartos = qtdeQuartos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
