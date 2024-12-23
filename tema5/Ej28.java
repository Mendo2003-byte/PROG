package tema5;

/*Escribe un programa que calcule el factorial de un número entero leído por
teclado.*/

import java.util.Scanner;

public class Ej28 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce el numero del que deses conocer el factorial");
        long num = s.nextInt();
        long fact = 1;
        
        System.out.print("1");
        
        for (int i = 2; i <= num; i++) {           
            fact= fact * i;
            System.out.print(" * " + i);
            
        }
        
        System.out.println(" = " +fact);
        
        
    }   //FIN PROGRAMA

}
