package cursojava_jdev;

import java.util.Objects;

public class Disciplina {

    private double notas[] = new double[4];
    private String disciplina;

    public double[] getNota(){
        return this.notas;
    }

    public void setNota(double[] notas){
        this.notas = notas;
    }

    public String getDisciplina(){
        return this.disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public double getMediaNotas(){
        double media = 0.0;
        for(int pos=0; pos<notas.length; pos++) {
            media += this.notas[pos];
        }
        return media/notas.length;
    }

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Double.compare(that.nota, nota) == 0 && Objects.equals(disciplina, that.disciplina);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(notas, disciplina);
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nota=" + notas + ", disciplina='" + disciplina + '\'' + '}';
    }
}
