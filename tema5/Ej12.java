package tema5;

/*Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
debe introducir por teclado.
 */
import java.util.Scanner;

public class Ej12 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este progrmama muestra los n primeros terminos de la serie de Fibonacci");
        System.out.println("Introduzca n");
        int n = s.nextInt();

        int cont = 0;
        int total1 = 0;
        int total2 = 1;

        for (int i = 0; i < n; i++) {

            if (cont % 2 == 0) {               
                System.out.println(total1);
                total1 = total2 + total1;
                cont += 1;
                
                
            } else {
                System.out.println(total2);
                total2 = total1 + total2;
                cont += 1;


            }

        }

    }   // FIN PROGRAMA

}
