package Tema9;

/*Leer dos cadenas de textos y decir si son equivalentes (si son iguales ignorando las
mayusculas y los espacios del principio y del final).*/

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un parrafo de varias lineas");
        String parrafo1 = s.nextLine().trim();
        System.out.println("Introduce otro parrafo de varias lineas");
        String parrafo2 = s.nextLine().trim();
        
        System.out.println(parrafo1.equalsIgnoreCase(parrafo2));
    }

}
