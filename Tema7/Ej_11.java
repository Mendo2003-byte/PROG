package Tema7;

/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que
no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
el array resultante.*/

import java.util.Scanner;

public class Ej_11 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int num []= new int [10];
        int orden[]= new int[10];
        int primo = 0;
        int noprimo=orden.length-1;
        
        for (int i = 0; i < num.length; i++) {  //Introduce los valores
            
            System.out.println("Introduce un numero");
            num[i]=s.nextInt();
        }
        
        System.out.println("------LISTA DE VALORES------");
        
        for (int i = 0; i < num.length; i++) {  //Muestra los valores
            
            System.out.println("En la posicion "+(i+1)+ " Se encuentra el valor "+num[i]);
            
        }
        
        for (int i = 0; i < orden.length; i++) {    //bucle para recorrer todos los numeros  
            int cont = 0;
                for (int j = 1; j <= num[i]; j++) { //Bucle que aumenta el contador para saber si es primo o no
                    if (num[i]%j==0) {
                        cont = cont+1;
                    }
            }
                   
            if (cont<=2) {  //Si el contador es menor o igual a dos es primo y lo almacena en el principio
                orden[primo]= num[i];
                primo=primo+1;
                
            } else {    //Si el contador es mayor que dos no es primo y lo almacena desde el final 
                orden[noprimo] = num[i];
                noprimo=noprimo-1;
            }
 
        }
        
        System.out.println("-------LISTA ORDENADA-------");
        
        for (int i = 0; i < orden.length; i++) {    //Muestra por pantalla
            
            System.out.println("En la posicion "+(i+1)+ " se encuentra el valor " + orden[i]);
            
        }
        
    }

}
