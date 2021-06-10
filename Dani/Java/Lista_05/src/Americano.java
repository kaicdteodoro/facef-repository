public class Americano implements ICidadao, IEleitor{

    @Override
    public String pagarIr() {
        return "pagarIr - EUA";
    }

    @Override
    public String tirarId() {
        return "tirarId - EUA";
    }

    @Override
    public String vota() {
        return "vota - EUA";
    }

    @Override
    public String consultaLocalVotacao() {
        return "consultaLocalVotacao - EUA";
    }
}
