/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.lista1;

import javax.swing.JOptionPane;

/**
 *
 * @author TheGa
 */
public class TestaCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CriaÇÃO DE OJB: tIPO NOME = new Tipo()
      Carro obj1 = new Carro();
        // objeto.variavel
        obj1.ano = 2018;
        obj1.marca = "Chevrolet";
        obj1.modelo = "Onix";
        obj1.motor = false;
        obj1.velAtual = 0;
        obj1.Mostra("Primeiro Objeto");

      Carro obj2 = new Carro("Fiat", "Palio", 2016, true, 40);
        obj2.Mostra("Segundo Objeto");
        obj2.Acelerar(20);
        obj2.Mostra("Segundo Objeto");
        obj2.Frear(40);
        obj2.Mostra("Segundo Objeto");
        obj2.Ligar();
        obj2.Mostra("Segundo Objeto");
    }
    
}
