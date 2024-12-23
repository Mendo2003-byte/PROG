package tema5;

/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
 */
import java.util.Scanner;

public class Ej21 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa va pidiendo numero hasta que introduzcas un numero negativo y te indica cuantos numeros has introducido, cuantos son pares"
                + "La media de los impares y el mayor de los pares");
        int num = 0;
        int cont = 0;
        int imp = 0;
        int contimp = 0;
        int par = 0;

        while (num >= 0) {
            cont += 1;

            if (num % 2 == 1) {
                contimp += 1;
                imp = imp + num;

            } else if (par < num) {
                par = num;

            }
            System.out.println("Introduzca un numero");
            num = s.nextInt();

        }

        System.out.println("has introducido " + (cont - 1) + " numeros");
        System.out.println("la media de los numeros impares es " + (imp / contimp));
        System.out.println("El numero par mas alto es " + par);
        
    }   // FIN PROGRAMA

}
