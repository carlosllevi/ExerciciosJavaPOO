package ListaPOO.herancaMultipla.ex01;

public class Email implements Seguranca {
    private String nome;
    private String senha;
    private String email;

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
        System.out.println("Acesso Concluido!");
    }

    @Override
    public void mensagemFracasso() {
        System.out.println("Acesso não realizada!");
    }
}
