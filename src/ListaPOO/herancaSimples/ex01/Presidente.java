package ListaPOO.herancaSimples.ex01;

public class Presidente extends Funcionario {

    private int qtdAcoes;

    public void setQtdAcoes(int qtdAcoes) {
        this.qtdAcoes = qtdAcoes;
    }

    public int getQtdAcoes() {
        return qtdAcoes;
    }

    public float calculaBonus() {
        return getSalario() * 0.1f;
    }
}
