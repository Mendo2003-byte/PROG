package tema5;

/*Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.*/
import java.util.Scanner;

public class Ej29 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un numero y se mostraran los menores");
        int num = s.nextInt();

        while (num < 0) {
            System.out.println("Introduce un numero y se mostraran los menores");
            num = s.nextInt();

        }

        System.out.println("Introduce el numero por el que no sea divisible");
        int div = s.nextInt();

        for (int i = 0; i <= num; i++) {

            if (i % div != 0) {
                System.out.println(i);
            } 

        }

    }//FIN PROGRAMA

}
