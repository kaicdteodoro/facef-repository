package br.com.unifacef.lista1.ex02;

public class testCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(101010, 123456, "Kaic Teodoro", 760);
        obj1.Deposito(40);
        obj1.Mostra();
        obj1.Saque(100);
        obj1.Mostra();
        Cliente obj2 = new Cliente(101009, 789123, "Maria Beatriz", 2000);
        obj2.Deposito(40);
        obj2.Mostra();
        obj2.Saque(100);
        obj2.Mostra();
    }
}
