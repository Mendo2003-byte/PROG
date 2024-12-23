package Tema7;

/*Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras “máximo” y “mínimo” al lado
del máximo y del mínimo respectivamente.*/
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {  //Introducir valores
            System.out.println("Introduce un numero");
            num[i] = s.nextInt();
        }

        int nummax = num[0];
        int nummin = num[0];

        for (int i = 1; i < num.length; i++) {  //Compara los numeros para sacar el maximo y el minimo

            if (nummax < num[i]) {
                nummax = num[i];

            } else if (nummin > num[i]) {
                nummin = num[i];

            }

        }

        for (int i = 0; i < num.length; i++) {  //Muestra por pantalla

            if (nummax == num[i]) {
                System.out.println("maximo "+ num[i]);

            } else if (nummin == num[i]) {
                System.out.println("minimo "+ num[i]);

            } else {
                System.out.println(num[i]);
                
            }

        }

    }

}
