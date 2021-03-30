package br.com.unifacef.lista1.ex04;

public class testRio {
    public static void main(String[] args) {
        Rio obj1 = new Rio("Corguim da Sul", 100, true);
        Rio obj2 = new Rio();
        obj2.nome = "Rifaina Beatch";
        obj2.nivel = 201200;
        obj2.poluido = false;

        obj1.Chover(150);
        obj1.Ensolarar(40);
        obj1.Limpar();
        obj1.mostra();

        obj2.Chover(200);
        obj2.Ensolarar(80);
        obj2.Sujar();
        obj2.mostra();

    }
}
