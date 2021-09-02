/*
 Elabore o cálculo do peso ideal, através do IMC (índice de massa corporal). 
 Para isso, utilize a fórmula: IMC = peso / altura^2.
 Receba peso e altura.
 */
package CalculoDeIMC;

import javax.swing.JOptionPane;

/**
 *
 * @author Rayssa
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    //CÓDIGO CORRIGIDO
        String aux;
        float peso, altura;
        double imc;
        
        aux = JOptionPane.showInputDialog("Informe o seu peso: ");
        peso = Float.parseFloat(aux);
        
        aux = JOptionPane.showInputDialog("Informe a sua altura: ");
        altura = Float.parseFloat(aux);
        
        imc = peso /(Math.pow(altura, 2));
        
        if (imc < 18.5){
            System.out.print("O IMC está abaixo do normal \t" + imc + "\n");
        } else 
        if (imc <= 24.4){
            System.out.print("O IMC está ideal \t" + imc + "\n");
        } else
        if (imc <= 29.9){
            System.out.print("O IMC indica pré-obesidade \t" + imc + "\n");
        } else 
        if (imc <= 34.9){
            System.out.print("O IMC indica obesidade classe I \t" + imc + "\n");
        } else 
        if (imc <= 39.9){
            System.out.print("O IMC indica obesidade classe II \t" + imc + "\n");
        } else {
            System.out.print("O IMC indica obesidade classe III \t" + imc + "\n");
        }
    }
}
