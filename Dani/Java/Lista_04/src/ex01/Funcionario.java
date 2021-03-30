package ex01;

public class Funcionario {
    protected String nome, rg;
    protected float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String rg, float salario) {
        this.setNome(nome);
        this.setRg(rg);
        this.setSalario(salario);
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public final void setRg(String rg) {
        this.rg = rg;
    }

    public final void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public float getSalario() {
        return salario;
    }

    public String Mostra() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", salario=" + salario +
                '}';
    }
}
