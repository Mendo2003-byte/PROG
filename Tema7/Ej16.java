package Tema7;

/*Escribe un programa que rellene un array de 20 elementos con números enteros 
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
array escribiendo los números que se quieren resaltar entre corchetes.*/
import java.util.Scanner;

public class Ej16 { 

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] num = new int[20];

        for (int i = 0; i < num.length; i++) {  //Genera Numeros aleatorios
            num[i] = (int) (Math.random() * 401);
            System.out.print(num[i] + " ");
        }

        System.out.println("¿Que numeros quieres resaltar?");
        System.out.println("1.Multiplos de 5");
        System.out.println("2.Multiplos de 7");
        int mult = s.nextInt();

        switch (mult) { //Swith para escoger el tipo de multiplos que se señalan
            case 1:
                for (int i = 0; i < num.length; i++) {  //Escribe entre "*" el numero multiplo de 5
                    if (num[i] % 5 == 0) {  
                        System.out.print("*" + num[i] + "* ");
                    } else {
                        System.out.print(num[i] + " ");
                    }
                }
                break;
            case 2:
                for (int i = 0; i < num.length; i++) {  //Escribe entre "*" el numero multiplo de 7
                    if (num[i] % 7 == 0) {
                        System.out.print("*" + num[i] + "* ");
                    } else {
                        System.out.print(num[i] + " ");
                    }
                }
                break;
            default:
                System.out.println("OPERACION NO VALIDA");  
        }
        System.out.println("");

    }

}
