package quest02;

import java.util.Date;

public class FormRegistro {
    private int numRegistro;
    private Date dataRegistro;
    private FormMatricula aluno;

    public FormRegistro() {
        FormMatricula aluno = new FormMatricula();
    }

    public FormRegistro(int numRegistro, Date dataRegistro, FormMatricula aluno) {
        this.setNumRegistro(numRegistro);
        this.setDataRegistro(dataRegistro);
        this.setAluno(aluno);
    }

    public final void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public final void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public final void setAluno(FormMatricula aluno) {
        this.aluno = aluno;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public FormMatricula getAluno() {
        return aluno;
    }


    public String Mostra() {
        return "FormRegistro{" +
                "numRegistro=" + numRegistro +
                ", dataRegistro=" + dataRegistro +
                ", aluno=" + this.aluno.Mostra() +
                '}';
    }
}
