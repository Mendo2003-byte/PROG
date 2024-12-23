package tema5;

/*Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.
 */
import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa calcula la nota media de los numeros introducidos hasta que introduzcas uno negativo");
        boolean salir = false;
        int cont = 0;
        double media = 0;
        double total = 0;

        while (!salir) {
            System.out.println("Introduce una nota");
            double nota = s.nextDouble(); 

            if (nota > 10) {
                System.out.println("Su nota debe de ser menor que 10");
                
            }else {
                if (nota < 0) {
                    media = total / cont;
                    salir = true;

                } else {
                    total = nota + total;
                    cont = cont + 1;
                }
            
            }
            
        }
        
        System.out.println("su nota final es " + media);

    }   // FIN PROGRAMA
}
