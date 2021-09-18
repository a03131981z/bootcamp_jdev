package thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{

    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilhaFila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

    public static void add(ObjetoFilaThread objetoFilaThread){
        pilhaFila.add(objetoFilaThread);
    }

    @Override
    public void run(){
        Iterator iteracao = pilhaFila.iterator();

        synchronized(iteracao) {/*Boquear o acesso a esta lista por outro processo*/
            while (iteracao.hasNext()) {/*Enquanto conter dados na lista irá processar*/
                ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/*Pega o objeto atual*/

                /*Processar 10 mil notas fiscais*/
                /*gerar uma lista enorme de PDF*/
                /*Gerar um envio em massa de email*/
                System.out.println("\n-------------------------------------------------------------------------------------------------------------\n");
                System.out.println(processar.getEmail());
                System.out.println(processar.getNome());

                iteracao.remove();

                try {
                    Thread.sleep(1000);/*Dar um tempo para descarga de memória*/
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
