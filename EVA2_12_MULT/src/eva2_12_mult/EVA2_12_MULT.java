/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_mult;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA2_12_MULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inicio,tabla;
        Scanner input = new Scanner(System.in);
        System.out.println("dime tu numero que quieras");
        inicio = input.nextInt();
        System.out.println("dime las veces que se quieras multiplicar");
        tabla = input.nextInt();
        for(int i = inicio; i <=(inicio* tabla); i+= inicio){
            System.out.println(inicio +"X" + tabla + "=" + i);
            
        }
    }
    
}
