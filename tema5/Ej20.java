package tema5;

/*Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.*/
import java.util.Scanner;

public class Ej20 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa pintara una piramide hueca dependiendo de la altura introducida");
        System.out.println("Introduce la altura de la piramide hueca");
        int h = s.nextInt();

        while (h < 3) {
            System.out.println("La altura debe de ser mayor de tres para poder hacer una piramide");
            h = s.nextInt();
        }

        System.out.println("Introduce el caracter con el que deseas pintar la piramide");
        char c = s.next().charAt(0);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h + i; j++) {
                if ((j < (h - i) - 1)) {
                    System.out.print(" ");

                } else if ((j == (h + i) - 1) || ((i == 0) && (j == h - 1)) || (i == h - 1) || (j == (h - i) - 1)) {
                    System.out.print(c);

                } else {
                    System.out.print(" ");
                }

            }

            System.out.println("");
        }

    }   //FIN PROGRAMA

}
