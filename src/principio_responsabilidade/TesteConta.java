package principio_responsabilidade;

public class TesteConta {

    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria();
        conta.setDescricao("Conta corrente de Lindembergh");
        System.out.println(conta);
        conta.diminui100Reais();
        System.out.println(conta);
        conta.sacarDinheiro(750);
    }
}
