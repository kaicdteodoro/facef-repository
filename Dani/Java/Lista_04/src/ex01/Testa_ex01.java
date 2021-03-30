package ex01;

public class Testa_ex01 {
    public static void main(String[] args) {
        Assistente ass01 = new Assistente("Kaic", "234234234", 5000, 230);
        Gerente ger01 = new Gerente("Mario", "5634565436", 2500, 500);
        Diretor diret01 = new Diretor("Kai0", "234234234", 7000,"HB20");
        System.out.println(ass01.Mostra());
        System.out.println(ger01.Mostra());
        System.out.println(diret01.Mostra());

    }
}
