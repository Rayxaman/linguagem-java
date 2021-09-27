/*
   Inclua um loop permanente para que o programa abaixo só termine quando
   o usuário informar valores corretos de entrada.
 */
package tratamentoexcecao;
import javax.swing.JOptionPane;
/**
 *
 * @author Rayssa
 */
public class loopDivisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nr1 = 0;
        int nr2 = 0;
                
        do{
            try{
                nr1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1: "));
                nr2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2: "));

                float resultado = nr1 / nr2;
                JOptionPane.showMessageDialog(null, resultado);
            }
            catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros! \n" + 
                        "o texto do erro é: " + erro.toString(), "\n Erro", JOptionPane.ERROR_MESSAGE);
            }
            catch (ArithmeticException erro){
                JOptionPane.showMessageDialog(null, "O denominador não pode ser 0! \n" + 
                        "o texto do erro é: " + erro.toString());
            }
            finally{
                if (nr2 != 0){
                    break;
                }
            }
        }
        while(true);       
        
        System.out.println("Obrigada por usar esse programa!");
    }   
}
