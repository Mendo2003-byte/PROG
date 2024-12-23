package tema5;

/*Escribe un programa que, dado un número entero, diga cuáles son y cuánto
suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.*/
import java.util.Scanner;

public class Ej32 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un numero");
        long num = Math.abs(s.nextInt());
        long num2 = num;
        int dig = 0;
        long mod;
        long div;
        long total = 0;

        while (num2 > 0) {  //cantidad de digitos
            num2 = num2 / 10;
            dig += 1;
        }
        
        System.out.print("Digitos pares: ");
        
        for (int i = 1; i <= dig; i++) {
            mod = (long) (num % Math.pow(10,(dig-i)));   // resto de cifras
            div = (long) (num / Math.pow(10,(dig-i)));   // separacion primera cifras
            num = mod;
            
            if (div % 2 == 0) {     //condicional numeros pares
                System.out.print(div + " ");
                total = total + div;
                
            }
        }
        System.out.println ("\nSuma de los digitos pares: " + total);        
        
    }   // FIN PROGRAMA

}
