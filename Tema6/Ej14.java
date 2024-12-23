package Tema6;

/*Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
El programa intentará adivinar el número que estás pensando - un número
entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
programa debe preguntar si el número que estás pensando es mayor o menor
que el que te acaba de decir.*/
import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int adivina;
        int min = 0;
        int max = 100;
        boolean bandera = false;
        
        do {
            System.out.println("Introduce un numero que el programa debera de adivinar");
            adivina = s.nextInt();
        } while (adivina > 100 || adivina < 0);


        for (int i = 0; i < 5; i++) {

            System.out.println(min);
            System.out.println(max);

            int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println(aleatorio);
            System.out.println("El numero que pensaste es mayor o menor que el que se muestra");
            String num = s.next().toLowerCase();

            if (aleatorio == adivina) {
                System.out.println("La maquina adivino tu numero");
                i = 5;
                bandera= true ;
                
            } else {
                switch (num) {
                    case "mayor" -> {
                        min = aleatorio;
                    }

                    case "menor" -> {
                        max = aleatorio;
                    }
                }
            }

        }
        
        if (bandera) {
            System.out.println("La maquina a adivinado tu numero");
            
        } else {
            System.out.println("La maquina no a adivinado tu numero");
            
        }
        
    }

}
