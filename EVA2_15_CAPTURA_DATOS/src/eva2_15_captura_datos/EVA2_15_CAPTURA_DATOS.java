/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_captura_datos;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA2_15_CAPTURA_DATOS {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        int tamano;
        System.out.println("cuantas califas quieres capturar?");
        tamano = input.nextInt();
        int califas[]= new int [tamano];
        for(int i=0;i < califas.length; i++){
            System.out.println("calificacion #"+ (i+ 1));
            califas [i] = tamano = input.nextInt();
        }
        for(int i=0;i < califas.length; i++){
            System.out.print( "sus datos guardados son : " + califas[i]);
            
        }
        //promedio?
        //primero debo de sumar todas las califas
        int sumacali=0;
        for(int i=0;i < califas.length; i++){
            sumacali += califas[i];//es lo mismo que sumacali = sumacali + califas [i]
        }
        System.out.println(sumacali);
        double promedio = sumacali/(double)califas.length;
        System.out.println(promedio);
    }
    
}
