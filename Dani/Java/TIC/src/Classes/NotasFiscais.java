package Classes;

import java.util.Date;

public class NotasFiscais {
    private int numNotaFiscal;
    private int numSerie;
    private int chaveAcesso;
    private Date dataEmissao;

    public NotasFiscais() {
    }

    public NotasFiscais(int numNotaFiscal, int numSerie, int chaveAcesso, Date dataEmissao) {
        this.setNumNotaFiscal(numNotaFiscal);
        this.setNumSerie(numSerie);
        this.setChaveAcesso(chaveAcesso);
        this.setDataEmissao(dataEmissao);
    }

    public final void setNumNotaFiscal(int numNotaFiscal) {
        this.numNotaFiscal = numNotaFiscal;
    }

    public final void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public final void setChaveAcesso(int chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public final void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public int getNumNotaFiscal() {
        return numNotaFiscal;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public int getChaveAcesso() {
        return chaveAcesso;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void importNotas() {
    }

    public String Mostra() {
        return "NotasFiscais{" +
                "numNotaFiscal=" + numNotaFiscal +
                ", numSerie=" + numSerie +
                ", chaveAcesso=" + chaveAcesso +
                ", dataEmissao=" + dataEmissao +
                '}';
    }
}
