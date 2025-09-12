package ListaPOO.ConstrutoresEncapsulamento.parte3.ex01;

public class Elevador {
    private byte andarAtual;
    private byte totalDeAndares;
    private byte capacidade;
    private byte ocupacaoAtual;

    public Elevador (byte totalDeAndares, byte capacidade) {
        this.capacidade = capacidade;
        this.totalDeAndares = totalDeAndares;
        this.andarAtual = 0;
        this.ocupacaoAtual = 0;
    }

    public void entra() {
        if (ocupacaoAtual<capacidade) {
            ocupacaoAtual +=1;
        }
    }

    public void sai() {
        if (ocupacaoAtual>=1) {
            ocupacaoAtual -=1;
        }
    }

    public void sobe () {
        if (andarAtual<totalDeAndares) {
            andarAtual+=1;
        }
    }


    public void desce () {
        if (andarAtual!= 0) {
            andarAtual-=1;
        }
    }

    public byte getAndarAtual() {
        return andarAtual;
    }

    public byte getCapacidade() {
        return capacidade;
    }

    public byte getOcupacaoAtual() {
        return ocupacaoAtual;
    }

    public byte getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setAndarAtual (byte andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setCapacidade (byte capacidade) {
        this.capacidade = capacidade;
    }

    public void setOcupacaoAtual (byte ocupacaoAtual) {
        this.ocupacaoAtual = ocupacaoAtual;
    }

    public void setTotalDeAndares (byte totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

}
