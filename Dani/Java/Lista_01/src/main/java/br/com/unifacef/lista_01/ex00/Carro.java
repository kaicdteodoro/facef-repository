/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.lista_01.ex00;

import javax.swing.*;

/**
 * @author TheGa
 */
public class Carro {
    //Declaração de variáveis
    //Não esqueçer da tipagem estática
    //Minúsculo é primitivo, Maiúsculo é classe;
    String marca;
    String modelo;
    int ano;
    boolean motor;
    float velAtual;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, boolean motor, float velAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
        this.velAtual = velAtual;
    }

    public void Ligar() {
        if (!this.motor) {
            this.motor = true;
        } else {
            System.out.println(this.modelo + " já se encontra ligado!");
        }
    }

    public void Desligar() {
        if (this.motor) {
            this.motor = false;
        } else {
            System.out.println(this.modelo + " já se encontra desligado!");
        }
    }

    public void Acelerar(int x) {
        if (this.motor) {
            if (!((this.velAtual + x) < this.velAtual)) {
                this.velAtual += x;
            }
        } else {
            System.out.println("Motor desligado, impossível a aceleração!");
        }
    }

    public void Frear(int x) {
        if (this.motor) {
            if (((this.velAtual - x) < this.velAtual)&&((this.velAtual - x) >= 0)) {
                this.velAtual -= x;
            } else{
                System.out.println("Valor para frenagem inválido!!");
            }
        } else {
            System.out.println("Motor desligado, impossível a frenagem!");
        }
    }

    public void Mostra(String nome) {
        JOptionPane.showMessageDialog(null, "*" + nome + "*\nAno: " + this.ano + "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nMotor: " + this.motor + "\nVelocidade: " + this.velAtual);
    }
}
