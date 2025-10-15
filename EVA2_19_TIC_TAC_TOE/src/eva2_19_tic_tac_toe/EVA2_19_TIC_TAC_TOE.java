/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_tic_tac_toe;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA2_19_TIC_TAC_TOE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tictac[][]=new int [3][3];
        int fila, col,jug;
        Scanner input = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("pone tu jugada.  fila:");
            fila = input.nextInt();
            System.out.println("pone tu jugada.  col:");
            col = input.nextInt();
            System.out.println("jugador 1 o 2");
            jug= input.nextInt();
            tictac[fila][col]=jug;
            
            
        }
         for(int i =0; i<tictac.length; i++){//<--el primero for es la primera dimension y asi le seguimos con todas las que tengamos
            for (int j =0; j<tictac[i].length; j++){ //<--todo el codigo va dentro del segundo for que a la vez esta dentro del primero
                System.out.print("["+tictac[i][j]+"}");//eso va asi primero la primera dim y luego la segunda
            }
            System.out.println();
         }
    }
    
}
