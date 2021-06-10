package br.com.unifacef.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "medico")
public class Medico implements Serializable {

    public static final long serialVersionUID = 3248834847247078033L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String especialidade;
    private boolean fazCirurgia;
    private int crm;

    public Medico() {
    }

    public Medico(Long id, String nome, String especialidade, boolean fazCirurgia, int crm) {
        this.setId(id);
        this.setNome(nome);
        this.setEspecialidade(especialidade);
        this.setFazCirurgia(fazCirurgia);
        this.setCrm(crm);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public final void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isFazCirurgia() {
        return fazCirurgia;
    }

    public final void setFazCirurgia(boolean fazCirurgia) {
        this.fazCirurgia = fazCirurgia;
    }

    public int getCrm() {
        return crm;
    }

    public final void setCrm(int crm) {
        this.crm = crm;
    }
}
