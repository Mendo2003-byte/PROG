package Tema7;

/*Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.*/

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int num[] = new int[15];

        for (int i = 0; i < num.length; i++) {  //Introduce los numeros 
            System.out.println("Introduce el numero en la posicion " + (i + 1) + "º");
            num[i] = s.nextInt();
            
        }

        for (int i = num.length; i > 0; i--) {  //Cambia de posicion el primero con el ultimo
            
            System.out.println(i);
            
            if (i == num.length) {
                System.out.println("numero " + num[i-1] + " posicion " + (i + 1) + "º");

            } else {
                System.out.println("numero " + num[num.length-i+1] + " posicion " + (i + 1) + "º");
            }

        }

    }   //FIN PROGRAMA

}
