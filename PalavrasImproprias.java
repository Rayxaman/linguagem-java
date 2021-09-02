/*
 Receba uma frase e verifique se essa frase possui palavras impróprias. 
 As palavras impróprias são: sexo e sexual. Caso encontre uma dessas palavras, 
 emita a mensagem “conteúdo impróprio”, caso contrário “conteúdo liberado”.
 */
package Frase;
import javax.swing.JOptionPane;
/**
 *
 * @author Rayssa
 */
public class PalavrasImproprias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase; 
        
        frase = JOptionPane.showInputDialog("Digite uma frase: " );
        
        if(frase.contains("sexo") || frase.contains("sexual")){
             JOptionPane.showMessageDialog(null, "\n Conteúdo impróprio");
         } else  {
             JOptionPane.showMessageDialog(null, "\n Conteúdo liberado");
         }  
        System.out.println("Obrigada por usar nosso programa!");
    }
}
