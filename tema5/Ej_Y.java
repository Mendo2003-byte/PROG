package tema5;

/*Realiza un programa que pinte la letra Y por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
*/

import java.util.Scanner;

public class Ej_Y {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int h = 0;
        
        do {            
            
            System.out.println("Introduce la altura de la Y, debera de ser impar y mayor de 5");
            h = s.nextInt();
            
        } while (h<5 || h%2==0);
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                
                if ((j==i || j==h-1-i)&& i<=h/2) {
                    System.out.print("* ");
                } else if (j==h/2 && i>=h/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
        
    }

}
