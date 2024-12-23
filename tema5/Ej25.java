package tema5;

/*Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
 */
import java.util.Scanner;

public class Ej25 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa te muestra el numero introducido pero al reves");
        int dig = -1;
        int mod;
        int div;
        int result = 0; 
        int num;     
        
        // Este bucle lo utilizo para que el numero introducido tenga obligatoriamente 2 cifras o mas  
        do {
            System.out.println("Introduce un numero de mas de una cifra");
            num = Math.abs(s.nextInt());
            
        } while (num < 10);
        
        // Este bucle lo utilizo para contar la cantidad de digitos y asi contar las veces que se repetira el proximo bucle        
        int numn = num;
        
        while (numn > 0) {
            numn = numn / 10;
            dig = dig + 1;

        }

        // Este bucle se utiliza para dar la vuelta al numero
        numn = num;

        for (int i = 0; i < dig ; i++) {
            if (numn >= 100) {
                mod = numn % 10;
                div = numn / 10;
                numn = div;
                result = (int) (result + ((Math.pow(10, dig - i)) * mod));

            } else {
                mod = numn % 10;
                div = numn / 10;
                numn = div;
                result = (int) (result + ((Math.pow(10, dig - i)) * mod) + numn);

            }

        }
        System.out.println("El numero " + num + " al reves es " + result);

    }   //FIN PROGRAMA

}
