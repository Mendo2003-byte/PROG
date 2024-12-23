package tema5;

/*Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).*/
import java.util.Scanner;

public class Ej17 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa te suma los siguientes 100 numeros del numero introducido");
        int num = -1;
        int total = 0;

        while (num < 0) {
            System.out.println("Introduzca un numero positivo");
            num = s.nextInt();

            if (num >= 0) {
                for (int i = 1; i < 101; i++) {
                    total = total + (num + i);
                }

            }

        }

        System.out.println("el resultado de sumar los 100 primeros numeros del numero introducido es " + total);

    }   //FIN PROGRAMA

}
