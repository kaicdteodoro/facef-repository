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
        System.out.println("*Obj1*\nAno: "+obj1.ano+ "\nMarca: "+obj1.marca+"\nModelo: "+obj1.modelo+"\nMotor: "+obj1.motor+"\nVelocidade: "+obj1.velAtual);
        JOptionPane.showMessageDialog(null, "*Obj1*\nAno: "+obj1.ano+ "\nMarca: "+obj1.marca+"\nModelo: "+obj1.modelo+"\nMotor: "+obj1.motor+"\nVelocidade: "+obj1.velAtual);
      Carro obj2 = new Carro();
        obj2.ano = 2016;
        obj2.marca = "Fiat";
        obj2.modelo = "Palio";
        obj2.motor = true;
        obj2.velAtual = 40;
        System.out.println("*Obj1*\nAno: "+obj2.ano+ "\nMarca: "+obj2.marca+"\nModelo: "+obj2.modelo+"\nMotor: "+obj2.motor+"\nVelocidade: "+obj2.velAtual);
    }
    
}
