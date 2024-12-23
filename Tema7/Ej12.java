package Tema7;

/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que
ambos números están entre 0 y 9. El programa deberá colocar el número de
la posición inicial en la posición final, rotando el resto de números para que no
se pierda ninguno. Al final se debe mostrar el array resultante.*/

import java.util.Scanner;

public class Ej12 {

    public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
       
       int num[]= new int [10];
       int fin=0;
       int ini=0;     
       
        System.out.println("----------VALORES-----------");
        for (int i = 0; i < num.length; i++) {
            
            System.out.println("Introduce un valor");
            num[i]= s.nextInt();
            
        }
        
        System.out.println("---------ARRAY INICIAL-----------");
        for (int i = 0; i < num.length; i++) {
            
            System.out.println("posicion "+ i +" valor " +num[i]);
            
        }
        
        System.out.println("-------CAMBIO POSICIONES--------");
        do {            
            
            System.out.println("Introduce la posicion inicial");
            ini=s.nextInt();
            System.out.println("Introduce la posicion final");
            fin=s.nextInt();
            
        } while (ini>fin || (ini<0 && ini>9) || (fin<0 && fin>9));
        
        int cambio=num[9];
        
        for (int i = num.length-1; i >= 0; i--) {
            
            if (i==0) {
                num[0]=cambio;
 
            } else if (i==fin) {
                num[fin]=num[ini];
                
            } else if (ini<i && fin>i) {       
                
            } else {
                num[i]= num[i-1];
  
            }
            
        }
        
        System.out.println("-----------ARRAY FINAL------------");
        
        for (int i = 0; i < num.length; i++) {
            
            System.out.println("posicion "+ i +" valor " +num[i]);
            
        }
        
        
    }

}
