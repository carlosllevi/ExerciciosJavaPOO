package ListaPOO.herancaMultipla.ex02;
import java.lang.Math;
public class Circulo implements FormaGeometrica{
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float calculoPerimetro() {
        return (float) (2*raio*Math.PI);
    }

    @Override
    public float calculoArea() {
        return (float) (raio*raio*Math.PI);
    }
}
