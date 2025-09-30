package ListaPOO.herancaMultipla.ex03;

public class Operario extends Empregado{
    double valorProducao;
    double comissao;

    @Override
    public double calcularSalario() {
        return super.salarioBase + valorProducao * comissao;
    }
}
