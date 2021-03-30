package ex01;

public class Professor {
    private String nome, rg;

    public Professor() {
    }

    public Professor(String nome, String rg) {
        this.setNome(nome);
        this.setRg(rg);
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public final void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String Mostra() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                '}';
    }
}
