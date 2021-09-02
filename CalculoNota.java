/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotaMedia;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class CalculoNota {
     public static void main(String[] args) {
        String aux;
        float nota1, nota2, media;
        
        aux= JOptionPane.showInputDialog ("Indique a primeira nota: ");
        nota1 = Float.parseFloat (aux);
        
        aux= JOptionPane.showInputDialog("Indique a segunda nota: ");
        nota2 = Float.parseFloat(aux);
        
        media = (nota1 + nota2)/2;
        
        JOptionPane.showMessageDialog(null, "A média do aluno é: " + media);
     }
    
}
