/*
 Construa uma classe que receba uma frase qualquer e mostre essa
 frase de trás para a frente e sem espaços em branco.
 */
package Frase;
import javax.swing.JOptionPane;
/**
 *
 * @author Rayssa
 */
public class InvertidaSemEspaço {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        frase = JOptionPane.showInputDialog("Digite uma frase: " );
        frase = new StringBuilder(frase).reverse().toString();
        System.out.println(frase.replace(" ", ""));
    }   
}
