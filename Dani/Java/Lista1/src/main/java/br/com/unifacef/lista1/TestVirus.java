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
public class TestVirus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CriaÇÃO DE OJB: tIPO NOME = new Tipo()
      Virus obj1 = new Virus();
        // objeto.variavel
        obj1.nome = "Coringa Lírios";
        obj1.origem = "Onde come bicho estranho";
        obj1.vacina = true;
        obj1.letalidade = 0;
        System.out.println("*Obj1*\nNome: "+obj1.nome+"\nOrigem: "+obj1.origem+"\nVacina: "+obj1.vacina+"\nLetalidade: "+obj1.letalidade);
        JOptionPane.showMessageDialog(null, "*Obj1*\nNome: "+obj1.nome+"\nOrigem: "+obj1.origem+"\nVacina: "+obj1.vacina+"\nLetalidade: "+obj1.letalidade);
      Virus obj2 = new Virus();
        obj2.nome = "Amor";
        obj2.origem = "Confins da alma humana";
        obj2.vacina = false;
        obj2.letalidade = 100;
        System.out.println("*Obj1*\nNome: "+obj2.nome+"\nOrigem: "+obj2.origem+"\nVacina: "+obj2.vacina+"\nLetalidade: "+obj2.letalidade);
        JOptionPane.showMessageDialog(null, "*Obj1*\nNome: "+obj2.nome+"\nOrigem: "+obj2.origem+"\nVacina: "+obj2.vacina+"\nLetalidade: "+obj2.letalidade);
    }
    
}
