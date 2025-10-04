/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_inicializacion;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA2_6_INICIALIZACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String diasSemana[]= {"lunes", "martes", 
            "miercoles", "jueves", "viernes", 
            "sabado", "domingo"};
        Scanner input = new Scanner (System.in);
        int dia;
        System.out.println("dia de a semana 0 - 6");
        dia = input.nextInt();
        System.out.println(diasSemana[dia]);
       
    }
    
}
