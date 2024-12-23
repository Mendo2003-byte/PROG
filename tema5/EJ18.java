package tema5;

/*Escribe un programa que obtenga los números enteros comprendidos entre
dos números introducidos por teclado y validados como distintos, el programa
debe empezar por el menor de los enteros introducidos e ir incrementando de
7 en 7.
 */
import java.util.Scanner;

public class EJ18 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("este programa te muestra los numeros enteros comprendidos entre los dos valores que introduzcas");
        System.out.println("Introduzca el primer valor");
        int num1 = s.nextInt();
        System.out.println("Introduzca el segundo valor");
        int num2 = s.nextInt();

        if (num1 == num2) {
            System.out.println("Los valores introducidos no pueden ser iguales");
            
        } else if (num1 < num2) {
            for (int i = num1; i < num2; i += 7) {
                System.out.println(i);
            }

        } else {
            for (int i = num2; i < num1; i += 7) {
                System.out.println(i);
            }

        }

    }   //FIN PROGRAMA

}
