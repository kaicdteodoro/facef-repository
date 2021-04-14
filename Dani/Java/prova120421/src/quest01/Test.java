package quest01;

import java.util.ArrayList;

public class Test {
    public static void Show(User user) {
        System.out.println(user.Mostra());
    }

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList();
        Admin adm = new Admin("Kaic", "123435", false);
        Financial fncl = new Financial("Maria Beatris", "433245234543", 3000);

        users.add(adm);
        users.add(fncl);

        users.forEach(obj -> Show(obj));


    }

}
