/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizes;

import java.util.ArrayList;

/**
 *
 * @author Rayssa
 */
public class testeArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mtx = new ArrayList<>();
        ArrayList<Integer> linha_1 = new ArrayList<>();
        mtx.add(linha_1);
        
        for (int i=0; i<50; i++){
            linha_1.add((int) (Math.random()*100));
        }
        
        for (ArrayList<Integer> linha : mtx){   
           for(int item : linha){
               System.out.print(item + "\t");
           } 
        }
        //ESSE FOR TAMBÉM PODE SER ESCRITO DA SEGUINTE MANEIRA:
        /*
        mtx.forEach(linha -> {
            linha.forEach(item -> {
                System.out.print(item + "\t");
            });
        });
        */
    }
    
}
