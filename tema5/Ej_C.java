package tema5;

import java.util.Scanner;

public class Ej_C {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa te muestra una letra C segun la altura que introduzcas");
        int h;

        do {

            System.out.println("Introduce la altura de la C");
            h = s.nextInt();

        } while (h < 5);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                
                if ((i == 0 || i == h-1) && j!=0) {
                    System.out.print("* ");
                    
                } else if (j == 0 && (i!=0 && i!=h-1)) {
                    System.out.print("* ");
                    
                } else {
                    System.out.print("  ");
                    
                }
                
            }
            System.out.println("");
        }
        
    }
}
