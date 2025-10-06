/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_for;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA2_11_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int rep;
        String mensaje;
        System.out.println("mensaje a repetir");
        mensaje = input.nextLine();
        System.out.println("Cantidad de mensajes");
        rep = input.nextInt();
        for(int i=1; i<= rep; i++){
            System.out.println( i +" "+ mensaje + " come el que no le da like");
        }
    }
    
}
