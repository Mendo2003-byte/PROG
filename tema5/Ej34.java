package tema5;

/*Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando
los dígitos de la siguiente manera: primer dígito del primer número, primer
dígito del segundo número, segundo dígito del primer número, segundo
dígito del segundo número, tercer dígito del primer número… Para facilitar
el ejercicio, podemos suponer que el usuario introducirá dos números de la
misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
long en lugar de int donde sea necesario para admitir números largos.
 */
import java.util.Scanner;

public class Ej34 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un primer valor");
        long num1 = Math.abs(s.nextInt());
        System.out.println("Introduce un segundo valor");
        long num2 = Math.abs(s.nextInt());
        long num11 = num1;
        long num22 = num2;
        long mod1;
        long mod2;
        long div1;
        long div2;
        long dig = 0;
        long totalpares = 0;
        long totalimpares = 0;
        long numpar = 0;
        long numimp = 0;
        
        while (num11 > 0) {
            if (num11 % 2 == 0) {
                totalpares += 1;

            } else {
                totalimpares += 1;

            }
            num11 = num11 / 10;
            dig = dig + 1;
        }

        while (num22 > 0) {
            if (num22 % 2 == 0) {
                totalpares += 1;

            } else {
                totalimpares += 1;

            }
            num22 = num22 / 10;
        }

        for (int i = 0; i < dig; i++) {
            for (int j = 0; j < 2; j++) {
                
                if (j % 2 == 0) {
                    div1 = (long) (num1 / Math.pow(10, (dig - i) - 1));
                    mod1 = (long) (num1 % Math.pow(10, (dig - i) - 1));
                    num1 = mod1;

                    if (div1 % 2 == 0) {
                        totalpares -= 1;
                        numpar = numpar + (long) (div1 * Math.pow(10, totalpares));

                    } else {
                        totalimpares -= 1;
                        numimp = numimp + (long) (div1 * Math.pow(10, totalimpares));

                    }

                } else {
                    div2 = (long) (num2 / Math.pow(10, (dig - i) - 1));
                    mod2 = (long) (num2 % Math.pow(10, (dig - i) - 1));
                    num2 = mod2;

                    if (div2 % 2 == 0) {
                        totalpares -= 1;
                        numpar = numpar + (long) (div2 * Math.pow(10, totalpares));

                    } else {
                        totalimpares -= 1;
                        numimp = numimp + (long) (div2 * Math.pow(10, totalimpares));

                    }

                }

            }

        }

        System.out.println("El número formado por los dígitos pares es " + numpar);
        System.out.println("El número formado por los dígitos impares es " + numimp);

    }   //FIN PROGRAMA

}
