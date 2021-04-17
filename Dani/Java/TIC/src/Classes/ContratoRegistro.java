package Classes;

import java.util.Date;

public class ContratoRegistro extends RegistroContratual {
private int numContrato;

    public ContratoRegistro() {
        super();
    }

    public ContratoRegistro(String processo, String preg, Date validade, ProdutoContrato[] produtos, Cliente cliente, int qntRealinhamentos, int numContrato) {
        super(processo, preg, validade, produtos, cliente, qntRealinhamentos);
        this.setNumAta(numContrato);
    }

    public final void setNumAta(int numAta) {
        this.numContrato = numContrato;
    }

    public int getNumContrato() {
        return numContrato;
    }

    @Override
    public String Mostra() {
        return "AtaRegistro{" +
                "numAta=" + numContrato+ super.Mostra()+
                '}';
    }
}
