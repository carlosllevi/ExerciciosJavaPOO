package ListaPOO.herancaMultipla.ex01;

public class Conta implements Seguranca{

    private String CPF;
    private String senha;
    private float saldo;

    @Override
    public boolean verificarSenha(String senha) {
        if (senha.equalsIgnoreCase(this.senha)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void mensagemSucesso() {
        System.out.println("Operação concluída!");
    }

    @Override
    public void mensagemFracasso() {
        System.out.println("Operação não realizada!");
    }

    public void saca(float valor, String senha) {
        if (verificarSenha(senha) == true) {
            saldo -= valor;
            mensagemSucesso();
        } else {
            mensagemFracasso();
        }
    }

    public void deposita(float valor, String senha) {
        if (verificarSenha(senha) == true) {
            saldo += valor;
            mensagemSucesso();
        } else {
            mensagemFracasso();
        }
    }
}
