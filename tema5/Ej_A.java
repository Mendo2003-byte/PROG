package tema5;


import java.util.Scanner;

public class Ej_A {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Este programa te muestra una letra A segun la altura que introduzcas");
        int h;
        
        do {            
            
            System.out.println("Introduce la altura de la A");
            h = s.nextInt();
            
        } while (h<5);
        
        
        for (int i = 0; i < h; i++) {
            
            for (int j = 0; j < h+i; j++) {
                
                if ((j == (h-1)-i) || (j == (h+i)-1)) {
                    System.out.print("*");
                    
                } else if (i == h/2 && (j>=h/2)) { 
                    System.out.print("*");
                    
                }else {
                    System.out.print(" ");
                    
                }
                
            }
            
            System.out.println("");
            
        }
               
    }

}
