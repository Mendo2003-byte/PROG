package tema5;

/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
*/

// Ejercicios 12-16

import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Este programa muestra en tres columnas el cuadrado y el cubo de los 5 primeros numeros enteros a partir de uno introducido por teclado");
        System.out.println("Introduzca un numero");
        int num = s.nextInt();
        
        for (int i = 0; i < 5; i++) {
            
            System.out.print(num + " ^ 1 = " + num + "\t" + num + " ^ 2 = " +(int)Math.pow(num, 2) + "\t" +num +" ^ 3 = " + (int)Math.pow(num, 3));
            System.out.println(" ");
            num += 1;
            
        }
    }   // FIN PROGRAMA

}
