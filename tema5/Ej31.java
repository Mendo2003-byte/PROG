/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

/**
 *
 * @author Usuario
 */

/*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
 */
import java.util.Scanner;

public class Ej31 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa pinta un L por pantalla hecha con asteriscos");
        System.out.println("introduzca la altura de la L");
        int h = s.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < (h / 2)+1; j++) {

                if (j == 0) {
                    System.out.print("*");

                } else if (i == (h - 1)) {
                    System.out.print(" ");
                    System.out.print("*");
                }

            }
            System.out.println(" ");
        }

    }//FIN PROGRAMA
    
}
