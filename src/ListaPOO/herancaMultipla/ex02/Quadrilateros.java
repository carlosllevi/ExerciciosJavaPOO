package ListaPOO.herancaMultipla.ex02;

public abstract class Quadrilateros implements FormaGeometrica {
    private float l1;
    private float l2;
    private float l3;
    private float l4;

    public Quadrilateros(float l1, float l2, float l3, float l4) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }

    @Override
    public float calculoPerimetro() {
        return l1+l2+l3+l4;
    }

}
