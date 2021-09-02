/*
 Receba o valor de um produto e um código de desconto. 
 O desconto deve ser calculado de acordo com o código fornecido:
 1 = 5%; 2 = 10%; 3 = 20%; 4 = 50%.
 */

package CodigoDeDesconto;
import javax.swing.JOptionPane;
/**
 *
 * @author Rayssa
 */
public class CodigoDesconto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cod;
        float valor, desc, vDesc;
                     
        valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));
        cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código de desconto: "));
        
        switch (cod) {
            case 1:
                desc = valor * 5;
                vDesc = desc - valor;
                JOptionPane.showMessageDialog(null, "O Valor descontado é: " + vDesc);
                break;
            case 2:
                desc = valor * 10;
                vDesc = desc - valor;
                JOptionPane.showMessageDialog(null, "O Valor descontado é: " + vDesc);
                break;
            case 3:
                desc = valor * 20;
                vDesc = desc - valor;
                JOptionPane.showMessageDialog(null, "O Valor descontado é: " + vDesc);
                break;
            case 4:
                desc = valor * 50;
                vDesc = desc - valor;
                JOptionPane.showMessageDialog(null, "O Valor descontado é: " + vDesc);
                break;
            default:
                System.out.println("CÓDIGO INVÁLIDO!");
                break;
        }
    }
}
