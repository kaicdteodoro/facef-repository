package quest01;

public class Financial extends User {
    public float kickback;

    public Financial() {
        super();
    }

    public Financial(String login, String password, float kickback) {
        super(login, password);
        this.setKickback(kickback);
    }

    public float getKickback() {
        return kickback;
    }

    public final void setKickback(float kickback) {
        this.kickback = kickback;
    }

    @Override
    public String Mostra() {
        return "Financial{" + super.Mostra() +
                "kickback=" + kickback +
                '}';
    }
}
