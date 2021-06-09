package br.com.unifacef.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Medico")
public class Medico {
    @Id
    private String id;

    private String nome;
    private int crm;
    private String especialidade;

    public Medico() {
    }

    public Medico(String id, String nome, int crm, String especialidade) {
        this.setId(id);
        this.setNome(nome);
        this.setCrm(crm);
        this.setEspecialidade(especialidade);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
