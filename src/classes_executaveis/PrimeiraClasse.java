package classes_executaveis;
import cursojava_constantes.StatusAluno;
import cursojava_jdev.Aluno;
import cursojava_jdev.Disciplina;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrimeiraClasse {

    @SuppressWarnings("rawtypes")
    public static void main(String args[]) {

        Aluno aluno1 = new Aluno("Lindembergh", 26);
        String login = JOptionPane.showInputDialog("Informe o login");
        String senha = JOptionPane.showInputDialog("Informe a senha");
        if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

            List<Aluno> alunos = new ArrayList<Aluno>();

            /*Abaixo temos uma lista que dentro dela temos uma chave que identifica uma sequência de valores também*/
            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

            for (int qtd = 1; qtd <= 2; qtd++) {

                /*Equals e hashCode (Diferenciar e comparar objetos)*/
                //Disciplina disciplina = new Disciplina();

            /*aluno1.setNome("Lindembergh");
            aluno1.setNumeroCpf("123");

            Aluno aluno2 = new Aluno();
            aluno2.setNome("Lindembergh");
            aluno2.setNumeroCpf("123");

            if(aluno1.equals(aluno2)) {
                System.out.println("Alunos são iguais");

            }else{
                System.out.println("Alunos não são iguais");
            }

            System.out.println(aluno1.hashCode());*/

                String nome = JOptionPane.showInputDialog("Nome do aluno " + qtd + "º");
            /*String idade = JOptionPane.showInputDialog("Digite sua idade: ");
            String registroGeral = JOptionPane.showInputDialog("RG: ");
            String numeroCpf = JOptionPane.showInputDialog("CPF: ");
            String nomeMae = JOptionPane.showInputDialog("Nome mãe: ");
            String nomePai = JOptionPane.showInputDialog("Nome pai: ");
            String dataMatricula = JOptionPane.showInputDialog("Data matrícula: ");
            String nomeEscola = JOptionPane.showInputDialog("Nome escola: ");
            String serieMatriculado = JOptionPane.showInputDialog("Ano série: ");
            String dataNasc = JOptionPane.showInputDialog("Data de nascimento: ");

            /*String disciplina1 = JOptionPane.showInputDialog("Disciplina 1: ");
            String nota1 = JOptionPane.showInputDialog("Nota 1ª: ");

            String disciplina2 = JOptionPane.showInputDialog("Disciplina 2: ");
            String nota2 = JOptionPane.showInputDialog("Nota 2ª: ");

            String disciplina3 = JOptionPane.showInputDialog("Disciplina 3: ");
            String nota3 = JOptionPane.showInputDialog("Nota 3ª: ");

            String disciplina4 = JOptionPane.showInputDialog("Disciplina 4: ");
            String nota4 = JOptionPane.showInputDialog("Nota 4ª: ");*/

                aluno1.setNome(nome);
            /*aluno1.setIdade(Integer.valueOf(idade));//Só aceitou esse valueOf, o parseInteger deu erro.
            aluno1.setRegistroGeral(registroGeral);
            aluno1.setNumeroCpf(numeroCpf);
            aluno1.setNomeMae(nomeMae);
            aluno1.setNomePai(nomePai);
            aluno1.setDataMatricula(dataMatricula);
            aluno1.setNomeEscola(nomeEscola);
            aluno1.setSerieMatriculado(serieMatriculado);
            aluno1.setDataNascimento(dataNasc);*/

                /*for (int pos = 1; pos <= 1; pos++) {
                    String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "º: ");
                    String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "º: ");
                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(nomeDisciplina);
                    disciplina.setNota(Double.valueOf(notaDisciplina));

                    aluno1.getDisciplinas().add(disciplina);
                }*/
                int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
                if (escolha == 0) { //Zero é a opção sim/yes
                    int continuarRemover = 0;
                    int posicao = 1;
                    while (continuarRemover == 0) {
                        String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
                        aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                        posicao++;
                        continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
                    }
                }
                alunos.add(aluno1);

            }
            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

            for (Aluno aluno : alunos) {
                if (aluno.getALunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    maps.get(StatusAluno.APROVADO).add(aluno);

                } else if (aluno.getALunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    maps.get(StatusAluno.RECUPERACAO).add(aluno);

                } else if (aluno.getALunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
                    maps.get(StatusAluno.REPROVADO).add(aluno);
                }
            }

            System.out.println("Lista dos aprovados");
            for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                System.out.println("Resultado = " + aluno.getALunoAprovado2() + " com média de = " + aluno.getMedia());
            }

            System.out.println("Lista dos em recuperação");
            for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println("Resultado = " + aluno.getALunoAprovado2() + " com média de = " + aluno.getMedia());
            }

            System.out.println("Lista dos reprovados");
            for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                System.out.println("Resultado = " + aluno.getALunoAprovado2() + " com média de = " + aluno.getMedia());
            }
        }
    }
}
