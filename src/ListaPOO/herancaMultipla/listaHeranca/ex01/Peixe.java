package ListaPOO.herancaMultipla.listaHeranca.ex01;

public class Peixe extends Animal{
    protected String tipoHabitat;

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public String toString() {
        return "Peixe {" +
                "Tipo Habitat " + tipoHabitat + '\'' +
                "Nome = " + nome + '\'' +
                "Peso = " + peso +
                 '}';
    }
}
