package ex02;

import javax.swing.*;

public class Aluno {
    private String nome;
    private int nAluno, idade;
    float p1, p2;

    public Aluno() {
    }

    public Aluno(int nAluno, String nome, int idade, float p1, float p2) {
        this.setnAluno(nAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    public final void setNome(String nome) {
        if (nome.length() > 0 && nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("Erro, tamanho do nome inválido!");
        }
    }

    public final void setnAluno(int nAluno) {
        String aux = Integer.toString(nAluno);
        if (aux.length() == 6) {
            this.nAluno = nAluno;
        } else {
            System.out.println("Erro! Número do aluno inválido!");
        }
    }

    public final void setIdade(int idade) {
        if (idade > 0 && idade < 120) {
            this.idade = idade;
        } else {
            System.out.println("Erro, idade invalida!");
        }
    }

    public final void setP1(float p1) {
        if (p1 > 0 && p1 <= 10) {
            this.p1 = p1;
        } else {
            System.out.println("Erro! Valor da primeira prova inválido");
        }
    }

    public final void setP2(float p2) {
        if (p2 > 0 && p2 <= 10) {
            this.p2 = p2;
        } else {
            System.out.println("Erro! Valor da segunda prova inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getnAluno() {
        return nAluno;
    }

    public int getIdade() {
        return idade;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }

    public void nFinal() {
        float nota = (this.getP1() + this.getP2()) / 2;
        JOptionPane.showMessageDialog(null, "Aluno: " + this.getNome() + ";\nNota final: " + nota + ";");
    }

    public void Mostra() {
        JOptionPane.showMessageDialog(null, "Númedo do aluno: " + this.getnAluno() + ";\nNome: " + this.getNome() + ";\nIdade: " + this.getIdade() + ";");
    }
}
