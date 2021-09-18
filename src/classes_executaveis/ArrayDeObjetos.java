package classes_executaveis;

import cursojava_jdev.Aluno;
import cursojava_jdev.Disciplina;

public class ArrayDeObjetos {

    public static void main(String[] args){

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lindembergh Madruga");
        aluno1.setNomeEscola("Jdev Treinamentos");
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Curso de Java");
        disciplina1.setNota(new double[]{8.4, 8.8, 10.0, 5.6});
        aluno1.getDisciplinas().add(disciplina1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Lindembergh Madruga");
        aluno2.setNomeEscola("Udemy");
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Curso de Python");
        disciplina2.setNota(new double[]{5.9, 8.1, 5.0, 9.6});
        aluno2.getDisciplinas().add(disciplina2);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Lindembergh Madruga");
        aluno3.setNomeEscola("Alura");
        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Curso de PHP");
        disciplina3.setNota(new double[]{9.9, 4.4, 5.6, 10.0});
        aluno3.getDisciplinas().add(disciplina3);

        Aluno aluno4 = new Aluno();
        aluno4.setNome("Lindembergh Madruga");
        aluno4.setNomeEscola("Devmedia");
        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Curso de JavaScript");
        disciplina4.setNota(new double[]{5.0, 7.7, 9.2, 6.6});
        aluno4.getDisciplinas().add(disciplina4);

        Aluno[] alunos = new Aluno[4];
        alunos[0] = aluno1;
        alunos[1] = aluno2;
        alunos[2] = aluno3;
        alunos[3] = aluno4;

        for(int pos=0; pos<alunos.length; pos++){
            System.out.println("\n==================================================================================================\n");
            System.out.println("Nome do aluno é: "+alunos[pos].getNome());
            for(Disciplina d: alunos[pos].getDisciplinas()){
                System.out.println("Nome da disciplina é: "+d.getDisciplina());
                for(int posNota=0; posNota<d.getNota().length; posNota++){
                    System.out.println("A nota número "+(posNota+1)+" é igual = "+d.getNota()[posNota]);
                }
            }
        }
    }
}
