package Classes;

import java.util.Date;

public class AtaRegistro extends RegistrosContratuais {
private int numAta;

    public AtaRegistro(String processo, String preg, Date validade, ProdutosContrato produtos, Cliente cliente, int numAta) {
        super(processo, preg, validade, produtos, cliente);
        this.setNumAta(numAta);
    }

    public int getNumAta() {
        return numAta;
    }

    public final void setNumAta(int numAta) {
        this.numAta = numAta;
    }

    @Override
    public String Mostra() {
        return "AtaRegistro{" +
                "numAta=" + numAta + super.Mostra()+
                '}';
    }
}
