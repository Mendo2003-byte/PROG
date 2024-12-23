package tema5;

/*Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:*/
import java.util.Scanner;

public class Ej24 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa pintara una piramide hueca dependiendo de la altura introducida");
        System.out.println("Introduce la altura de la piramide hueca");
        int h = s.nextInt();

        while (h < 2) {
            System.out.println("La altura debe de ser mayor de tres para poder hacer una piramide");
            h = s.nextInt();
        }
        
        for (int i = 0; i < h; i++) {
            
            int cont = 1;
            
            for (int j = 0; j <= h+i; j++) {
                
                if (j <= ( h - i )-1) {
                    System.out.print(" ");
                    
                } else if (j < h){
                    System.out.print(cont);
                    cont = cont+1;
                    
                }else{
                    System.out.print(cont);
                    cont= cont-1;
                }
                
            }
            System.out.println("");
            
        }

    }   //FIN PROGRAMA

}
