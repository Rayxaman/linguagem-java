/*
    Trabalhando com ArrayList Unidimensional
 */
package vetores;
import java.util.*;
/**
 *
 * @author Rayssa
 */
public class testArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaração
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<Integer> idades_2 = new ArrayList<>();
        
        //Edição        
        idades.add(10);
        idades.add(20);
        idades.add(0, 1);
        System.out.println(idades);
        
        idades.remove(0);   //Comando serve para remover índice ou objeto
        System.out.println(idades);
        
        idades_2.add(50);
        idades_2.add(40);
        System.out.println(idades_2);
        
        idades.addAll(idades_2);    //Concatenação
        System.out.println(idades);
        
        Collections.sort(idades);
        Collections.reverse(idades);
        System.out.println(idades);
        
        //Percorrendo o índice
        for(int i = 0; i < idades.size(); i++){
            System.out.print(i + "\t");
        }
        
        System.out.print("\n");
        
        //Percorrendo o conteúdo
        for(int item : idades){
            System.out.print(item + "\t");
        }
        
        //Randomização
        ArrayList<Double> peso = new ArrayList<>();

        for (int i=0; i<10; i++){
          peso.add(Math.random()*100);
        }
        System.out.println(peso);
        
    }
    
}
