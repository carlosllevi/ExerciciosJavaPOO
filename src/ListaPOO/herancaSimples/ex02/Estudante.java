package ListaPOO.herancaSimples.ex02;

public class Estudante {
    private String matricula;
    private int anoIngresso;
    private String curso;

    public String getMatricula() {
        return matricula;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float valorGastoCopia(int folhas) {
        return folhas * 0.1f;
    }

}
