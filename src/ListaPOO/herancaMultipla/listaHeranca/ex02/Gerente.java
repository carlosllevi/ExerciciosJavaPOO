package ListaPOO.herancaMultipla.listaHeranca.ex02;

public class Gerente extends Empregado {
    private String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public double valorInss() {
        return super.valorInss();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", nomeGerencia='" + nomeGerencia + '\'' +
                ", valor inss='" + valorInss() + '\'' +
                '}';
    }
}
