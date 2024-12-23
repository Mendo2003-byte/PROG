package Tema7;

/*Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.*/
import java.util.Scanner;

public class Ej2_2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = 6; //eje x columnas
        int y = 5; //eje y filas
        int[][] tablero = new int[y][x];

        for (int i = 0; i < tablero.length-1; i++) { // almacenar los datos en las filas y columnas
            for (int j = 0; j < tablero[0].length-1; j++) {

                System.out.print("Introduce un valor: ");
                tablero[i][j] = s.nextInt();
            }
            System.out.println("");
        }

        for (int i = 0; i < tablero.length; i++) { //suma de filas
            int sumafil = 0;
            for (int j = 0; j < tablero[0].length; j++) {
                if (j == 5) {
                    tablero[i][j] = sumafil;

                } else {
                    sumafil = sumafil + tablero[i][j];

                }

            }

        }
        
        for (int i = 0; i < tablero[0].length; i++) { //suma de columnas
            int sumacol = 0;
            for (int j = 0; j < tablero.length; j++) {
                if (j == 4) {
                    tablero[j][i] = sumacol;

                } else {
                    sumacol = sumacol + tablero[j][i]; // le doy la vuelta para que se introduzca en la zona correcta ya que i es filas y cambia j columnas

                }

            }

        }
        
        
        for (int i = 0; i < tablero.length; i++) { // mostrar en pantalla
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j]+"\t");
                
            }
            System.out.println("");
        }
        
    }   // FIN PROGRAMA

}
