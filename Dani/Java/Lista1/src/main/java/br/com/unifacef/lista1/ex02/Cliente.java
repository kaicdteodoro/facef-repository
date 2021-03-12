package br.com.unifacef.lista1.ex02;

import javax.swing.*;

public class Cliente {
    int nConta, nAgencia;
    String nome;
    float saldo;

    public Cliente() {
    }

    public Cliente(int nConta, int nAgencia, String nome, float saldo) {
        this.nConta = nConta;
        this.nAgencia = nAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void Deposito(float x) {
        if (x > 0) {
            this.saldo += x;
        } else {
            System.out.println("Erro na tentativa de depósito, valor inválido!!");
        }
    }

    public void Saque(float x) {
        if (x <= this.saldo) {
            this.saldo -= x;
        } else {
            System.out.println("Erro na tentativa de saque, Saldo insuficiente!!");
        }
    }

    public void Mostra() {
        JOptionPane.showMessageDialog(null, "Conta: " + this.nConta + ";\nCliente: " + this.nome + ";\nSaldo Atual: " + this.saldo + ";");
    }


}
