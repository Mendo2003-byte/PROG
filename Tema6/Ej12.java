package Tema6;

/*Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter.
*/

public class Ej12 {

    public static void main(String[] args) throws InterruptedException {
        
        for (int i = 0; i < 20; i++) {
            int bucle = (int) (Math.random() * 33) + 32;
            for (int j = 0; j < bucle; j++) {
                char aleatorio = (char) ((int) (Math.random() * 95) + 32);
                System.out.print(aleatorio);
                Thread.sleep(250);
            }

            System.out.println(" ");
        }

        
    }

}
