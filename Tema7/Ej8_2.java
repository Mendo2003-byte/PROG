package Tema7;

/*Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8.*/
import java.util.Scanner;

public class Ej8_2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        String[][] tablero = new String[8][8];
        int fil;
        int columna;
        int filaAux;
        int colAux;
        int col=0;

        System.out.println("Introduce la fila del alfil");
        fil = s.nextInt();
        System.out.println("Introduce la columna del alfil");
        columna = s.next().toLowerCase().charAt(0);
        
        switch (columna) {
            case 'a' -> {col = 0;}
            case 'b' -> {col = 1;}
            case 'c' -> {col = 2;}
            case 'd' -> {col = 3;}
            case 'e' -> {col = 4;}
            case 'f' -> {col = 5;}
            case 'g' -> {col = 6;}
            case 'h' -> {col = 7;}
        }
        
        colAux=col;
        filaAux=fil-1;
        
        for (int i = tablero.length-1; i >= 0; i--) {
            for (int j = 0; j < tablero[0].length; j++) {
                
                switch (j) {
                    case 0 -> {tablero[i][j]=(i+1)+"a";}
                    case 1 -> {tablero[i][j]=(i+1)+"b";}
                    case 2 -> {tablero[i][j]=(i+1)+"c";}
                    case 3 -> {tablero[i][j]=(i+1)+"d";}
                    case 4 -> {tablero[i][j]=(i+1)+"e";}
                    case 5 -> {tablero[i][j]=(i+1)+"f";}
                    case 6 -> {tablero[i][j]=(i+1)+"g";}
                    case 7 -> {tablero[i][j]=(i+1)+"h";}
                }
                
            }
        }
        
        for (int i = tablero.length-1; i >= 0; i--) {
            for (int j = 0; j < tablero[0].length; j++) {
                
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }
        
        System.out.print("El alfil puede moverse a las siguientes posiciones: ");
        
        for (int i = tablero.length-1; i >= 0; i--) {
            for (int j = 0; j < tablero[0].length; j++) {
                
                if (i==filaAux && j==colAux && j>=0 && i>=0 &&j<=7 && i<=7) {
                    System.out.print(tablero[filaAux][colAux]+" ");
                    filaAux--;
                    colAux--;
                }
            }
        }
        
        colAux=col+1;
        filaAux=fil-2;
        
        for (int i = tablero.length-1; i >= 0; i--) {
            for (int j = 0; j < tablero[0].length; j++) {
                
                if (i==filaAux && j==colAux && j>=0 && i>=0 &&j<=7 && i<=7) {
                    System.out.print(tablero[filaAux][colAux]+" ");
                    filaAux--;
                    colAux++;
                }
            }
        }
        
        colAux=col+1;
        filaAux=fil;
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                
                if (i==filaAux && j==colAux && j>=0 && i>=0 &&j<=7 && i<=7) {
                    System.out.print(tablero[filaAux][colAux]+" ");
                    filaAux++;
                    colAux++;
                }
            }
        }
        
        colAux=col-1;
        filaAux=fil;
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                
                if (i==filaAux && j==colAux && j>=0 && i>=0 &&j<=7 && i<=7) {
                    System.out.print(tablero[filaAux][colAux]+" ");
                    filaAux++;
                    colAux--;
                }
            }
        }
        
        System.out.println("");

    }

}
