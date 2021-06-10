package ex02;

import java.util.ArrayList;

public class Teste_ex02 {
    public static void pol(Moradia obj) {
        System.out.println(obj.Mostra());
    }

    public static void main(String[] args) {
        ArrayList<Moradia> vet = new ArrayList<>();
        Casa casa01 = new Casa("Rua de taltal", "Kaic", 122, true);
        vet.add(casa01);
        Apto apto01 = new Apto("Rua dos imigrantes", "Marcos", 7, false);
        vet.add(apto01);

        vet.forEach(obj -> pol(obj));
    }
}
