/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA2_13_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HOlA mundo");
        int inicio,fin;
        Scanner input = new Scanner (System.in);
        System.out.println("introduce tu inicio");
        inicio = input.nextInt();
        System.out.println("introduce tu fin");
        fin= input.nextInt();
        
        for(int i = inicio; i <= fin; i++){
            if(i %2 ==0){
                System.out.println(i + " es numero par bb !!!!");
            } else 
                System.out.println( i +"no es par padrino ");
        }
    
    }
    
}
