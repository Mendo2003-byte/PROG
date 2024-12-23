package tema5;

/*Escribe un programa que pida una base y un exponente (entero positivo) y
que calcule la potencia.*/
import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa pide una base y un exponente y calcula la potencia");
        System.out.println("Introduzca la base");
        int base = s.nextInt();
        int exp = -1;

        while (exp < 0) {
            System.out.println("Introduzca el exponente");
            exp = s.nextInt();

        }
        
        System.out.println("la potencia " + base + " ^ " + exp + " es igual " + Math.pow(base, exp));

    }   //FIN PROGRAMA

}
