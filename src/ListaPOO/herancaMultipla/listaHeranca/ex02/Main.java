package ListaPOO.herancaMultipla.listaHeranca.ex02;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Cliente cliente = new Cliente();

        gerente.setNome("Levi");
        gerente.setIdade(19);
        gerente.setMatricula("2510481");
        gerente.setNomeGerencia("Carlos");
        gerente.setSalario(1000);
        System.out.println(gerente.toString());

        vendedor.setNome("Levi");
        vendedor.setSalario(1000);
        vendedor.setValorVendas(10);
        vendedor.setQntVendas(100);
        System.out.println(vendedor.toString());

        cliente.setNome("Levi");
        cliente.setIdade(18);
        cliente.setSexo("M");
        cliente.setValorDivida(100);
        cliente.setAnoNascim(2006);
        System.out.println(cliente.toString());
    }
}
