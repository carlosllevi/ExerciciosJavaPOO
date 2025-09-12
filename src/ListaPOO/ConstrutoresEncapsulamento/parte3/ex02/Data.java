package ListaPOO.ConstrutoresEncapsulamento.parte3.ex02;

public class Data {
    private short dia;
    private short mes;
    private int ano;

    public Data(short dia, short mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public short getDia() {
        return dia;
    }

    public short getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia (short dia) {
        this.dia = dia;
    }

    public void setMes (short mes) {
        this.mes = mes;
    }

    public void setAno (int ano) {
        this.ano = ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean ehIgual (Data outra) {
//        if (this.dia == outra.dia && this.mes == outra.mes &&this.ano == outra.ano) {
//            return true;
//        } else {
//            return false;
//        }
        return this.dia == outra.dia && this.mes == outra.mes && this.ano == outra.ano;
    }

    public boolean vemAntes (Data outra) {
        if (this.ano<outra.ano) {
            return true;
        } else if (this.ano == outra.ano) {
            if (this.mes < outra.mes) {
                return true;
            } else if (this.mes == outra.mes) {
                if (this.dia <= outra.dia) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
