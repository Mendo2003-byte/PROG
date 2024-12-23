package Tema7;


public class Repaso5_5 {

    public static void main(String[] args) {

        
        int [][] tablero = new int [6][10];
        int max =0;
        int min = 200;
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                
                tablero[i][j]= (int) ((Math.random()*101)+100);
                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                
                if (tablero[i][j]<min) {
                    min=tablero[i][j];
                } else if (tablero[i][j]>max) {
                    max=tablero[i][j];
                }
                
            }
        }
        
        System.out.println("El maximo de los valores generados es: "+max);
        System.out.println("El menor de los valores generados es: "+min);

        
    }

}
