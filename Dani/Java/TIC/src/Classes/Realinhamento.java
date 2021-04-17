package Classes;

import java.util.Arrays;
import java.util.Date;

public class Realinhamento implements CRUD {
    private int codRealinhamento;
    private Date[] dataSolicitada;
    private float[] valSolicit;
    private int[] notas;
    private Date dataResp;
    private boolean situacao;

    public Realinhamento() {
    }

    public Realinhamento(int codRealinhamento, Date[] dataSolicitada, float[] valSolicit, int[] notas, Date dataResp, boolean situacao) {
        this.setCodRealinhamento(codRealinhamento);
        this.setDataSolicitada(dataSolicitada);
        this.setValSolicit(valSolicit);
        this.setNotas(notas);
        this.setDataResp(dataResp);
        this.setSituacao(situacao);
    }

    public final void setCodRealinhamento(int codRealinhamento) {
        this.codRealinhamento = codRealinhamento;
    }

    public final void setDataSolicitada(Date[] dataSolicitada) {
        this.dataSolicitada = dataSolicitada;
    }

    public final void setValSolicit(float[] valSolicit) {
        this.valSolicit = valSolicit;
    }

    public final void setNotas(int[] notas) {
        this.notas = notas;
    }

    public final void setDataResp(Date dataResp) {
        this.dataResp = dataResp;
    }

    public final void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public int getCodRealinhamento() {
        return codRealinhamento;
    }

    public Date[] getDataSolicitada() {
        return dataSolicitada;
    }

    public float[] getValSolicit() {
        return valSolicit;
    }

    public int[] getNotas() {
        return notas;
    }

    public Date getDataResp() {
        return dataResp;
    }

    public boolean isSituacao() {
        return situacao;
    }


    @Override
    public void Altera() {

    }

    @Override
    public void Deletar() {

    }

    @Override
    public String Mostra() {
        return "Realinhamento{" +
                "codRealinhamento=" + codRealinhamento +
                ", dataSolicitada=" + Arrays.toString(dataSolicitada) +
                ", valSolicit=" + Arrays.toString(valSolicit) +
                ", notas=" + Arrays.toString(notas) +
                ", dataResp=" + dataResp +
                ", situacao=" + situacao +
                '}';
    }

    @Override
    public void Cadastra() {

    }
}
