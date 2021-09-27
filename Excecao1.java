/*
 Use os métodos getMessage() e printStackTrace() para fazer o tratamento
 adequado para o programa abaixo.
 */
package tratamentoexcecao;
import javax.swing.JOptionPane;

/**
 *
 * @author Rayssa
 */
public class Excecao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            x = 10;
            int n = 5 + "5";
            int [] nr =  new int[2];
            nr[2] = 10; 
            float r = 10/0;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Houve um erro. Por favor tente novamente. \n");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Obrigada por usar esse programa!");
            //JOptionPane.showMessageDialog(null, "Obrigada por usar esse programa!");
        }
    }
    
}
