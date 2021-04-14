package Classes;

public class Empenho {
    private String numEmpenho;
    private String preg;
    private Produtos[] produtos;
    private int[] quantidades;

    public Empenho(String numEmpenho, String preg, Produtos[] produtos, int[] quantidades) {
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

    public final void setProdutos(Produtos[] produtos) {
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

    public Produtos[] getProdutos() {
        return produtos;
    }

}
