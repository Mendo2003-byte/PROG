package Tema9;

/* Mostrar un parrafo de varias lineas y pedir una palabra del mismo y otra por la que
se quiera sustituir. Imprimir el parrafo con la palabra cambiada.*/

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un parrafo de varias lineas");
        String parrafo = s.nextLine();

        String[] separado = parrafo.split(" ");

        System.out.println("Introduce la palabra que deseas sustituir");
        String palabra = s.next();
        
        System.out.println("Introduce la palabra por la que sustituir");
        String sustituir = s.next();

        for (int i = 0; i < separado.length; i++) {
            if (separado[i].equals(palabra)) {
                separado[i] = separado[i].replace(separado[i],sustituir);
            }
        }
        
        for (String string : separado) {
            System.out.print(string+" ");
        }
        System.out.println("");

    }

}
