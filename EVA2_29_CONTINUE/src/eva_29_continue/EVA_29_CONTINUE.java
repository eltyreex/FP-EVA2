/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_29_continue;

/**
 *
 * @author jofer
 */
public class EVA_29_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for( int i=0; i<100; i ++){
            int resi = i%2;
            if (resi !=0)
                continue;
            System.out.print(i + "-");
        }
    }
    
}
