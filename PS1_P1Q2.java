/*
 * Escreva um programa que receba uma palavra e verifique se ela é palíndromo 
 * (que tem a mesma sequência de letras quando lida da direita para esquerda ou 
 * da esquerda para a direita).
 */
package provaPS1;

import javax.swing.JOptionPane;

/**
 *
 * @author Rayssa
 */
public class PS1_P1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palavra, invertida = " ";
        //String invertida = new;
        int tamanho, i;
        
        palavra = JOptionPane.showInputDialog(null, "Informe uma palavra: ");
        //StringBuffer(palavra).reverse().toString();
        
        tamanho = palavra.length();
        
        for (i= tamanho-1; i>=0; i--){
            invertida += palavra.charAt(i);
        }
        
        if (palavra.equals(invertida)){
            //System.out.print("É palíndrome" + palavra);
            JOptionPane.showMessageDialog(null, palavra + "É palíndrome");
        }
        else{
            //System.out.print("Não é palíndrome" + palavra);
            JOptionPane.showMessageDialog(null, palavra + "Não é palíndrome");
        }
        
    }
    
}
