package tema5;

/*Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
*/

import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int positivo = 0;
        int negativo = 0;
        System.out.println("Este programa lee una lista de diez numero y determina si cuantos son positivos o negativos");
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Introduzca un numero");
            int num = s.nextInt();
            
            if (num < 0) {
                negativo+=1;
                
            } else {
                positivo+=1;
                          
            }
            
        }
        System.out.println("hay " + positivo + " positivos, y hay " + negativo + " negativos");
        
    }   //FIN PROGRAMA

}
