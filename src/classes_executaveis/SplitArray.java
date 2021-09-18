package classes_executaveis;
import java.util.Arrays;
import java.util.List;

public class SplitArray {

    public static void main(String []args){

        String texto = "Lindembergh, Emma, Taylor, Selena, Ariana";
        String[] valoresArray = texto.split(",");
        System.out.println(valoresArray[0]);
        System.out.println(valoresArray[1]);
        System.out.println(valoresArray[2]);
        System.out.println(valoresArray[3]);
        System.out.println(valoresArray[4]);
        for(int k=0; k<valoresArray.length; k++){
            System.out.println(valoresArray[k]);
        }

        //Convertendo um array em uma lista
        System.out.println("\n--------------------------------------------------------------------------\n");
        List<String> lista = Arrays.asList(valoresArray);
        for(String valor: lista){
            System.out.println(valor);
        }
        /*Converter uma lista para Array*/
        System.out.println("\n--------------------------------------------------------------------------\n");
        String [] conversaoArray = lista.toArray(new String[4]);
        for(int k=0; k<conversaoArray.length; k++){
            System.out.println(conversaoArray[k]);
        }
    }
}
