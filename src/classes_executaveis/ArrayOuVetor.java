package classes_executaveis;
import cursojava_jdev.Aluno;
import cursojava_jdev.Disciplina;

import javax.swing.JOptionPane;

public class ArrayOuVetor {

    public static void main(String args[]){

        String posicoes = JOptionPane.showInputDialog("Quantas notas? ");
        double notas[] = new double[Integer.parseInt(posicoes)]; //posicoes.length() não serve

        for(int pos=0; pos<notas.length; pos++) {
            String valor = JOptionPane.showInputDialog("Nota "+(pos+1));
            notas[pos] = Double.valueOf(valor); //pode usar o parseDouble() tb
            System.out.println("Imprimindo..."+notas[pos]);
        }

        double[] valores = {9.8, 6.7, 8.8};
        System.out.println(valores[0]);

        Aluno aluno = new Aluno();
        aluno.setNome("Lindembergh Madruga");
        aluno.setNomeEscola("Jdev Treinamentos");
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso de Java");
        disciplina.setNota(new double[]{8.4, 8.8, 10.0, 5.6});
        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Curso de Java");
        disciplina2.setNota(new double[]{4.9, 5.8, 9.0, 7.6});
        aluno.getDisciplinas().add(disciplina2);

        System.out.println("Nome do aluno = "+aluno.getNome()+" inscrito no curso: "+aluno.getNomeEscola());
        for(Disciplina d : aluno.getDisciplinas()){
            System.out.println("============================= Disciplina do aluno =============================");
            System.out.println("Disciplina: "+d.getDisciplina());
            System.out.println("As notas da disciplina são: ");
            double notaMax = 0.0;
            double notaMin = 0.0;
            for(int pos=0; pos<d.getNota().length; pos++){
                System.out.println("Nota "+(pos+1)+" é igual = "+d.getNota()[pos]);
                if(pos == 0){
                    notaMax = d.getNota()[pos];

                }else{
                    if(d.getNota()[pos] > notaMax){
                        notaMax = d.getNota()[pos];
                    }
                }
                if(pos == 0){
                    notaMin = d.getNota()[pos];

                }else{
                    if(d.getNota()[pos] < notaMin){
                        notaMin = d.getNota()[pos];
                    }
                }

            }
            System.out.println("A maior nota foi: "+notaMax+"\nA menor nota foi: "+notaMin);
        }
    }
}
