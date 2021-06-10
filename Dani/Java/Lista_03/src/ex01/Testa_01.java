package ex01;

public class Testa_01 {
    public static void main(String[] args) {
        Professor obj1 = new Professor("Kaic", "02310312");
        Disciplina obj2 = new Disciplina("Es2", 89, obj1);
        System.out.println(obj2.Mostra());
    }
}
