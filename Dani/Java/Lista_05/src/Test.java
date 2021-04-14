import java.util.ArrayList;

public class Test {
    public static void Show(String obj){
        System.out.println(obj.vota());
    }
    public static void main(String[] args) {
        Brasileiro br = new Brasileiro();
        Americano eu = new Americano();
        Alemao al = new Alemao();
        ArrayList vet = new ArrayList();
        vet.add(br);
        vet.add(eu);
        vet.add(al);
        vet.forEach(obj -> Show(obj));
    }
}
