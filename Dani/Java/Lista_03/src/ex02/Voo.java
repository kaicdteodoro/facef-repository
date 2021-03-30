package ex02;

public class Voo {
    private int num;
    private String origem, destino;

    public Voo() {
    }

    public Voo(int num, String origem, String destino) {

        this.setNum(num);
        this.setOrigem(origem);
        this.setDestino(destino);

    }

    public final void setNum(int num) {
        this.num = num;
    }

    public final void setOrigem(String origem) {
        this.origem = origem;
    }

    public final void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNum() {
        return num;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public String Mostra() {
        return "Voo{" +
                "num=" + num +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}
