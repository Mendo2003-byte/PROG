package Tema8;

import java.util.Scanner;

public class Simulacro_2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[][] tablero = new int[3][3];
        int[] matriz = new int[8];
        int cont = 0;
        int sumafila = 0;
        int sumacol = 0;
        int diagonal1 = 0;
        int diagonal2 = 0;
        int total = 0;
        boolean esmatriz = true;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {

                System.out.println("Introduce un numero");
                tablero[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < tablero.length; i++) {
            sumafila = 0;
            for (int j = 0; j < tablero[0].length; j++) {

                sumafila = tablero[i][j] + sumafila;

            }
            matriz[cont] = sumafila;
            cont++;
        }

        for (int i = 0; i < tablero.length; i++) {
            sumacol = 0;
            for (int j = 0; j < tablero[0].length; j++) {

                sumacol = tablero[j][i] + sumacol;

            }
            matriz[cont] = sumacol;
            cont++;
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {

                if (i == j) {
                    diagonal1 = tablero[i][j] + diagonal1;
                    total = diagonal1;
                    matriz[cont] = diagonal1;
                }

            }
        }
        cont++;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {

                if (j == tablero.length - i - 1) {
                    diagonal2 = tablero[i][j] + diagonal2;
                    matriz[cont] = diagonal2;
                } 
            }
        }

        for (int i = 0; i < matriz.length && esmatriz; i++) {
            
            if (total == matriz[i]) {
                esmatriz = true;
            } else {
                esmatriz = false;
            }

        }

        if (esmatriz) {
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz no es magica");
        }

    }

}
