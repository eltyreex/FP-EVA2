
package eva2_33_cuenta;

import java.util.Scanner;


public class EVA2_33_CUENTA {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cuenta = 1000000, retiro;
    
        System.out.println("Hola al banco we");
        while(true){
            System.out.println("Cuanto dinero quiere retirar");
            retiro = input.nextDouble();
            cuenta -= retiro;
            System.out.println("Ahora su dinero es de: " + "$" + cuenta);
            System.out.println("");
            if (cuenta < 0){
                System.out.println("Me debes dinero we");
                System.out.println("ahora me debes: " + "$" + cuenta);
                break;
            }else if(cuenta == 0){
                System.out.println("No hay dinero we");
                break;
            }
        }

    }
    
}
