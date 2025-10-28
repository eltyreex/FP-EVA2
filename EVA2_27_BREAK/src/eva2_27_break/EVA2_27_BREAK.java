/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_break;

import java.util.Scanner;

/**
 *
 * @author jofer
 */
public class EVA2_27_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, adivinar;
        do{
            adivinar = (int)(Math.random()*5);
            System.out.println("Adivina el numero. -1 pa terminar");
            valor = input.nextInt();
            if(valor == adivinar)
                System.out.println("Adivinaste we");
            else if (valor==-1){
                System.out.println("Gracias por juegar");
                break;//termina la ejecucion del ciclo
            }else{
                System.out.println("no adivinaste we");
            }
        }while(true);//CONDICION PARA REPETIR (TRUE)
    }
    
}
