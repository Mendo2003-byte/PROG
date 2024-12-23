package Tema8;

import java.util.Scanner;


public class Simulacro_3 {

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
        
        for (int i = 0; i <tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }
        
        
        for (int i = 0; i < tablero.length ;i++) {
                    colAux=col;
                    filaAux=fil-1;
            for (int j = 0; j < tablero[0].length; j++) {
                
                if ((colAux<=7 && colAux>=0 && filaAux<=7 && filaAux>=0) && ((j==colAux+1 && i==filaAux) || (j==colAux-1 && i==filaAux) || (j==colAux+1 && i==filaAux+1) || (j==colAux-1 && i==filaAux-1) || (j==colAux && i==filaAux-1) || (j==colAux && i==filaAux+1) || (j==colAux-1 && i==filaAux+1) || (j==colAux+1 && i==filaAux-1))) {
                    System.out.println(tablero[i][j]);
                }
            }
        }     
        
    }

}
