package classes_executaveis;
import java.util.Scanner;

public class Matrizes {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int notas[][] = new int[2][2];
        notas[0][0] = 150;
        notas[0][1] = 1234;
        //notas[0][2] = 234;

        notas[1][0] = 200;
        notas[1][1] = 9;
        //notas[1][2] = 2;
        for (int k=0; k<notas.length; k++){
            for(int c=0; c<notas[k].length; c++) {
                System.out.println(notas[k][c]);
            }
        }

        for(int posLinha=0; posLinha<notas.length; posLinha++){
            for(int posColuna=0; posColuna<notas[posLinha].length; posColuna++) {
                System.out.print("Primeira linha: ");
                sc.nextInt();
                notas[posLinha][posColuna] = sc.nextInt();
            }
        }
        for(int c=0; c<notas.length; c++){
            for(int k=0; k<notas[c].length; k++){
                System.out.print(notas[c][k]+" ");
            }
        }
    }
}
