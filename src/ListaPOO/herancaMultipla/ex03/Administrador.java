package ListaPOO.herancaMultipla.ex03;

public class Administrador extends Empregado{

    double ajudaDeCusto;

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}
