package Classes;

import java.util.Arrays;
import java.util.Date;

public class Produto {
    protected int cod;
    protected String descr;
    protected String marca;
    protected float[] custos;
    //[0]custo real;
    //[1]custo de tabela;
    private Date ultCompra;

    public Produto() {
    }

    public Produto(int cod, String descr, String marca, float[] custos, Date ultCompra) {
        this.setCod(cod);
        this.setDescr(descr);
        this.setMarca(marca);
        this.setCustos(custos);
        this.setUltCompra(ultCompra);
    }

    public final void setCod(int cod) {
        this.cod = cod;
    }

    public final void setDescr(String descr) {
        this.descr = descr;
    }

    public final void setMarca(String marca) {
        this.marca = marca;
    }

    public final void setCustos(float[] custos) {
        this.custos = custos;
    }

    public final void setUltCompra(Date ultCompra) {
        this.ultCompra = ultCompra;
    }

    public int getCod() {
        return cod;
    }

    public String getDescr() {
        return descr;
    }

    public String getMarca() {
        return marca;
    }

    public float[] getCustos() {
        return custos;
    }

    public int[] ArrecadaNotas(){
        int[] notas = new int[0];
        return notas;}

    public Date getUltCompra() {
        return ultCompra;
    }

    public String Mostra() {
        return "Produto{" +
                "cod=" + cod +
                ", descr='" + descr + '\'' +
                ", marca='" + marca + '\'' +
                ", custos=" + Arrays.toString(custos) +
                ", ultCompra=" + ultCompra +
                '}';
    }

    //todos os dados dessa classe serão pegos da tabela importada de produtos
}
