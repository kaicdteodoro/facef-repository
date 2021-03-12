package br.com.unifacef.lista1.ex03;

import javax.swing.*;

public class Produto {
    int id, qte;
    String descr;
    float prec;

    public Produto(int id, String descr, int qte, float prec) {
        this.id = id;
        this.descr = descr;
        this.qte = qte;
        this.prec = prec;
    }

    public Produto() {
    }

    public void comprar(int x) {
        if (x > 0) {
            this.qte += x;
        } else {
            System.out.println("Erro de compra, valor inválido!");
        }
    }

    public void vender(int x) {
        if (x <= this.qte) {
            this.qte -= x;
        } else {
            System.out.println("Erro de venda, saldo insuficiente!");
        }
    }

    public void subir(int x) {
        if (x > 0) {
            this.prec += x;
        } else {
            System.out.println("Erro de aumento de preço, valor inválido!");
        }
    }

    public void descer(int x) {
        if (x > 0) {
            if (x <= this.prec) {
                this.prec -= x;
            } else {
                System.out.println("Erro de diminuição de preço, valor inválido!");
            }
        } else {
            System.out.println("Erro de diminuição de preço, valor inválido!");
        }
    }

    public void mostra() {
        JOptionPane.showMessageDialog(null, "Id Produto: " + this.id + ";\nDescrição: " + this.descr + ";\nQuantidade: " + this.qte + ";\nPreço: " + this.prec + ";");
    }
}
