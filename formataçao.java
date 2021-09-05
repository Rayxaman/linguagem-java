/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;
import java.text.DecimalFormat;
/**
 *
 * @author Rayssa
 */
public class formataçao {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat();

        //Define quantos dígitos antes e depois da vírgula e arredonda o valor
        df.applyPattern("00.00");
        System.out.println(df.format(0.9770));
        
        //Separa milhares de centenas
        df.applyPattern("###,###.00");
        System.out.println(df.format(9770));
        
        //Separa milhares de centenas e mostra só as casas decimais se existirem
        df.applyPattern("###,###.##");
        System.out.println(df.format(9770));
        
        System.out.println("Obrigada por usar esse programa!");
    }
}
