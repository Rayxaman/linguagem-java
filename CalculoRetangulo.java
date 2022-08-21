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
        float base= 0, alt= 0, area= 0, per= 0;
        
        base = Float.parseFloat (JOptionPane.showInputDialog ("Indique a base: "));
        alt = Float.parseFloat (JOptionPane.showInputDialog("Indique a altura: "));
        
        area = (base * alt);
        per = (base + alt)*2;
        
        JOptionPane.showMessageDialog(null, "Retangulo: \n" + "A área  é: " + area + ". \n O perímetro é: " + per);
     }    
}
        /*
        aux= JOptionPane.showInputDialog ("Indique a base: ");
        base = Float.parseFloat (aux);
        
        aux= JOptionPane.showInputDialog("Indique a altura: ");
        alt = Float.parseFloat(aux); 
        
        JOptionPane.showMessageDialog(null, "A área do retangulo é: " + area);
        JOptionPane.showMessageDialog(null, "O perímetro do retangulo é: " + per);
        */
