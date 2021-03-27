package com.facef.br.ex01;

public class testCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente("123456-8", "1234-6", "Maria Beatriz", 20000);
        obj1.rDeposito(10000);
        obj1.Mostra();
        obj1.rSaque(3000);
        obj1.Mostra();
    }
}
