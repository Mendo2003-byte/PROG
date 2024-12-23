package tema5;

import java.util.Scanner;

public class Ej_Bluthoot {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Este programa te muestra una letra BLUETOOT segun la altura que introduzcas");
        int h;
        
        do {

            System.out.println("Introduce la altura de la BLUETOOT");
            h = s.nextInt();

        } while (h < 9);
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                
                if ( (j==i || j ==h-i-1) && (i>h/4 && i<h-1-(h/4)) ) {
                    System.out.print("* ");
                    
                } else if ((j>=h/2 && i<=h/4) && j==h/2+i){
                    System.out.print("* ");
                
                } else if ((j>=h/2 && i>=h-1-(h/4))&&(j==h-1-i+(h/2))){ 
                    System.out.print("* ");
                
                } else if (j==h/2){
                    System.out.print("* ");
                
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
        
    }

}
