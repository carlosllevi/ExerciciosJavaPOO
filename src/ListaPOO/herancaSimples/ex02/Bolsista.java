package ListaPOO.herancaSimples.ex02;

public class Bolsista extends Estudante{

    private float bolsa;

    public float valorGastoCopia(int folhas) {
        return folhas * 0.07f;
    }

    public int qtdeCopias () {
        return  (int)(bolsa/0.07);
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
