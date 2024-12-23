package tema5;

/*Realiza un programa que pinte la letra V por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
*/

import java.util.Scanner;

public class Ej_V {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int h = 0;
        int cont=0;
        
        do {            
            
            System.out.println("Introduce la altura de la V");
            h = s.nextInt();
            
        } while (h<5);

        for (int i = 0; i < h; i++) {
            
            if (i>h/2) {
                cont=cont+1;
            }
            
            for (int j = 0; j < h; j++) {
                
                if ((j==0 || j==h-1) && i<=h/2) {
                    System.out.print("* ");
                    
                } else if(i>h/2 && (j==cont || j==h-cont-1)) {
                    System.out.print("* ");
            
                } else {
                    System.out.print("  ");
                    
                }
                
            }
            System.out.println("");
        }
        
    }

}
