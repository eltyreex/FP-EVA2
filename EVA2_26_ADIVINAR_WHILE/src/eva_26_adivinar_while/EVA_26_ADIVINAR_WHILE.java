/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_26_adivinar_while;

import java.util.Scanner;

/**
 *
 * @author jofer
 */
public class EVA_26_ADIVINAR_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor =0, adivinar;
        while(valor != -1){
            adivinar = (int)(Math.random()*5);
            System.out.println("Adivina el numero. -1 pa terminar");
            valor = input.nextInt();
            if(valor == adivinar)
                System.out.println("Adivinaste we");
        }
    }
    
}
