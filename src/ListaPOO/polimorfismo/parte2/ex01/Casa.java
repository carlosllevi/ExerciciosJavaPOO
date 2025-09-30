package ListaPOO.polimorfismo.parte2.ex01;

public class Casa extends Imovel{
    private boolean haQuintal;

    public boolean isHaQuintal() {
        return haQuintal;
    }

    public double precoVenda (int qtdeQuartos) {
        if (qtdeQuartos > 4 || haQuintal == true) {
            return getPreco()*1.3;
        } else {
            return getPreco()*1.15;
        }
    }

}
