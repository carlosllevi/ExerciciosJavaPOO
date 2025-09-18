package ListaPOO.polimorfismo.parte1.ex01;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Preguica preguica = new Preguica();
        System.out.println("A preguiça " );
        preguica.somEmitido();
        System.out.println("O cachorro ");
        cachorro.somEmitido();
        System.out.println("Animais ");
        Animal animal = new Cachorro();
        animal.somEmitido();
        animal = new Preguica();
        animal.somEmitido();
    }
}
