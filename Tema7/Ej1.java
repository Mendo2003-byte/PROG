package Tema7;

/*Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados?*/

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int num[] = new int [12];
        
        for (int i = 0; i < num.length; i++) {  //Introduce numeros
            System.out.println("Introduce un numero");
            num [i] = s.nextInt();
        }
        
        for (int i = 0; i < num.length; i++) {  //Muestra por pantalla
            System.out.println(num[i]);
            
        }
    }

}
