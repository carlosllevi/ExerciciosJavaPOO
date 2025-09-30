package ListaPOO.herancaMultipla.ex03;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito-valorDivida;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "Nome=" + nome +
                "Endereço=" + endereco +
                "Telefone=" + telefone +
                "valorCredito=" + valorCredito +
                " valorDivida=" + valorDivida +
                "Saldo="+ obterSaldo() +
                '}';
    }
}
