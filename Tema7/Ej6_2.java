package Tema7;

/*Modifica el programa anterior de tal forma que no se repita ningún número en
el array.*/
public class Ej6_2 {

    public static void main(String[] args) { //TERMINAR

        int x = 10; //eje x columnas
        int y = 6; //eje y filas
        int[][] tablero = new int[y][x];
        int[] repetir = new int[61];
        int max = 0;
        int min = 1000;
        int cont = 0;
        int cont2;
        boolean repetido;

        for (int i = 0; i < y; i++) { // almacenar los datos en las filas y columnas
            for (int j = 0; j < x; j++) {
            repetido=true;
                do {    // Bucle que se repite hasta que la bandera sea falsa
                    tablero[i][j] = (int) (Math.random() * 61);
                    repetir[cont] = tablero[i][j];
                    cont2 = 0;

                    for (int k = 0; k < repetir.length && k<=cont; k++) {  //bucle que mira en el array si se encuentra el numero mas de una vez
                        if (repetir[k] == tablero[i][j]) {  //condicion que cuando sea igual los valores de ambos suma 1 al contador
                            cont2++;
                        }

                    }

                    if (cont2 == 2) {   //Condicion que si se cumple repite el bucle do while
                        repetido = true;
              
                    } else {    //Condicion que rompe el bucle
                        repetido = false;
                        cont++;
                    }

                } while (repetido);

                if (tablero[i][j] > max) { // maximo
                    max = tablero[i][j];
                }

                if (tablero[i][j] < min) { // minimo
                    min = tablero[i][j];
                }

            }

        }

        for (int i = 0; i < y; i++) { // mostrar por pantalla
            for (int j = 0; j < x; j++) {
                System.out.print(tablero[i][j] + "\t");
            }
            System.out.println(" ");
        }

        System.out.println("El numero maximo es: " + max);
        System.out.println("El numero mainimo es: " + min);

    }

}
