/*
receba 3 notas de cada aluno de uma turma e 
informe a média do aluno e a média da turma.
 */
package NotaMedia;
import javax.swing.JOptionPane;

/*
Correção:
*/

/**
 *
 * @author Rayssa
 */
public class MediaTurma {

    /**
     * @param args the command line arguments
     *  
     */
    public static void main(String[] args) {   // CÓDIGO REVISADO
        float n1, n2, n3, media, mediaTurma=0;
        int i=0;
        String x;
 
        do{
            n1 = Float.parseFloat(JOptionPane.showInputDialog("Indique a 1ª nota: "));
            n2 = Float.parseFloat(JOptionPane.showInputDialog("Indique a 2ª nota: "));
            n3 = Float.parseFloat(JOptionPane.showInputDialog("Indique a 3ª nota: ")); 
            
            media = (n1 + n2 + n3) / 3;
            mediaTurma += media;         
            JOptionPane.showMessageDialog(null, "A média do aluno é: " + Math.round(media * 100d) / 100d);
            
            x = JOptionPane.showInputDialog("Deseja continuar? Sim. Não.");
            switch (x){
                case "sim": 
                    i++;
                    break;
                case "não": 
                    mediaTurma = mediaTurma/(i+1);
                    JOptionPane.showMessageDialog(null, "A média da turma é: " + mediaTurma);
                    return;
                default: JOptionPane.showMessageDialog(null,"opção inválida \n");
            }
        } 
        while (i>0);
    }
}
    
//for(int i=0;i<qtd_alunos;i++) e no segundo laço, for(l=0;l<3;l++) 
//<editor-fold defaultstate="collapsed" desc="Outra Resolução">
/*
    double n1,n2,n3,media,mediaTurma=0;
    int i=0, parada;

    do{
    n1 = Double.parseDouble(JOptionPane.showInputDialog("Indique a 1ª nota: "));
    n2 = Double.parseDouble(JOptionPane.showInputDialog("Indique a 2ª nota: "));
    n3 = Double.parseDouble(JOptionPane.showInputDialog("Indique a 3ª nota: "));

    media = (n1 + n2 + n3) / 3;
    mediaTurma += media;
    JOptionPane.showMessageDialog(null, "A média do aluno é: " + Math.round(media * 100d) / 100d);

    parada = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para continuar ou outro nº para encerrar."));
    }
    while (parada == 1);

    mediaTurma = mediaTurma/i;
    JOptionPane.showMessageDialog(null, "A média da turma é: " + mediaTurma);
    }
    }
*/
//</editor-fold>
