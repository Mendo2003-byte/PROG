package tema5;


/*Realiza un programa que pinte la letra R por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
 */
import java.util.Scanner;

public class Ej_R {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la altura de la R");
        int h = s.nextInt();
        int cont = 0;

        for (int i = 0; i < h; i++) {

            for (int j = 0; j < h; j++) {

                if ((i == 0) && (j < h/2)) {
                    System.out.print("* ");

                } else if (j == 0) {
                    System.out.print("* ");

                } else if ((i == h/2) && (j < h/2)) {
                    System.out.print("* ");

                } else if ((j == h / 2) && (i < h / 2) && (i > 0)) {
                    System.out.print("* ");
                
                } else if ((cont == j) && (i > h / 2) && (j <= h / 2)) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");

                }

            }

            if (i >= h / 2) {
                cont = cont + 1;

            }
            System.out.println("");
        }

    }//FIN PROGRAMA

}
