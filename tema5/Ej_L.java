package tema5;

/*Realiza un programa que pinte la letra K por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
*/

import java.util.Scanner;

public class Ej_L {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int h = 0;
        
        do {            
            
            System.out.println("Introduce la altura de la L");
            h = s.nextInt();
            
        } while (h<5);
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                
                if (i==h-1 || j==0) {
                    System.out.print("* ");
                    
                } else {
                    System.out.print("  ");
                }
                
            }
            
            System.out.println("");
        }
        
    }

}