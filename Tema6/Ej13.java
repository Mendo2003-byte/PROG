package Tema6;

/*Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.*/
public class Ej13 {

    public static void main(String[] args) {

        int dado1;
        int dado2;

        do {

            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            System.out.println("El primer dado tienen el valor " + dado1);
            System.out.println("El segundo dado tienen el valor " + dado2);
            System.out.println("");

        } while (dado1 != dado2);

    }//FIN PROGRAMA

}
