package ex02;

import java.util.Date;

public class Reserva {
    private int cod;
    private Date data;
    private Passageiro passageiro;
    private float valor;
    private Voo voo;

    public Reserva() {
        Passageiro passageiro = new Passageiro();
        Voo voo = new Voo();
    }

    public Reserva(int cod, Date data, Passageiro passageiro, Voo voo, float valor) {
        this.setCod(cod);
        this.setData(data);
        this.setPassageiro(passageiro);
        this.setValor(valor);
        this.setVoo(voo);
    }

    public final void setCod(int cod) {
        this.cod = cod;
    }

    public final void setData(Date data) {
        this.data = data;
    }

    public final void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public final void setVoo(Voo voo) {
        this.voo = voo;
    }

    public final void setValor(float valor) {
        this.valor = valor;
    }

    public int getCod() {
        return cod;
    }

    public Date getData() {
        return data;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public float getValor() {
        return valor;
    }

    public String Mostra() {
        return "Reserva{" +
                "cod=" + cod +
                ", data=" + data +
                ", passageiro=" + this.passageiro.Mostra() +
                ", valor=" + valor +
                ", voo=" + this.voo.Mostra() +
                '}';
    }
}
