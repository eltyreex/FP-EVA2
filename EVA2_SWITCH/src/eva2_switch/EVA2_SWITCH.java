/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_switch;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int dia;
        System.out.println("decime un dia de la semana en num");
        dia = input.nextInt();
        
        /*if (dia==1){
            System.out.println("es lunes");
        }else if (dia==2){
            System.out.println("es martes");
        }
        */ 
        switch (dia){//opciones--> casos
            case 1:
                System.out.println("lunes");
                break; //para interrumpir y que no siga 
            case 2: 
                System.out.println("martes");
                break;
                case 3: 
                System.out.println("miercoles");
                break;
                case 4: 
                System.out.println("jueves");
                break;
                case 5: 
                System.out.println("viernes");
                break;
                case 6: 
                System.out.println("sabado");
                break;
                case 7: 
                System.out.println("domingo");
                break;
                default://opcional es para cuando la opcion de 
                    System.out.println("opcion no valida");
        }
    }
    
}
