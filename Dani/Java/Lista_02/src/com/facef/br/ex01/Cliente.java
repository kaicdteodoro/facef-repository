package com.facef.br.ex01;

import javax.swing.*;

public class Cliente {
    private String nConta, nAgencia, nome;
    private float saldo;

    public Cliente() {
    }

    public Cliente(String nConta, String nAgencia, String nome, float saldo) {
        this.setnConta(nConta);
        this.setnAgencia(nAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public final void setnConta(String nConta) {
        if ((nConta.length() == 8) && (nConta.indexOf("-") == 6)) {
            this.nConta = nConta;
        } else {
            System.out.println("Erro no número da conta, número inválido!!");
        }
    }

    public final void setnAgencia(String nAgencia) {
        if ((nAgencia.length() == 6) && (nAgencia.indexOf("-") == 4)) {
            this.nAgencia = nAgencia;
        } else {
            System.out.println("Erro no número da agência, número inválido!!");
        }

    }

    public final void setNome(String nome) {
        if ((nome.length() > 0) && (nome.length() <= 30)) {
            this.nome = nome;
        } else {
            System.out.println("Erro! Quantidade de caracteres inválida para o nome!");
        }
    }

    public final void setSaldo(float saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser negativo!");
        }
    }

    public String getnConta() {
        return nConta;
    }

    public String getnAgencia() {
        return nAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void rDeposito(int x) {
        this.setSaldo(this.saldo + x);
    }

    public void rSaque(int x) {
        this.setSaldo(this.saldo - x);
    }

    public void Mostra(){
        JOptionPane.showMessageDialog(null,"Número da conta: "+this.nConta+";\nNúmero da agência: "+this.nAgencia+";\nNome: "+this.nome+";\nSaldo atual: "+this.saldo+";");
    }

}
