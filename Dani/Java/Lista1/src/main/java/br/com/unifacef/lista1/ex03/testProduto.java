package br.com.unifacef.lista1.ex03;

public class testProduto {
    public static void main(String[] args) {
        Produto obj1 = new Produto(12, "Jaqueta Cyclon", 20, 490);
        Produto obj2 = new Produto();
        obj2.id = 50;
        obj2.descr = "Colchão de mola ensacada";
        obj2.qte = 77;
        obj2.prec = 800;

        obj1.comprar(7);
        obj1.vender(26);
        obj1.descer(2);
        obj1.subir(7);
        obj1.mostra();

        obj2.comprar(12);
        obj2.vender(25);
        obj2.descer(12);
        obj2.subir(15);
        obj2.mostra();


    }
}
