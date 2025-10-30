/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_factorial2;

import java.util.Scanner;

/**
 *
 * @author jofer
 */
public class EVA2_32_FACTORIAL2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
         int factorial=1;
        System.out.println("Tu numero es");
        Scanner input = new Scanner (System.in);
        numero = input.nextInt();
        if(numero >0){
            String proceso ="";
            for(int i =numero;i>=1; i--){
                factorial *=i;
                if(i>1){
                    proceso+= i +"*";
                }else{
                    proceso +=1;
                }
            }
            System.out.println(numero +"! ="+ proceso +"="+ factorial);
        }else{
            System.out.println("No se puede hacer el factorial de numero negativos");
        }
        
    }
    
}
