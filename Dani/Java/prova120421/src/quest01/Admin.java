package quest01;

public class Admin extends User {
    private boolean isWork;

    public Admin() {
        super();
    }

    public Admin(String login, String password, boolean isWork) {
        super(login, password);
        this.setWork(isWork);
    }

    public boolean isWork() {
        return isWork;
    }

    public final void setWork(boolean work) {
        isWork = work;
    }

    @Override
    public String Mostra() {
        return "Admin{" + super.Mostra() +
                "isWork=" + isWork +
                '}';
    }
}
