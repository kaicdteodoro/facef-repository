package br.com.unifacef.Model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    public static final long serialVersionUID = -2353705648797815641L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cnpj;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String email, String cnpj) {
        this.setId(id);
        this.setNome(nome);
        this.setEmail(email);
        this.setCnpj(cnpj);
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
