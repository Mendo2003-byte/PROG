package Tema9;

/*Mostrar un parrafo de varias lineas y pedir una palabra, mostrar el parrafo de nuevo sin
esa la palabra. Posteriormente completar el ejercicio haciendo que pida palabras que se irán
eliminando hasta que se introduzca la palabra salir.*/
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un parrafo de varias lineas");
        String parrafo = s.nextLine();

        String[] separado = parrafo.split(" ");
        boolean salir = false;

        do {
            System.out.println("Introduce la palabra que deseas eliminar");
            String palabra = s.next();

            if (palabra.equals("salir")) {
                salir = true;
            }

            if (!salir) {

                parrafo = parrafo.replace(palabra, "");
                
                System.out.println(parrafo.trim());
            }

        } while (!salir);

    }
}
