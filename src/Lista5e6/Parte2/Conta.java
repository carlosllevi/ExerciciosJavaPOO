package Lista5e6.Parte2;

public class Conta {

    String cpf;
    short numBanco;
    float saldo;
    boolean especial;

    public float bonificacao() {
        float porc = 0.1f;
        if (especial == true) {
            return saldo * 0.1f;
        } else {
            return saldo * 0.05f;
        }

    }

    public void sacar(float valorSaque) {
        saldo -= valorSaque;
    }

    public void depositar(float valorDeposito) {
        saldo += valorDeposito;
    }

    public void transferencia(Conta destino, float valor) {
        saldo -= valor;
        destino.saldo +=valor;
    }

    public void print() {
        System.out.println("O seu CPF é " + cpf);
        System.out.println("O seu número de banco é " + numBanco);
        System.out.println("O seu saldo é " + saldo);
    }

    public String toString() {
        return "Conta - CPF: " + cpf + ", número do Banco: " + numBanco + " e saldo: " + saldo + " Valor da bonificação" + bonificacao();
    }

}
