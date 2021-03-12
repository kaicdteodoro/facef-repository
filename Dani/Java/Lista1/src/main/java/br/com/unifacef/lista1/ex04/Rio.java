package br.com.unifacef.lista1.ex04;

import javax.swing.*;

public class Rio {
    String nome;
    float nivel;
    boolean poluido;

    public Rio() {
    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void Chover(float x) {
        if (x > 0) {
            this.nivel += x;
        } else {
            System.out.println("Erro, valor de chuva inválido!");
        }
    }

    public void Ensolarar(float x) {
        if (x > 0) {
            if (x <= this.nivel) {
                this.nivel -= x;
            } else {
                System.out.println("Erro, valor de ensolarar inválido!");
            }
        } else {
            System.out.println("Erro, valor de ensolarar inválido!");
        }
    }

    public void Limpar() {
        if (this.poluido) {
            this.poluido = false;
        } else {
            System.out.println("O rio já se encontra limpo!");
        }
    }

    public void Sujar() {
        if (!this.poluido) {
            this.poluido = true;
        } else {
            System.out.println("O rio já se encontra sujo!");
        }
    }

    public void mostra() {
        JOptionPane.showMessageDialog(null, "Nome do Rio: " + this.nome + ";\nNível atual: " + this.nivel + ";\nPoluido?: " + this.poluido + ";");
    }
}
