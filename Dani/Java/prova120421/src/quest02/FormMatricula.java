package quest02;

import java.util.Date;

public class FormMatricula {
    private String nome, endereco;
    private int cpf, rg;
    private Date nascimento;

    public FormMatricula() {
    }

    public FormMatricula(String nome, String endereco, int cpf, int rg, Date nascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
        this.nascimento = nascimento;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public final void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public final void setRg(int rg) {
        this.rg = rg;
    }

    public final void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public int getRg() {
        return rg;
    }

    public Date getNascimento() {
        return nascimento;
    }


    public String Mostra() {
        return "FormMatricula{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf=" + cpf +
                ", rg=" + rg +
                ", nascimento=" + nascimento +
                '}';
    }
}
