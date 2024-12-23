package tema5;


/*Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.
*/

import java.util.Scanner;

public class Ej26 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un numero ");
        int num = Math.abs(s.nextInt());
        System.out.println("Introduce el digito del cual desees conocer su posicion");
        int dig = Math.abs(s.nextInt());
        int num2 = num;
        int cont_dig = 0;
        int div;
        int mod;
        
        // bucle que cuenta la cantidad de digitos que tiene el numero introducido para contar la cantidad de veces que se repite el siguiente bucle
        
        while (num2 > 0){
            num2 = num2/10;
            cont_dig = cont_dig+1;
        
        }
        
        //bucle que evalua en que posicion se encuentra el digito que se a introducido
        
        for (int i = 1; i < cont_dig; i++) {
            
            div = (int) (num / (Math.pow(10, cont_dig -i))); 
            mod = (int) (num % (Math.pow(10, cont_dig -i)));
            
            num = mod;
            
            if (div == dig) {
                
                System.out.println("El digito " + dig + " Se encuentra en la posicion " + i);
                
            } else if (mod == dig){
            
            System.out.println("El digito " + dig + " Se encuentra en la posicion " + (i+1));
                
            }
            
            
            
        }
        
        
    }   //FIN PROGRAMA

}
