package ex02;

public class Moradia {
    protected String end, dono;

    public Moradia() {
    }

    public Moradia(String end, String dono) {
        this.setDono(dono);
        this.setEnd(end);
    }

    public String getEnd() {
        return end;
    }

    public final void setEnd(String end) {
        this.end = end;
    }

    public String getDono() {
        return dono;
    }

    public final void setDono(String dono) {
        this.dono = dono;
    }

    public String Mostra() {
        return "Moradia{" +
                "end='" + end + '\'' +
                ", dono='" + dono + '\'' +
                '}';
    }
}
