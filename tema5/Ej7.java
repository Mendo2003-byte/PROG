/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

/**
 *
 * @author Usuario
 */

/*Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {

        int password = 1234;
        Scanner s = new Scanner(System.in);

        for (int i = 4; i > 0; i--) {   //bucle que se repite cuatro veces

            System.out.println("Introduzca la contraseña de la caja fuerte");
            int clave = s.nextInt();

            if (clave == password) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                i = 0;
                
            } else {
                System.out.println("Lo siento, esa no es la combinacion");

            }

        }

    }   // FIN PROGRAMA

}
