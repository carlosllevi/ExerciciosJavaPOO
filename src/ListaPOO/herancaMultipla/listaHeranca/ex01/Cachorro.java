package ListaPOO.herancaMultipla.listaHeranca.ex01;

public class Cachorro extends Animal{
    protected String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String toString() {
        return  "Cachorro{" +
                "Raça = " + raca + '\'' +
                "Nome = " + nome + '\'' +
                "Peso = " + peso +
                '}';
    }
}
