package Classes;

public class Empenho {
    private String numEmpenho;
    private String preg;
    private Produto[] produtos;
    private int[] quantidades;

    public Empenho(String numEmpenho, String preg, Produto[] produtos, int[] quantidades) {
        this.setNumEmpenho(numEmpenho);
        this.setPreg(preg);
        this.setProdutos(produtos);
    }

    public final void setNumEmpenho(String numEmpenho) {
        this.numEmpenho = numEmpenho;
    }

    public final void setPreg(String preg) {
        this.preg = preg;
    }

    public final void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public void setQuantidades(int[] quantidades) {
        this.quantidades = quantidades;
    }

    public int[] getQuantidades() {
        return quantidades;
    }

    public String getNumEmpenho() {
        return numEmpenho;
    }

    public String getPreg() {
        return preg;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

}
