package br.com.unifacef.lista1.ex01;

import javax.swing.*;

public class Aluno {
    int nAluno, idade;
    float p1, p2;
    String nome;

    public Aluno() {
    }

    public Aluno(int nAluno, String nome, int idade, float p1, float p2) {
        this.nAluno = nAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void notaFinal(){
        JOptionPane.showMessageDialog(null,"Aluno: "+this.nome+";\nNota Final: "+((this.p1 + this.p2) / 2)+";");
    }

    public void dadosAluno(){
        JOptionPane.showMessageDialog(null,"Aluno: "+this.nome+";\nNúmero: "+this.nAluno+";\nIdade: "+this.idade+";");
    }

    public void passou(){
       if(((this.p1+this.p2)/2) > 5){
           JOptionPane.showMessageDialog(null, "E alune "+this.nome+" passou!");
       } else{
           JOptionPane.showMessageDialog(null, "E alune "+this.nome+" não passou!");
       }
    }

}
