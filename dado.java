/*
 Crie um método que simule a jogada de um dado de seis lados
 (números de 1 a 6), pelo número de vezes informado pelo usuário. 
 Ao final, some seus valores sorteados e apresente o resultado das jogadas.
 */
package dado;
import javax.swing.JOptionPane;
/**
 *
 * @author Rayssa
 */
public class dado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, num, vl_dado,  soma = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Jogar o dado quantas vezes?"));
        for (i = 0; i < num; i++){
          vl_dado = (int) (Math.random() * (6 - 1 + 1)+ 1);
          System.out.println("Face do dado: " + vl_dado);
          soma += vl_dado;
        }
        System.out.println("Soma das faces lançadas: " + soma);
        System.out.println("\n Obrigada por usar nosso programa!");
    }
}

//<editor-fold defaultstate="collapsed" desc="Outra Resolução">
/*
 * import java.util.Random;
 * public class testes {
 *   public static void main(String[] args) {
 *     Random aleatorio = new Random();
 *     int valor = aleatorio.nextInt();
 *     System.out.println("Número gerado: " + valor);
 *   }
 * }
*/
/*
* FÓRMULA -> aleatorio.nextInt((max - min) + 1) + min;
*/
//</editor-fold>
