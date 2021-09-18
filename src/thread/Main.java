package thread;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread threadEmail = new Thread(thread1);
        threadEmail.start();

        Thread threadNFCE = new Thread(thread2);
        threadNFCE.start();

        /*Código do sistema do usuário continua o fluxo de trabalho*/
        System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
        /*Fluxo do sistema, cadastro de venda, uma emissão de nota fiscal, algo do tipo*/
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
    }

    private static Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            for (int pos = 0; pos < 10; pos++) {
                System.out.println("Executando alguma rotina, por exemplo envio de email");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private static Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            for (int pos = 0; pos < 10; pos++) {
                System.out.println("Executando alguma rotina, por exemplo envio de email");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
}