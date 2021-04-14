public class Brasileiro implements ICidadao, IEleitor {

    @Override
    public String pagarIr() {
        return "pagarIr - BR";
    }

    @Override
    public String tirarId() {
        return "tirarId - BR";
    }

    @Override
    public String vota() {
        return "vota - BR";
    }

    @Override
    public String consultaLocalVotacao() {
        return "consultaLocalVotacao - BR";
    }
}
