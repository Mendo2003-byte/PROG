package Tema7;


/*Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en
mostrarse y viceversa.*/

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

         Scanner s = new Scanner(System.in);
        
        int num[] = new int [10];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce el numero º" + (i+1));
            num [i] = s.nextInt();
        }
        
        for (int i = num.length-1; i >= 0; i--) {
            System.out.println(num[i]);
            
        }
        
    }

}
