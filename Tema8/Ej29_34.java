package Tema8;

import java.util.Scanner;
import Tema8Funciones.Funcion29_34;

public class Ej29_34 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        boolean salir = true;
        int n;
        int m;
        int max;
        int min;
        int fila;
        int columna;
        int num;
        String direccion;
        int [][] generado = null;

        do {

            Funcion29_34.menu();

            System.out.println("Introduce la operacion que desees realizar ");
            int ope = s.nextInt();

            switch (ope) {
                case 1:
                    System.out.println("----------------------GENERA ARRAY-------------------------");
                    System.out.println("");
                    System.out.println("Introduce la cantidad de columnas del array");
                    n = s.nextInt();
                    System.out.println("Introduce la cantidad de filas del array");
                    m = s.nextInt();
                    System.out.println("Introduce los el valor maximo que se va a generar el random que rellenara el array");
                    max = s.nextInt();
                    System.out.println("Introduce los el valor minimo que se va a generar el random que rellenara el array");
                    min = s.nextInt();
                    generado = Funcion29_34.array(n,m, max, min);
                    for (int[] is : generado) {
                        for (int i : is) {
                            System.out.print(i+"\t");
                        }
                        System.out.println("");
                    }
                    
                    break;
                case 2:
                    System.out.println("----------------------FILA ARRAY-------------------------");
                    System.out.println("");
                    System.out.println("Introduce la fila que desees mostrar (empieza desde 0)");
                    fila = s.nextInt();
                    Funcion29_34.filaarray(generado, fila);
                    break;

                case 3:
                    System.out.println("----------------------COLUMNA ARRAY-------------------------");
                    System.out.println("");
                    System.out.println("Introduce la columna que desees mostrar (empieza desde 0)");
                    columna = s.nextInt();
                    Funcion29_34.columnaarray(generado, columna);
                    break;
                case 4:
                    System.out.println("----------------------CORDENADAS ARRAY-------------------------");
                    System.out.println("");
                    System.out.println("Introduce el numero que desees saber donde se encuentra su primera ocurrencia");
                    num = s.nextInt();
                    Funcion29_34.primeraocurrencia(generado, num);
                    break;
                case 5:
                    System.out.println("----------------------PUNTO DE SILLA ARRAY-------------------------");
                    System.out.println("");
                    System.out.println("Introduce el numero que desees saber donde si es o no punto de silla");
                    num = s.nextInt();
                    Funcion29_34.puntosilla(generado, num);
                    
                    break;
                case 6:
                    System.out.println("----------------------DIAGONAL ARRAY-------------------------");
                    System.out.println("");
                    System.out.println("Introduce la columna que determinara la posicion");
                    columna = s.nextInt();
                    System.out.println("Introduce la fila que determinara la posicion");
                    fila = s.nextInt();
                    System.out.println("Introduce la direccion que tomara la diagonal(nose noroeste sureste, neso noreste suroeste)");
                    direccion = s.next();
                    Funcion29_34.diagonal(generado, direccion, fila, columna);
                    break;
                case 7:
                    salir = false;
                    break;
                default:
                    System.out.println("OPERACION NO VALIDA");
            }

        } while (salir);

        
    }

}
