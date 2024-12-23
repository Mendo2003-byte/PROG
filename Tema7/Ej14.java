package Tema7;

/*Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.*/
import java.util.Scanner;

//8 bi
public class Ej14 {

    public static void main(String[] args) {    //CORREGIR

        Scanner s = new Scanner(System.in);

        String[] coloresconocidos = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

        String[] palabras = new String[8];
        String[] colores = new String[8];
        int conti = 0;
        boolean bandera;

        for (int i = 0; i < palabras.length; i++) {     //Introduce el color

            System.out.println("Introduce una palabra");
            palabras[i] = s.next().toLowerCase();

            for (String coloresconocido : coloresconocidos) {   //Compara si el color coincide con algun color del array "colores conocidos"
                if (palabras[i].equals(coloresconocido)) {
                    colores[conti] = palabras[i];
                    conti++;
                }
            }

        }

        for (String palabra : palabras) { 
            bandera=false;
            for (String coloresconocido : coloresconocidos) {   //Compara la palabra ya introducida anteriormente con el array de "colores conocidos"
                if (palabra.equals(coloresconocido)) {
                    bandera=true;
                } 
            }
            if (!bandera) {     //Si la palabra no se encuentra en el array de "coloresconocidos" se almacena en colores a partir del ultimo valor del conti
                colores[conti] = palabra;
                conti++;
            }
        }

        for (String colore : colores) {     //Muestra el resultado por pantalla
            System.out.println(colore);
        }

    }

}
