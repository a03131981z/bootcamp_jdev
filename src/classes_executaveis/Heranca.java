package classes_executaveis;

import cursojava_jdev.Aluno;
import cursojava_jdev.Diretor;
import cursojava_jdev.Pessoa;
import cursojava_jdev.Secretario;

public class Heranca {

    public static void main(String args[]){

        Aluno aluno = new Aluno();
        aluno.setNome("Lindembergh");
        aluno.setIdade(26);
        aluno.setNomeEscola("UFPB");

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("6739430545");
        diretor.setNome("José");
        diretor.setIdade(56);

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setNumeroCpf("679043");
        secretario.setIdade(18);

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);

        System.out.println(aluno.pessoaMaiorIdade()+" - "+aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());

        System.out.println("Salário aluno é = "+aluno.salario());
        System.out.println("Salário diretor é = "+diretor.salario());
        System.out.println("Salário secretário é = "+secretario.salario());

        teste(aluno);
        teste(diretor);
        teste(secretario);
    }

    public static void teste(Pessoa pessoa){
        System.out.println("Essa pessoa é demais = "+pessoa.getNome()+" e o salário é = "+pessoa.salario());
    }
}
