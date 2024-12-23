package tema5;

/*Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.
 */
import java.util.Scanner;

public class Ej15 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa te muestra todas las potencias de un numero hasta el exponente introducido");
        System.out.println("Introduzca la base");
        double base = s.nextDouble();
        int exp = 0;
        double total = 1;
        
        while (exp < 1) {
            System.out.println("Introduzca un exponente positivo");
            exp = s.nextInt();
            
            if (exp > 0) {
                for (int i = 1; i < exp+1; i++) {
                    
                    total = base * total;
                    System.out.println("el resultado de la potencia "+ base + " ^ " + i + " = " + total);
                    
                }
            }
            

        }

    }   //FIN PROGRAMA

}
