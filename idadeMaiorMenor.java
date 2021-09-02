/*
receba quatro idades diferentes e indique qual é a maior e qual é a menor,
entre as idades informadas (não use métodos como MAX e MIN).
 */

package IdadeMaiorMenor;
import javax.swing.JOptionPane;
/**
 *
 * @author Rayssa
 */
public class idadeMaiorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menorIdade = 0, maiorIdade = 0;
        
        int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 1ª idade: "));
        int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 2ª idade: "));
        int idade3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 3ª idade: "));
        int idade4 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 4ª idade: "));
        
        if (idade1 < idade2 & idade1 < idade3 & idade1 < idade4){
            menorIdade = idade1;
        } else {
           maiorIdade = idade1;
        }
        if (idade2 < idade1 & idade2 < idade3 & idade2 < idade4){
            menorIdade = idade2;
        } else {
            maiorIdade = idade2;
        }
        if (idade3 < idade1 & idade3 < idade2 & idade3 < idade4){
            menorIdade = idade3;
        } else {
            maiorIdade = idade3;
        }        
        if (idade4 < idade1 & idade4 < idade2 & idade4 < idade3){
            menorIdade = idade4;
        } else {
            maiorIdade = idade4;
        }
        
        JOptionPane.showMessageDialog(null, "A menor idade é: " + menorIdade + "\n A maior idade é: " + maiorIdade);
    }
}
