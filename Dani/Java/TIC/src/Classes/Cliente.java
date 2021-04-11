package Classes;

public class Cliente {
    private int codCliente;
    private String nomeCliente, endereco, email;

    public Cliente(){

    }
    public Cliente(String nomeCliente, String endereco, String email) {
        this.setNomeCliente(nomeCliente);
        this.setEndereco(endereco);
        this.setEmail(email);
    }

    public final void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
        //ver como requerir o codigo do servidor, caso seja cadastrado
    }

    public final void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }
}
