package ex01;

public class Gerente extends Funcionario {
    private float bonus;

    public Gerente() {
        super();
    }

    public Gerente(String nome, String rg, float salario, float bonus) {
        super(nome, rg, salario);
        this.setBonus(bonus);
    }

    public float getBonus() {
        return bonus;
    }

    public final void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String Mostra() {
        return "Gerente{" +
                "bonus=" + bonus + super.Mostra() +
                '}';
    }
}
