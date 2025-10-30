
package eva2_31_piramide;

import java.util.Scanner;


public class EVA2_31_PIRAMIDE {


    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
      
        System.out.println("Dime un valor");
       
        int numero;
        String v = "*";
        numero = input.nextInt();
        for(int i = 0; i < numero; i++){
            System.out.println(v);
            v += "*";
        }
        for (int i = numero - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
