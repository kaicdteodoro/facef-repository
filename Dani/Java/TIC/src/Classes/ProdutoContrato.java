package Classes;

import java.util.Arrays;
import java.util.Date;

public class ProdutoContrato extends Produto implements CRUD {

    private int numItem;
    private String descrTemporaria;
    private String marcaContr;
    private int quant;
    private float[] valorContr;
    //[0]cuto em contrato;
    //[1]venda em contrato
    private String unid;
    private float fatorConvert;

    public ProdutoContrato() {
        super();
    }

    public ProdutoContrato(int cod, String descr, String marca, float[] custos, Date ultCompra, int numItem, String descrTemporaria, String marcaContr, int quant, float[] valorContr, String unid, float fatorConvert) {
        super(cod, descr, marca, custos, ultCompra);
        this.setNumItem(numItem);
        this.setDescrTemporaria(descrTemporaria);
        this.setMarcaContr(marcaContr);
        this.setQuant(quant);
        this.setValorContr(valorContr);
        this.setUnid(unid);
        this.setFatorConvert(fatorConvert);
    }

    public final void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public final void setDescrTemporaria(String descrTemporaria) {
        this.descrTemporaria = descrTemporaria;
    }

    public final void setMarcaContr(String marcaContr) {
        this.marcaContr = marcaContr;
    }

    public final void setQuant(int quant) {
        this.quant = quant;
    }

    public final void setValorContr(float[] valorContr) {
        this.valorContr = valorContr;
    }

    public final void setUnid(String unid) {
        this.unid = unid;
    }

    public final void setFatorConvert(float fatorConvert) {
        this.fatorConvert = fatorConvert;
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

    public float[] getValorContr() {
        return valorContr;
    }

    public String getUnid() {
        return unid;
    }

    public float getFatorConvert() {
        return fatorConvert;
    }

    //public boolean validaMarca() {
//destinado a retornar uma verificação entre a marca no contrato e a marca no produto;
   // }

   // public float validaMargem() {
//destinado a comparar a margem de lucro vendaContratoXcustoSistena;
   // }

   // public float defasagem() {
//diferença do total de venda baseado no custo de contrato e o total de venda baseado no custo de Sistema(custo atual)
    //}

   // public float[] valIdeal() {
//destinado a calculação do preço de venda, baseado no custo atual de mercado;
   // }

    @Override
    public void Altera() {

    }

    @Override
    public void Deletar() {

    }

    @Override
    public String Mostra() {
        return "ProdutoContrato{" +super.Mostra()+
                "numItem=" + numItem +
                ", descrTemporaria='" + descrTemporaria + '\'' +
                ", marcaContr='" + marcaContr + '\'' +
                ", quant=" + quant +
                ", valorContr=" + Arrays.toString(valorContr) +
                ", unid='" + unid + '\'' +
                ", fatorConvert=" + fatorConvert +
                '}';
    }

    @Override
    public void Cadastra() {

    }
}
