package ListaPOO.herancaMultipla.ex02;

public class Retangulo extends Quadrilateros{
    private float altura;
    private float base;

    public Retangulo(float altura, float base) {
        super (base, altura, base, altura);
        this.altura = altura;
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public float calculoArea() {
        return base*altura;
    }
}
