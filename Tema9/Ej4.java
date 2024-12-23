package Tema9;

/* Mostrar un parrafo de varias lineas y pedir una palabra, mostrar todas las
posiciones en las que aparece dicha palabra.*/

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un parrafo de varias lineas");
        String parrafo = s.nextLine();
        System.out.println("Introduce la palabra que deseas buscar");
        String palabra = s.next();
        
        String [] separado = parrafo.split(" ");
        
        System.out.print("La palabra "+palabra+" Se encuentra en las posiciones: ");
        
        for (int i = 0; i < separado.length; i++) {
            
            if (separado[i].equals(palabra)) {
                System.out.print(i+" ");
            }
            
        }
        
        System.out.println("");
    }

}
