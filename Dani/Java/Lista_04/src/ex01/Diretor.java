package ex01;

public class Diretor extends Funcionario {
    private String carro;

    public Diretor() {
        super();
    }

    public Diretor(String nome, String rg, float salario, String carro) {
        super(nome, rg, salario);
        this.setCarro(carro);
    }

    public final void setCarro(String carro) {
        this.carro = carro;
    }

    public String getCarro() {
        return carro;
    }

    @Override
    public String Mostra() {
        return "Diretor{" +
                "carro='" + this.carro + '\'' + super.Mostra() +
                '}';
    }
}
