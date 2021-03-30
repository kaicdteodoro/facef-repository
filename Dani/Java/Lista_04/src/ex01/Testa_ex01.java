package ex01;

import java.util.ArrayList;

public class Testa_ex01 {

    public static void pol(Funcionario obj) {
        System.out.println(obj.Mostra());
    }

    public static void main(String[] args) {
        ArrayList<Funcionario> vet = new ArrayList();
        Assistente ass01 = new Assistente("Kaic", "234234234", 5000, 230);
        Gerente ger01 = new Gerente("Mario", "5634565436", 2500, 500);
        Diretor diret01 = new Diretor("Kai0", "234234234", 7000, "HB20");

        vet.add(ass01);
        vet.add(ger01);
        vet.add(diret01);

        vet.forEach(obj -> pol(obj));
    }
}
