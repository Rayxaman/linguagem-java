/*
 Crie uma classe que gera um número aleatoriamente (entre 5 e 10) por Math.random. 
 Faça com que apareça em tela uma senha numérica contendo a mesma quantidade de dígitos correspondentes 
 ao valor aleatório gerado. Apresente em tela o número sorteado e a senha .
 */
package senhaAleatoria;

/**
 * 
 * @author Rayssa
 */
public class SenhaAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor, senha, i;
        
        valor = ((int) (Math.random() * (10 - 5 + 1)) + 5);
        System.out.println("Número: " + valor);
        
        for (i=0; i < valor; i++){
            senha = ((int) (Math.random() * 9));
            System.out.print("" + senha);
        }
    } 
}
/*
 * FÓRMULA -> (Math.random() * (max - min + 1) + min);
 */