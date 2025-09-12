package ListaPOO.ConstrutoresEncapsulamento.Parte2;
//(i) atributos privados do ponto; (ii) m´etodos gets
//e sets; (iii) m´etodo que compara se um ponto ´e igual a outro; (iv) m´etodo
//que calcula a distˆancia euclidiana de um ponto at´e outro.
public class Ponto2D {
    private float x;
    private float y;

    public Ponto2D(float x, float y) {
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x=x;
    }

    public void setY(float y) {
        this.y=y;
    }

    public boolean ehIgual() {
        if (x==y) {
            return true;
        } else {
            return false;
        }
    }

    public float distanciaEuclidiana(Ponto2D outroPonto) {
        float dx = this.x-outroPonto.getX();
        float dy = this.y-outroPonto.getY();
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}
