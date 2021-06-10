package Classes;

public class Cliente implements CRUD {
    private int cod;
    private String nome, endereco, email;

    public Cliente() {

    }

    public Cliente(int cod, String nome, String endereco, String email) {
        this.setCod(cod);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setEmail(email);
    }

    public final void setCod(int cod) {
        this.cod = cod;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public int getCodCliente() {
        return cod;
    }

    public String getNomeCliente() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public void Altera() {

    }

    @Override
    public void Deletar() {

    }

    @Override
    public String Mostra() {
        return "Cliente{" +
                "codCliente=" + cod +
                ", nomeCliente='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void Cadastra() {

    }
}
