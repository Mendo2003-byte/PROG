/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

/**
 *
 * @author Usuario
 */

/*Muestra la tabla de multiplicar de un número introducido por teclado.*/

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca el numero del que desees conocer su tabla de multiplicar");
        int num = s.nextInt();
        
        for (int i = 0; i < 11; i++) {
            System.out.println("Esta es la tabla de multiplicar del "+ num );
            System.out.println(num + " x " + i + " = " + (num * i));
            
        }
        
    }   //FIN PROGRAMA
    
}
