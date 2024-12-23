package Tema6;

/*Escribe un programa que piense un número al azar entre 0 y 100. El usuario
debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
fallido, el programa dirá cuántas oportunidades quedan y si el número introducido es menor o mayor que el número secreto.*/

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int aleatorio = (int) (Math.random() * 101);

        for (int i = 5; i > 0; i--) {

            System.out.println("Te quedan " + i + " Intentos");
            System.out.println("Adivina el numero entre 0 y 100");
            int num = s.nextInt();

            if (num == aleatorio) {
                System.out.println("Acertaste");
                i=0;

            } else if (num < aleatorio) {
                System.out.println("El numero a acertar es mayor que " + num);

            } else {
                System.out.println("El numero es menor que " + num);

            }

        }

    }

}
