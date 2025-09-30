package ListaPOO.herancaMultipla.ex03;

public class Main {
    public static void main(String[] args) {
        Fornecedor catupiry = new Fornecedor();
        catupiry.nome= "Catupiry";
        catupiry.endereco="CEP xxx";
        catupiry.telefone="9999-9999";
        catupiry.setValorCredito(1000);
        catupiry.setValorDivida(500);
        System.out.println(catupiry.toString());

        Empregado e = new Empregado();
        e.nome= "Levi";
        e.endereco="CEP xxx";
        e.telefone="9999-9999";
        e.salarioBase = 1000;
        e.impostos = 0.1;
        e.codigoSetor = 1;
        System.out.println("O salario é " + e.calcularSalario());

        Administrador a = new Administrador();
        a.nome= "Lucas";
        a.endereco="CEP xxx";
        a.telefone="9999-9999";
        a.salarioBase = 5000;
        a.impostos = 0.1;
        a.codigoSetor = 2;
        a.ajudaDeCusto = 50;
        System.out.println("o salario é : " + a.calcularSalario());

        Operario o = new Operario();
        o.nome= "Amanda";
        o.endereco="CEP xxx";
        o.telefone="9999-9999";
        o.salarioBase = 5000;
        o.impostos = 0.1;
        o.codigoSetor = 3;
        o.valorProducao = 50;
        o.comissao = 0.2;
        System.out.println("O salario do operario é " + o.calcularSalario());

        Vendedor v = new Vendedor();
        v.nome= "Amanda";
        v.endereco="CEP xxx";
        v.telefone="9999-9999";
        v.salarioBase = 5000;
        v.impostos = 0.1;
        v.codigoSetor = 3;
        v.valorVendas = 50;
        v.comissao = 0.2;
        System.out.println("O salario do operario é " + v.calcularSalario());

    }
}
