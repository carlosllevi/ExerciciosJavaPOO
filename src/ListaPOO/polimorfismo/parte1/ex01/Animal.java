package ListaPOO.polimorfismo.parte1.ex01;

public class Animal {
    private String nome;
    private byte idade;

    public void somEmitido() {
        System.out.println("Emitem sons diferentes");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
}
