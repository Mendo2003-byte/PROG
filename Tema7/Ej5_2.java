package Tema7;

/*Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
A continuación, el programa deberá dar la posición tanto del máximo como
del mínimo.*/


public class Ej5_2 {

    public static void main(String[] args) {

        int x = 10; //eje x columnas
        int y = 6; //eje y filas
        int [][] tablero = new int[y][x];
        int max=0;
        int min = 1000;
        
        
        for (int i = 0; i < y; i++) { // almacenar los datos en las filas y columnas
            for (int j = 0; j < x; j++) {
                tablero[i][j]=(int) (Math.random()*1001);
                
                if (tablero[i][j]>max) { // maximo
                    max= tablero[i][j];
                }
                
                if (tablero[i][j]<min) { // minimo
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
        
        System.out.println("El numero maximo es: "+ max);
        System.out.println("El numero mainimo es: "+ min);

        
    }   //FIN PROGRAMA

}
