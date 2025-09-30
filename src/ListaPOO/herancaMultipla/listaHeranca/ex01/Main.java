package ListaPOO.herancaMultipla.listaHeranca.ex01;

public class Main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe();
        Cachorro cachorro = new Cachorro();
        peixe.setNome("Levi");
        peixe.setTipoHabitat("Marinho");
        peixe.setPeso(10);
        cachorro.setNome("Marcos");
        cachorro.setRaca("Golden");
        cachorro.setPeso(100);

        System.out.println(cachorro.toString());
        System.out.println(peixe.toString());
    }
}
