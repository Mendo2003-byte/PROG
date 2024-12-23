package Tema7;

/*Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.*/

import java.util.Scanner;

public class Repaso1_1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int [][] tablero = new int [3][6];
        
        tablero[0][0]=0;
        tablero[0][1]=30;
        tablero[1][0]=75;
        tablero[0][2]=2;
        tablero[0][5]=5;
        tablero[2][5]=11;
        tablero[1][4]=0;
        tablero[2][3]=9;
        tablero[2][2]=-2;


        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                
                System.out.print(tablero[i][j]+"\t");
                
            }
            System.out.println("");
        }
        
    }

}
