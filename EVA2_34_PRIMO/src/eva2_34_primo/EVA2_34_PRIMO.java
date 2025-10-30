
package eva2_34_primo;

import java.util.Scanner;


public class EVA2_34_PRIMO {


   
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in); 
        int numero;
        while(true) {
            
            System.out.print("Introduce un número: ");
            numero = input.nextInt();
            
            boolean esPrimo = true;
            int i = 2;
            
            if(numero <= 1) {
                esPrimo = false;
            } else {
            
                while(i < numero) {
                    if(numero % i == 0) {
                        esPrimo = false;
                        break;  
                    }
                    i++;
                }
            }
            
            if(esPrimo) {
                System.out.println("es numero primo");
            } else {
                System.out.println("No es primo");
            }
            
            System.out.println("continuar? shi (1-9) no(0)");
            int eleccion = input.nextInt();
            if(eleccion == 0) {
                System.out.println("fin");
                break;
            }
        }
    }
    
}
