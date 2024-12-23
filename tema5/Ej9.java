/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

/*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado.
*/
import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Este programa te indica la cantidad de digitos introducidos");
        int num = s.nextInt();
        int digitos = 0;
        
        
        while (Math.abs(num) > 0) {            
            
            num = num/10;
            
            digitos +=1;
        }
        
        System.out.println("el numero tiene " + digitos + " digitos");
        
    }   //FIN PROGRAMA
    
}
