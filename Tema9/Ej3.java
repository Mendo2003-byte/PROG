package Tema9;

/*Completar el ejercicio anterior añadiendo otro filtro con la terminación del nombre. Si
se introduce el texto vacío ignorar el filtro.*/

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        String [] nombres = new String [10];
        
        for (int i = 0; i < nombres.length; i++) {
            
            System.out.println("Introduce un nombre");
            nombres[i]=s.nextLine();
            
        }
        
        System.out.println("¿Que filtro quieres aplicar?");
        System.out.println("Filtro de prefijo");
        String filtro1 = s.nextLine();
        System.out.println("Filtro de sufijo");
        String filtro2 = s.nextLine();
        System.out.println("");
        System.out.println("Estos son los nombres que empiezan con "+filtro1+" y terminan con "+ filtro2 + ":");
        System.out.println("");
        
        for (String nombre : nombres) {
            if (nombre.startsWith(filtro1) && nombre.endsWith(filtro2)) {
                System.out.println(nombre);
            } else if (nombre.startsWith(filtro1) && filtro2.equals("")){
                System.out.println(nombre);
            }
        }
        
    }

}
