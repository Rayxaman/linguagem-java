/*
receba um número inteiro de
dois dígitos e informe a soma do seus dígitos.
 */
package numero;
import javax.swing.JOptionPane;

//<editor-fold defaultstate="collapsed" desc="Correção">
/**
*
* int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
* int resultado = ((numero % 10)+(numero / 10))
* JOptionPane.showMessageDialog(null, "Resultado: ");
*
*/
//</editor-fold>

/**
 *
 * @author Rayssa
 */
public class SomaDoisDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String aux;
        int div, resto, soma;
               
        aux = JOptionPane.showInputDialog("Digite um número de dois dígitos: ");
        int numero = Integer.parseInt(aux);
        
        div = numero / 10;
	resto = numero % 10;
        soma = div + resto;      
        
       /* while (SomaDoisDigitos > 0){
            System.out.print(SomaDoisDigitos%10);
            SomaDoisDigitos = SomaDoisDigitos/10;
        } */
             
        System.out.print("Resultado: " + soma + "\n");
        //System.out.printf( "%d, %d", div, resto); //Se for só para mostrar os números separados. 
    }  
}