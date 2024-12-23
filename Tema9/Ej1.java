package Tema9;

//Leer dos cadenas de texto e imprimir la mayor de ellas y su longitud.

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce una cadena de texto");
        String cadena1 = s.nextLine();
        System.out.println("Introduce la segunda cadena de texto");
        String cadena2 = s.nextLine();
        
        if (cadena1.length()<cadena2.length()) {
            
            System.out.println("La cadena mas larga es");
            System.out.println(cadena2);
            System.out.println("con un total de "+cadena2.length()+" caracteres");
            
        } else {
            
            System.out.println("La cadena mas larga es");
            System.out.println(cadena1);
            System.out.println("con un total de "+cadena1.length()+" caracteres");
        }
        
    }

}
