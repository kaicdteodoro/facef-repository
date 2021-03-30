package ex02;

public class Casa extends Moradia {
    private float tJardim;
    private boolean piscina;

    public Casa() {
        super();
    }

    public Casa(String end, String dono, float tJardim, boolean piscina) {
        super(end, dono);
        this.setPiscina(piscina);
        this.settJardim(tJardim);
    }

    public final void settJardim(float tJardim) {
        this.tJardim = tJardim;
    }

    public final void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public float gettJardim() {
        return tJardim;
    }

    public boolean isPiscina() {
        return piscina;
    }

    @Override
    public String Mostra() {
        return "Casa{" +
                "tJardim=" + tJardim +
                ", piscina=" + piscina + super.Mostra() +
                '}';
    }
}
