package cursojava_jdev;
import cursojava_constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa{

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private Pessoa pessoa = null;

    public Aluno(String nome, int idade){
        super(nome, idade);
        this.setNome(nome);
        this.setIdade(idade);
    }

    public Aluno(){

    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public List<Disciplina> getDisciplinas(){
        return this.disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas){
        this.disciplinas = disciplinas;
    }

    public double getMedia() {
        double resultado = 0.0;
        for(Disciplina disciplina: disciplinas){
            for(int pos=0; pos<disciplina.getNota().length; pos++) {
                resultado += disciplina.getNota()[pos] / disciplinas.size();//Pega o total de disciplinas com size e divide com a soma das notas totais
            }
        }
        return resultado;
    }

    public boolean getAlunoAProvado() { //Método que retorna true para aprovado e false para reprovado
        double media = this.getMedia();
        if(media >= 5.0){
            return true;

        }else {
            return false;
        }
    }

    public String getALunoAprovado2() {
        if(this.getMedia() >= 5.0) {
            if(this.getMedia() >= 7.0) {
                return StatusAluno.APROVADO;
            }else{
                return StatusAluno.RECUPERACAO;
            }
        }else {
            return StatusAluno.REPROVADO;
        }
    }

    @Override
    public String toString() {
        return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
                + serieMatriculado+"]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(pessoa.getNome(), pessoa.getNumeroCpf());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        return Objects.equals(pessoa.getNome(), pessoa.getNome()) && Objects.equals(pessoa.getNumeroCpf(), pessoa.getNumeroCpf());
    }

    @Override
    public boolean pessoaMaiorIdade(){
        return super.getIdade() >= 21;
    }

    public String msgMaiorIdade(){
        return this.pessoaMaiorIdade() ? "Vc é maior de idade" : "Vc  não é maior de idade";
    }

    @Override
    public double salario() {
        return 677;
    }
}
