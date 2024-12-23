package Tema9;

/*Leer una cadena de texto por teclado y pedir un numero entre 1 y 25 para encriptarla.
La encriptación consiste en cambiar cada caracter de la cadena por el correspondiente a su codigo
ascii más el numero leido. Mostrar la frase encriptada*/

import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        char cambio;
        
        System.out.println("Introduce un parrafo de varias lineas");
        String parrafo = s.nextLine().trim();
        
        for (int i = 0; i <= parrafo.length()-1; i++) {
            
            cambio = (char) (parrafo.charAt(i)+25);
            
            System.out.print(cambio);
            
        }
        System.out.println("");
        
    }

}
