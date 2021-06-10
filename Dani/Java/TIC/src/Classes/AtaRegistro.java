package Classes;

import java.util.Date;

public class AtaRegistro extends RegistroContratual {
private int numAta;

    public AtaRegistro() {
        super();
    }

    public AtaRegistro(String processo, String preg, Date validade, ProdutoContrato[] produtos, Cliente cliente, int qntRealinhamentos, int numAta) {
        super(processo, preg, validade, produtos, cliente, qntRealinhamentos);
        this.setNumAta(numAta);
    }

    public final void setNumAta(int numAta) {
        this.numAta = numAta;
    }

    public int getNumAta() {
        return numAta;
    }

    @Override
    public String Mostra() {
        return "AtaRegistro{" +
                "numAta=" + numAta + super.Mostra()+
                '}';
    }
}
