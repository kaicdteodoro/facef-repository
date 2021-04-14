package Classes;

public class ProdutosContrato {

    private boolean testCod;
    private Produtos produto;
    private int numItem;
    private String descrTemporaria;
    private String marcaContr;
    private int quant;
    private float custoContr;
    private float margem;
    private float vendaContr;
    private String unid;
    private float fatorConvert;

    public ProdutosContrato(int cod) {
        this.setProduto(cod);
    }

    public ProdutosContrato() {

    }

    private final void setProduto(int cod) {
        //vai procurar o codigo do produto nos registros,se achar vai setar como verdadeiro o testCond e puxar os dados requisitados;
        this.produto = produto;
    }

    public final void setDescrTemporaria(String descrTemporaria) {
        this.descrTemporaria = descrTemporaria;
    }

    public final void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public final void setMarcaContr(String marcaContr) {
        this.marcaContr = marcaContr;
    }

    public void setQuant(int quant) {
        this.quant = quant <= this.quant ? quant : this.quant;
    }

    public final void setCustoContr(float custoContr) {
        this.custoContr = custoContr;
    }

    public final void setMargem() {
        this.margem = (this.vendaContr / this.custoContr) - 1;
    }

    public final void setVendaContr(float vendaContr) {
        this.vendaContr = vendaContr;
    }

    public final void setUnid(String unid) {
        this.unid = unid;
    }

    public final void setFatorConvert(float fatorConvert) {
        this.fatorConvert = fatorConvert;
    }

    public boolean isTestCod() {
        return testCod;
    }

    public Produtos getProduto() {
        return produto;
    }

    public int getNumItem() {
        return numItem;
    }

    public String getDescrTemporaria() {
        return descrTemporaria;
    }

    public String getMarcaContr() {
        return marcaContr;
    }

    public int getQuant() {
        return quant;
    }

    public float getCustoContr() {
        return custoContr;
    }

    public float getMargem() {
        return margem;
    }

    public float getVendaContr() {
        return vendaContr;
    }

    public String getUnid() {
        return unid;
    }

    public float getFatorConvert() {
        return fatorConvert;
    }


    public boolean confirmaMarca() {
        return this.marcaContr == this.produto.getMarca();
    }

    // public int ArrecadaNotas(){} ainda não sei como fazer

    public float verificaMargem(int tipoCusto) {
        float margemTabela = ((this.vendaContr / this.produto.getCustoTabela()) - 1),
                margemNota = ((this.vendaContr / this.produto.getCusto()) - 1);

        return tipoCusto > 0 ? margemTabela : margemNota;
    }

    public float defasagem(int tipoCusto) {
        float marg;
        marg = (verificaMargem(2) < 0.2) ? (float) 0.3 : (verificaMargem(2));
        float vendaContr = this.getVendaContr() * this.getQuant() * this.getFatorConvert();
        float vendaSistema = this.produto.getCusto() + (this.produto.getCusto() * marg) * this.getQuant() * this.getFatorConvert();
        return vendaContr - vendaSistema;
    }

    public float[] valIdeal(int tipoCusto) {
        float marg;
        marg = (verificaMargem(2) < 0.2) ? (float) 0.3 : (verificaMargem(2));
        float vendaSistema = this.produto.getCusto() + (this.produto.getCusto() * marg) * this.getFatorConvert();
        float[] result = new float[2];
        result[0] = this.produto.getCusto();
        result[1] = vendaSistema;
        return result;
    }


    public String Mostra() {
        return "ProdutosContrato{" +
                "produto=" + produto +
                ", numItem=" + numItem +
                ", marcaContr='" + marcaContr + '\'' +
                ", quant=" + quant +
                ", custoContr=" + custoContr +
                ", margem=" + margem +
                ", vendaContr=" + vendaContr +
                ", unid='" + unid + '\'' +
                ", fatorConvert=" + fatorConvert +
                '}';
    }
}
