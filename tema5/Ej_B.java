package tema5;

import java.util.Scanner;

public class Ej_B {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa te muestra una letra B segun la altura que introduzcas");
        int h;

        do {

            System.out.println("Introduce la altura de la B");
            h = s.nextInt();

        } while (h < 5);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                
                if (j == 0) {
                    System.out.print("*");
                    
                } else if ((i == 0) && (j<=h/2)){
                    System.out.print(" *");
                    
                } else if ((i == h/2) && (j<=h/2)){
                    System.out.print(" *");
                    
                } else if ((i == h-1) && (j<=h/2)){
                    System.out.print(" *");
                    
                } else if ((i != 0 && i != h/2 && i != h-1) && (j==(h/2)+1)){
                    System.out.print(" *");
                    
                }  else if (j<(h/2)+1){
                    System.out.print("  ");
                    
                }
                
            }
            
            System.out.println("");
        }
        
    }

}
