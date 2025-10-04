/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA2_5_ARREGLOS_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a,b,c; //son tres arreglos 
        int x[], y,z; //solo la x es un arreglo
        String cadenas[]= new String[7];//5 variables de tipo string
        cadenas[0] = "lunes";
        cadenas[1] = "martes";
        cadenas[2] = "miercoles";
        cadenas[3] = "jueves";
        cadenas[4] = "viernes";
        cadenas[5] = "sabado";
        cadenas[6] = "dominog";
        Scanner input = new Scanner (System.in);
        int dia;
        System.out.println("dia de a semana 0 - 6");
        dia = input.nextInt();
        System.out.println(cadenas[dia]);
       
    }
    
}
