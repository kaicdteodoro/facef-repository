package Classes;

import java.util.Arrays;

import java.util.Date;


public class RegistroContratual implements CRUD {
    protected String processo;
    protected String preg;
    protected Date validade;
    protected int qntRealinhamentos;
    protected ProdutoContrato[] produtos;
    protected Cliente cliente;

    public RegistroContratual() {
        ProdutoContrato produtos = new ProdutoContrato();
        Cliente cliente = new Cliente();
    }

    public RegistroContratual(String processo, String preg, Date validade, ProdutoContrato[] produtos, Cliente cliente, int qntRealinhamentos) {
        this.setProcesso(processo);
        this.setPreg(preg);
        this.setValidade(validade);
        this.setProdutos(produtos);
        this.setCliente(cliente);
        this.setQntRealinhamentos(qntRealinhamentos);
    }


    public final void setProdutos(ProdutoContrato[] produtos) {
        this.produtos = produtos;
    }

    public final void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public final void setProcesso(String processo) {
        this.processo = processo;
    }

    public final void setPreg(String preg) {
        this.preg = preg;
    }

    public final void setValidade(Date validade) {
        this.validade = validade;
    }

    public final void setQntRealinhamentos(int qnt_Realinhamentos) {
        this.qntRealinhamentos += qnt_Realinhamentos;
    }

    public ProdutoContrato[] getProdutos() {
        return produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getProcesso() {
        return processo;
    }

    public String getPreg() {
        return preg;
    }

    public Date getValidade() {
        return validade;
    }

    public int getQnt_Realinhamentos() {
        return qntRealinhamentos;
    }

    public void cadastrar() {

    }

    //public String vencidos(){}

    public void alterarContrato() {
    }

    @Override
    public void Altera() {

    }

    @Override
    public void Deletar() {

    }

    @Override
    public String Mostra() {
        return "RegistroContratual{" +
                "processo='" + processo + '\'' +
                ", preg='" + preg + '\'' +
                ", validade=" + validade +
                ", qntRealinhamentos=" + qntRealinhamentos +
                ", produtos=" + Arrays.toString(produtos) +
                ", cliente=" + cliente +
                '}';
    }

    @Override
    public void Cadastra() {

    }
    //public String[] vencidos() {
    //não consegui }
}
