package Tema8;

/*Crea una biblioteca de funciones matemáticas que contenga las siguientes
funciones. Recuerda que puedes usar unas dentro de otras si es necesario.*/
import Tema8Funciones.Funcion1_14;
import java.util.Scanner;

public class Ej1_14 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean salir = true;
        int num;
        int num2;
        int num3;

        do {

            Funcion1_14.menu();

            System.out.println("Introduce la operacion que desees realizar ");
            int ope = s.nextInt();

            switch (ope) {
                case 1:
                    System.out.println("----------------------CAPICUA-------------------------");
                    System.out.println("");
                    System.out.println("Introduce el numero que desees saber si es capicua");
                    num = s.nextInt();
                    System.out.println(Funcion1_14.esCapicua(num));
                    break;
                case 2:
                    System.out.println("----------------------PRIMO-------------------------");
                    System.out.println("");
                    System.out.println("Introduce el numero que desees saber si es primo");
                    num = s.nextInt();
                    System.out.println(Funcion1_14.esPrimo(num));
                    break;
                case 3:
                    System.out.println("----------------------SIGUIENTE PRIMO-------------------------");
                    System.out.println("");
                    System.out.println("Introduce el numero del que desees conocer su siguiente primo");
                    num = s.nextInt();                    
                    System.out.println(Funcion1_14.siguientePrimo(num));
                    break;
                case 4:
                    System.out.println("----------------------POTENCIA-------------------------");
                    System.out.println("");
                    System.out.println("Introduce la base de la potencia");
                    num = s.nextInt();
                    System.out.println("Introduce el exponente de la potencia");
                    num2 = s.nextInt();
                    System.out.println(Funcion1_14.potencia(num, num2));
                    break;
                case 5:
                    System.out.println("----------------------CANTIDAD DE DIGITOS-------------------------");
                    System.out.println("");
                    System.out.println("Introduce el numero del que desees conocer su cantidad de digitos");
                    num = s.nextInt();                     
                    System.out.println(Funcion1_14.digitos(num));
                    break;
                case 6:
                    System.out.println("----------------------VOLTEA NUMERO-------------------------");
                    System.out.println("");
                    System.out.println("Introduce el numero el cual desees voltear");
                    num = s.nextInt(); 
                    System.out.println(Funcion1_14.voltea(num));
                    break;
                case 7:
                    System.out.println("----------------------POSICION DIGITO-------------------------");
                    System.out.println("");
                    System.out.println("Introduce un numero");
                    num = s.nextInt();
                    System.out.println("Introduce la posicion del digito que desees conocer (empieza en 0 de izquierda a derecha)");
                    num2 = s.nextInt();                    
                    System.out.println(Funcion1_14.digitoN(num, num2));
                    break;
                case 8:
                    System.out.println("----------------------CONOCER POSICION DIGITO-------------------------");
                    System.out.println("");
                    System.out.println("Introduce un numero");
                    num = s.nextInt();
                    System.out.println("Introduce el digito del que desees conocer su primera ocurrencia");
                    num2 = s.nextInt();
                    System.out.println(Funcion1_14.posiciondigito(num, num2));
                    break;
                case 9:
                    System.out.println("----------------------QUITAR DETRAS-------------------------");
                    System.out.println("");
                    System.out.println("Introduce un numero");
                    num = s.nextInt();
                    System.out.println("Introduce cuantos digitos deseas quitar por detras (derecha)");
                    num2 = s.nextInt();
                    System.out.println(Funcion1_14.quitadetras(num, num2));
                    break;
                case 10:
                    System.out.println("----------------------QUITAR DELTANTE-------------------------");
                    System.out.println("");
                    System.out.println("Introduce un numero");
                    num = s.nextInt();
                    System.out.println("Introduce cuantos digitos deseas quitar por delante (izquierda)");
                    num2 = s.nextInt();                    
                    System.out.println(Funcion1_14.quitadelante(num, num2));
                    break;
                case 11:
                    System.out.println("----------------------AGREGAR DETRAS-------------------------");
                    System.out.println("");
                    System.out.println("Introduce un numero");
                    num = s.nextInt();
                    System.out.println("Introduce el digito que desees agregar por detras");
                    num2 = s.nextInt();
                    System.out.println(Funcion1_14.añadedetras(num, num2));
                    break;
                case 12:
                    System.out.println("----------------------AGREGAR DELANTE-------------------------");
                    System.out.println("");                    
                    System.out.println("Introduce un numero");
                    num = s.nextInt();
                    System.out.println("Introduce el digito que desees agregar por delante");  
                    num2 = s.nextInt();
                    System.out.println(Funcion1_14.añadedeltante(num, num2));
                    break;
                case 13:
                    System.out.println("----------------------CORTAR NUMERO-------------------------");
                    System.out.println("");
                    System.out.println("Introduce un numero");
                    num = s.nextInt();
                    System.out.println("Introduce la posicion inicial");
                    num2 = s.nextInt();
                    System.out.println("Introduce la posicion final");
                    num3 = s.nextInt();                    
                    System.out.println(Funcion1_14.trozodenumero(num, num2, num3));
                    break;
                case 14:
                    System.out.println("----------------------PEGAR NUMERO-------------------------");
                    System.out.println("");
                    System.out.println("Introduce un numero");
                    num = s.nextInt();
                    System.out.println("Introduce el segundo numero que desees pegar");
                    num2 = s.nextInt();
                    System.out.println(Funcion1_14.peganumero(num, num2));
                    break;
                case 15:
                    salir=false;
                    break;
                default:
                    System.out.println("OPERACION NO VALIDA");
            }

        } while (salir);

    }

}
