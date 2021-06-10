package ex02;

public class Apto extends Moradia {
    private int andar;
    private boolean varanda;

    public Apto() {
        super();
    }

    public Apto(String end, String dono, int andar, boolean varanda) {
        super(end, dono);
        this.setAndar(andar);
        this.setVaranda(varanda);
    }

    public final void setAndar(int andar) {
        this.andar = andar;
    }

    public final void setVaranda(boolean varanda) {
        this.varanda = varanda;
    }

    public int getAndar() {
        return andar;
    }

    public boolean isVaranda() {
        return varanda;
    }

    @Override
    public String Mostra() {
        return "Apto{" +
                "andar=" + andar +
                ", varanda=" + varanda + super.Mostra() +
                '}';
    }
}
