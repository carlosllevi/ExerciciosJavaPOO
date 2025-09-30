package ListaPOO.polimorfismo.parte2.ex01;

public class Apartamento extends Imovel{
    private boolean haPiscina;

    public boolean isHaPiscina() {
        return haPiscina;
    }

    public double precoVenda (double area) {
        if (area > 300 || haPiscina == true) {
            return getPreco()*1.5;
        } else {
            return getPreco()*1.1;
        }
    }


}
