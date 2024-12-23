package Tema9;

/*Crear un array con muchos nombres, pedir un texto como filtro y mostrar todos los
nombres que empiecen por ese texto.*/

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        String [] nombres = new String [10];
        
        for (int i = 0; i < nombres.length; i++) {
            
            System.out.println("Introduce un nombre");
            nombres[i]=s.nextLine();
            
        }
        
        System.out.println("¿Que filtro quieres aplicar?");
        String filtro = s.next();
        System.out.println("");
        System.out.println("Estos son los nombres que empiezan con "+filtro+":");
        System.out.println("");
        
        for (String nombre : nombres) {
            if (nombre.startsWith(filtro)) {
                System.out.println(nombre);
            }
        }
        
    }

}
