package tema5;

/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
 */
import java.util.Scanner;

public class Ej19 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa te pinta una piramide con la altura y el caracter que tu introduzcas");
        int h = 0;
        int base = 0;

        while (h <= 0) {
            System.out.println("Introduce la altura de la piramide debera de ser mayor de 0");
            h = s.nextInt();

        }

        System.out.println("Introduce el caracter con el que deseas pintar la piramide");
        char c = s.next().charAt(0);

        for (int i = 0; i < h; i++) { //tareas
            for (int j = 0; j <= h + base; j++) { //que hago en cada tarea
                if (j < h - base) {
                    System.out.print(" ");

                } else {
                    System.out.print(c);
                }
            }
            base = base + 1;
            System.out.println(" ");//siguiente tarea
        }

    }   //FIN PROGRAMA

}
