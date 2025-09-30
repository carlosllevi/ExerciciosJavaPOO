package ListaPOO.herancaMultipla.ex03;

public class Vendedor extends Empregado{
    double valorVendas;
    double comissao;

    @Override
    public double calcularSalario() {
        return super.salarioBase+valorVendas*comissao;
    }
}
