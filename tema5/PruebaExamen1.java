package tema5;

import java.util.Scanner;

public class PruebaExamen1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int h=0;
        int cont=0;
        int h_cont=0;
        
        do {    // bucle para que introduzca el tamaño de la figura y no sea menor que 3 ni impar           
            
            System.out.print("Introduce el tamaño de la figura debera de ser un valor impar ");
            h = s.nextInt();
              
        } while (h<3 || h%2==0);
        
        for (int i = 0; i < h; i++) {   //bucle que pinta la figura con el tamaño establecido
            for (int j = 0; j <h ; j++) {
                
                if (j==h-1 || i==0) {
                    System.out.print("* ");
                    cont=cont+1;
                    
                } else if (j==i) {
                    System.out.print("* ");
                    cont=cont+1;
                    
                } else if (j==h-2 && i==h-1) {
                    System.out.print("* ");
                    cont=cont+1;
                    
                }else {
                    System.out.print("  ");
                    
                }
                
            }
            System.out.println("");
        }
 
        h_cont=cont/10;
        
        for (int i = 0; i <= h_cont; i++) {  //bucle que pinta la cantidad de caracteres utilizados para pintar la figura
            for (int j = 0; j < 10; j++) {
                cont--;
                if (cont>=0) {
                    System.out.print("*");
                }
                
                
            }
            System.out.println("");
        }
        
    }

}
