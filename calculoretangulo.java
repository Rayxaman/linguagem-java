/*
 Para entrada e saída de dados, crie um programa que receba 
 a base e altura de um retângulo e calcule o perímetro e a área.
 */
package CalculoDeRetangulo;

import javax.swing.JOptionPane;
/**
 *
 * @author Rayssa
 */
public class calculoretangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String aux= "";
        float base= 0, alt= 0, area= 0, per= 0;
        
        aux= JOptionPane.showInputDialog ("Indique a base: ");
        base = Float.parseFloat (aux);
        
        aux= JOptionPane.showInputDialog("Indique a altura: ");
        alt = Float.parseFloat(aux);
        
        area = (base * alt);
        per = (base + alt)*2;
        
        JOptionPane.showMessageDialog(null, "Retangulo: \n" + "A área  é: " + area + ". \n O perímetro é: " + per);
        //JOptionPane.showMessageDialog(null, "A área do retangulo é: " + area);
        //JOptionPane.showMessageDialog(null, "O perímetro do retangulo é: " + per);
     }
    
}
