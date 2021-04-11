package Classes;

import java.util.Date;

public class Contrato extends RegistrosContratuais {
private int numContr;

    public Contrato(String processo, String preg, Date validade, ProdutosContrato produtos, Cliente cliente, int numContr) {
        super(processo, preg, validade, produtos, cliente);
        this.setNumContr(numContr);
    }

    public int getNumContr() {
        return numContr;
    }

    public final void setNumContr(int numAta) {
        this.numContr = numAta;
    }

    @Override
    public String Mostra() {
        return "Contrato{" +
                "numAta=" + numContr + super.Mostra()+
                '}';
    }
}
