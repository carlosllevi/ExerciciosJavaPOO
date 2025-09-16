package ListaPOO.herancaMultipla.ex02;

public class Quadrado extends Quadrilateros {
    private float lado;

    public Quadrado(float lado) {
        super(lado, lado, lado, lado);
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float calculoArea() {
        return lado*lado;
    }
}
