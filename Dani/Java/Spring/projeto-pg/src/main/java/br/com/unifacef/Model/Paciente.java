package br.com.unifacef.Model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {

    public static final long serialVersionUID = -2353705648797815641L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private float altura;

    public Paciente() {
    }

    public Paciente(Long id, String nome, int idade, float altura) {
        this.setId(id);
        this.setNome(nome);
        this.setIdade(idade);
        this.setAltura(altura);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public final void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public final void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public final void setAltura(float altura) {
        this.altura = altura;
    }
}
