package ex02;

public class Passageiro {
    private String nome, cpf;

    public Passageiro() {
    }

    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


    public String Mostra() {
        return "Passageiro{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
