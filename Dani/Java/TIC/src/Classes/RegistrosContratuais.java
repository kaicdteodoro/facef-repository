package Classes;

import java.util.Arrays;

import java.util.Date;
import java.util.List;


public class RegistrosContratuais {
    protected String processo;
    protected String preg;
    protected Date validade;
    protected int qntRealinhamentos;
    protected ProdutosContrato[] produtos;
    protected Cliente cliente;

    public RegistrosContratuais() {
        ProdutosContrato produtosContrato = new ProdutosContrato();
        Cliente cliente = new Cliente();
    }

    public RegistrosContratuais(String processo, String preg, Date validade, ProdutosContrato[] produtos, Cliente cliente) {
        this.setProcesso(processo);
        this.setPreg(preg);
        this.setValidade(validade);
        this.setProdutos(produtos);
        this.setCliente(cliente);
    }


    public final void setProdutos(ProdutosContrato[] produtos) {
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

    public final void setQnt_Realinhamentos(int qnt_Realinhamentos) {
        this.qntRealinhamentos += qnt_Realinhamentos;
    }

    public ProdutosContrato[] getProdutos() {
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

    public void concluirEmpenho(Empenho empenho) {
        boolean test = false;
        for (ProdutosContrato p : produtos) {
            int i = 0;
            String erros = "";
            while (i < empenho.getProdutos().length) {
                test = empenho.getProdutos()[i].getCod() == p.getProduto().getCod();
                i++;
            }
            if (test) {
                p.setQuant(empenho.getQuantidades()[i]);
            } else {
                erros += "/" + p.getProduto().getCod();
            }
        }

    }

    public String Mostra() {
        return "RegistrosContratuais{" +
                "processo='" + processo + '\'' +
                ", preg='" + preg + '\'' +
                ", validade=" + validade +
                ", qntRealinhamentos=" + qntRealinhamentos +
                ", produtos=" + Arrays.toString(produtos) +
                ", cliente=" + cliente +
                '}';
    }
    //public String[] vencidos() {
    //não consegui }
}
