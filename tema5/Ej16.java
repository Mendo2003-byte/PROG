package tema5;

/*Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.*/

import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa te indica si el numero que introduzcas es un numero primo o no");
        System.out.println("Introduzca el numero que deseas saber si es primo o no");
        int num = s.nextInt();
        int div = 0;

        for (int i = 1; i < num + 1; i++) {
            if (num % i == 0) {
                div += 1;

            }

        }

        if (div > 2) {
            System.out.println("El numero introducido no es un numero primo");

        } else {
            System.out.println("El numero introducido es un numero primo");

        }

    }   // FIN PROGRAMA

}
