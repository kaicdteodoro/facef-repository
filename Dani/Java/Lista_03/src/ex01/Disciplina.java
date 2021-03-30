package ex01;

public class Disciplina {
    private String sigla;
    private int carga;
    private Professor professor;

    public Disciplina() {
        Professor professor = new Professor();
    }

    public Disciplina(String sigla, int carga, Professor professor) {
        this.setSigla(sigla);
        this.setCarga(carga);
        this.setProfessor(professor);
    }


    public String getSigla() {
        return sigla;
    }

    public final void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getCarga() {
        return carga;
    }

    public final void setCarga(int carga) {
        this.carga = carga;
    }

    public Professor getProfessor() {
        return professor;
    }

    public final void setProfessor(Professor professor) {
        this.professor = professor;
    }


    public String Mostra() {
        return "Disciplina{" +
                "sigla='" + sigla + '\'' +
                ", carga=" + carga +
                ", professor=" + this.professor.Mostra() +
                '}';
    }
}
