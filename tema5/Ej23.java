package tema5;

/*Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media*/

import java.util.Scanner;

public class Ej23 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Este programa perimite ir introduciendo una serie indeterminada de numeros mientras no supere el valor 10.000");
        int total = 0;
        int cont = 0;
        
        while (total <= 10000) {            
            System.out.println("Introduzca un numero");
            int num = s.nextInt();
            
            total = total + num;
            cont = cont + 1;
            System.out.println("Llevas acumulado " + total);
  
        }
        
        double media = total/cont;
        
        System.out.println("El total acumulado es " + total + " y la cantidad de numeros introducidos es " + cont + " ademas su media es " +  media);
        
    }   //FIN PROGRAMA

}
