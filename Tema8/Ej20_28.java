package Tema8;

import java.util.Scanner;
import Tema8Funciones.Funcion20_28;

public class Ej20_28 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean salir = true;
        int num;
        int max=0;
        int min=0;
        int num1;
        int [] generado = {0};

        do {

            Funcion20_28.menu();

            System.out.println("Introduce la operacion que desees realizar ");
            int ope = s.nextInt();

            switch (ope) {
                case 1:
                    System.out.println("----------------------GENERA ARRAY-------------------------");
                    System.out.println("");
                    System.out.println("Introduce el tamaño el array");
                    num = s.nextInt();
                    System.out.println("Introduce los el valor maximo que se va a generar el random que rellenara el array");
                    max = s.nextInt();
                    System.out.println("Introduce los el valor minimo que se va a generar el random que rellenara el array");
                    min = s.nextInt();
                    generado = Funcion20_28.array(num, max, min);
                    for (int i : generado) {
                        System.out.println(i);
                    }
                    
                    break;
                case 2:
                    System.out.println("----------------------DEVUELVE MINIMO-------------------------");
                    System.out.println("");
                    Funcion20_28.minimoarray(generado, max);
                    break;

                case 3:
                    System.out.println("----------------------DEVUELVE MAXIMO-------------------------");
                    System.out.println("");
                    Funcion20_28.maximoarray(generado, min);
                    break;
                case 4:
                    System.out.println("----------------------MEDIA ARRAY-------------------------");
                    System.out.println("");
                    Funcion20_28.mediaarray(generado);
                    break;
                case 5:
                    System.out.println("----------------------ESTA NUMERO EN ARRAY-------------------------");
                    System.out.println("");
                    System.out.println("Introduce el numero que deseas saber si se encuentra en el array");
                    num1 = s.nextInt();
                    Funcion20_28.numeroarray(generado, num1);
                    break;
                case 6:
                    System.out.println("----------------------POSICION NUMERO EN ARRAY-------------------------");
                    System.out.println("");
                    System.out.println("Introduce un numero y encuentra su posicion en el array");
                    num1 = s.nextInt();
                    Funcion20_28.posicionarray(generado, num1);
                    break;
                case 7:
                    System.out.println("----------------------VOLTEA ARRAY-------------------------");
                    System.out.println("");
                    Funcion20_28.volteaarray(generado);
                    break;
                case 8:
                    System.out.println("----------------------ROTA ARRAY DERECHA-------------------------");
                    System.out.println("");
                    System.out.println("Introduce cuantas posiciones quieres rotar hacia la derecha");
                    num1 = s.nextInt();
                    Funcion20_28.rotaderechaarray(generado, num1);                    
                    break;
                case 9:
                    System.out.println("----------------------ROTA ARRAY IZQUIERDA-------------------------");
                    System.out.println("");
                    System.out.println("Introduce cuantas posiciones quieres rotar hacia la izquierda");
                    num1 = s.nextInt();
                    Funcion20_28.rotaizquierdaarray(generado, num1);
                    break;
                case 10:
                    salir = false;
                    break;
                default:
                    System.out.println("OPERACION NO VALIDA");
            }

        } while (salir);

    }

}
