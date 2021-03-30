package ex01;

public class Assistente extends Funcionario {
    private float valTransp;

    public Assistente() {
        super();
    }

    public Assistente(String nome, String rg, float salario, float valTransp) {
        super(nome, rg, salario);
        this.setValTransp(valTransp);
    }

    public final void setValTransp(float valTransp) {
        this.valTransp = valTransp;
    }

    public float getValTransp() {
        return valTransp;
    }

    @Override
    public String Mostra() {
        return "Assistente{" +
                "valTransp=" + valTransp +
                super.Mostra() +
                '}';
    }
}
