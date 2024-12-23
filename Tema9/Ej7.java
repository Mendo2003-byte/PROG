package Tema9;

/* Formatear un string leido por teclado, poner todo en minúscula y el primer caracter
en mayuscula.*/

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un parrafo de varias lineas");
        String parrafo = s.nextLine().toLowerCase();
        
       String result = parrafo.substring(0,1).toUpperCase() + parrafo.substring(1);
        
       System.out.println(result);
    }

}
