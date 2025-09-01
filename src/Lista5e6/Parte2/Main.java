package Lista5e6.Parte2;

public class Main {
    public static void main(String[] args) {
        //conta 1
        Conta c1 = new Conta();
        c1.cpf = "063.593.203.20";
        c1.numBanco = 12345;
        c1.saldo = 4125.58f;
        c1.especial = true;

        //c.print();
        System.out.println(c1.toString());

        //conta2
        Conta c2 = new Conta();
        c2.cpf = "123.456.789.10";
        c2.numBanco = 6789;
        c2.saldo = 5000f;
        c2.especial = false;
        c1.transferencia(c2, 20);
        //c.print();
        System.out.println(c2.toString());



    }
}
