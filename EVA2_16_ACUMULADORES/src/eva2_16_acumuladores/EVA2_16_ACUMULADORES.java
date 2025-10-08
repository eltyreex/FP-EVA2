/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_acumuladores;

/**
 *
 * @author fer
 */
public class EVA2_16_ACUMULADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int acum=0;
        System.out.println(acum);
        acum = acum + 200;
        acum = acum + 100;
        System.out.println(acum);
        acum = acum -120;
        if (acum < 200){
            System.out.println(acum);
            System.out.println("no te acompletas pa un pollo");
        }
        acum +=200;
    }
    
}
