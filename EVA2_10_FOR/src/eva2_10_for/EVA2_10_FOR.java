/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        for(int i=1; i<=20; i++){
            System.out.print(i+ "-");
        }
        System.out.println();
        for(int i=20; i>=1; i--){
            System.out.print(i+ "-");
        }
        //imprimir todos los numeros de 0 a 100
        //0-2-4-6-8-10
        //operadores +=, -=,*=,/=
        System.out.println();
        for(int i=0; i <=100; i+=2)
            System.out.print(i +"-");
        System.out.println();
        for(int i=100; i >= 0; i -=2)
            System.out.print(i +"-");
        //solicitar dos num imprimir la lista 
        //entre esos numeros
        //-3 y 3 -->
        Scanner input = new Scanner (System.in);
        int num,num2;
        System.out.println("ponme tu numero ");
        num = input.nextInt();
        System.out.println("pon tu num2");
        num2 =input.nextInt();
        for(int i= num; i<= num2; i++){
            System.out.println(i);
        }
    }
    
}
