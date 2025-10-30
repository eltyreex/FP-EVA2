
package eva2_30_triangulo;

import java.util.Scanner;


public class EVA2_30_TRIANGULO {


    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
      
        System.out.println("Numero: ");
         int numero;
        String valor = "*";
        numero = input.nextInt();
        for(int i = 0; i < numero; i++){
            System.out.println(valor);
            valor += "*";    
        }
    }
    
}
