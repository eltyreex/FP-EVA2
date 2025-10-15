/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_arreglos_multi;

/**
 *
 * @author fer
 */
public class EVA2_17_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][]= new int [3][4];  //dimensiones
        int cubo [][][]=new int [2][2][2];//3dimensions
        matriz [0][0]=100;
        matriz [0][1]=200;
        matriz [0][2]=300;
        matriz [0][3]=400; //para usar ciclos necesitamos tener en cuenta las dimensiones que tiene el arreglo ejemplo si es de 2 seran 2 for
        System.out.println(matriz.length);//este solo lee la primera dimension
        System.out.println(matriz[0].length);
        System.out.println(matriz[1].length);
        System.out.println(matriz[2].length);
        //ciclos anidados
        for(int i =0; i<matriz.length; i++){//<--el primero for es la primera dimension y asi le seguimos con todas las que tengamos
            for (int j =0; j<matriz[i].length; j++){ //<--todo el codigo va dentro del segundo for que a la vez esta dentro del primero
                System.out.print("["+matriz[i][j]+"}");//eso va asi primero la primera dim y luego la segunda
            }
            System.out.println();
        }
        //idea para practicar hacer un juego del gato usando matriz
        
    }
    
}
