package ListaPOO.ConstrutoresEncapsulamento.parte3.ex02;

public class Main {
    public static void main (String[] args) {

        Data data = new Data((short) 12, (short) 04,(int)2006);
        System.out.println(data.toString());

        Data dataOutra = new Data((short) 14, (short) 04,(int)2004);
        System.out.println(data.toString());

        System.out.println("eh igual?" + data.ehIgual(dataOutra));
        System.out.println(data.toString()+ "vem antes?" + data.vemAntes(dataOutra));
        System.out.println(dataOutra.toString()+ "vem antes?" + dataOutra.vemAntes(data));


    }
}
