package tema5;


/*Realiza un programa que pinte la letra E por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
*/
import java.util.Scanner;

public class Ej_E {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce la altura de la E");
        int h = s.nextInt();
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= h/2; j++) {  
                if ((j == 0) || (i == 0) || (i== h-1) || ((i == h/2) && (j <= h/4) )) {
                    System.out.print("* ");
                    
                } else { 
                    System.out.print(" ");
                    
                }
                
            }
            System.out.println(" ");  
        }
        
        
    }   //FIN PROGRAMA

}
