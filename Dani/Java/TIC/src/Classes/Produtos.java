package Classes;

import java.util.Date;

public class Produtos {
    private int cod;
    private String descr;
    private String marca;
    private float custo;
    private float custoTabela;
    private Date ultCompra;

    public Produtos(int cod, String descr, String marca, float custo, float custoTabela, Date ultCompra) {
        this.setCod(cod);
        this.setDescr(descr);
        this.setMarca(marca);
        this.setCusto(custo);
        this.setCustoTabela(custoTabela);
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

    public final void setCusto(float custo) {
        this.custo = custo;
    }

    public final void setCustoTabela(float custoTabela) {
        this.custoTabela = custoTabela;
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

    public float getCusto() {
        return custo;
    }

    public float getCustoTabela() {
        return custoTabela;
    }

    public Date getUltCompra() {
        return ultCompra;
    }

    //todos os dados dessa classe serão pegos da tabela importada de produtos
}
