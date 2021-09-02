/*
 Uma farmácia precisa ajustar os preços de seus produtos em 12%. Receba o valor do produto e aplique o percentual de acréscimo. 
 Arredonde o novo valor para mais ou para menos (usando o método round).
 Encerre o programa quando o usuário digitar zero (0) para o valor do produto (usando um laço de repetição)
 - Dessa forma, o usuário digita o valor do produto, o método calcula e mostra o valor com acréscimo, a seguir solicita um novo valor. 
 Esse processo continua enquanto o valor do produto for diferente de zero; caso contrário o programa será encerrado.
 */
package farmacia;
import javax.swing.JOptionPane;
/**
 *
 * @author Rayssa
 */
public class AjusteFarmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String = n_produto;
        int i;
        
        do {
            String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
            double valorFinal = valor + (valor * 0.12);
            System.out.println("O Preço atualizado de " + nome + " é: " + Math.round(valorFinal));
            i = Integer.parseInt(JOptionPane.showInputDialog("Para sair digite 0"));
            /* 
            outra forma de parada:
                if(valor ==0){
                    break;
                }
            */
        }
        while (i != 0);
        
        System.out.println("Obrigada por usar nosso programa!");    
    }   
}
