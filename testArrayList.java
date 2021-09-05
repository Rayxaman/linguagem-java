/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;
import java.util.ArrayList;
/**
 *
 * @author Rayssa
 */
public class testArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> peso = new ArrayList<>();

        for (int i=0; i<10; i++){
          peso.add(Math.random()*100);
        }
        System.out.println(peso);
        
    }
    
}
