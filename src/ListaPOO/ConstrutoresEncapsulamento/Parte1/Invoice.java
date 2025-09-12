package ListaPOO.ConstrutoresEncapsulamento.Parte1;

public class Invoice {
    private String id;
    private int gtde;
    private float preco;

    public Invoice(String id, int gtde, float preco) {
        this.id = id;
        if (gtde < 0 ) {
            this.gtde = 0;
        } else {
            this.gtde = gtde;
        }
        if (preco < 0 ) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }

    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public int getGtde () {
        return gtde;
    }

    public void setGtde (int gtde) {
        this.gtde = gtde;
        if (gtde < 0 ) {
            this.gtde = 0;
        } else {
            this.gtde = gtde;
        }
    }

    public float getPreco () {
        return preco;
    }

    public void setPreco (float preco) {
        this.preco = preco;
        if (preco < 0 ) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

}
