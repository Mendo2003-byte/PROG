package tema5;

/*Realiza un programa que pinte la letra G por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
 */

import java.util.Scanner;

public class Ej_G {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int h = 0;
        
        do {            
            
            System.out.println("Introduce la altura de la G");
            h = s.nextInt();
            
        } while (h<5);
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
            
                if (i==0 && j>0){
                    System.out.print("* ");
                
                } else if(i==h-1 && j>0 && j<h-1){
                    System.out.print("* ");
                    
                } else if(i>0 && i<h-1 && j==0){
                    System.out.print("* ");
                    
                }else if(j==h-1 && i>=h/2 && i!=h-1){
                    System.out.print("* ");
                    
                }else if(i==h/2 && j>h/2){
                    System.out.print("* ");
                    
                }else if (i>=h/2 && j<h){
                    System.out.print("  ");
                
                } else if (i==0&& j==0){
                    System.out.print("  ");
                }
                    
                
            }
            System.out.println("");
        }
        
    }

}
