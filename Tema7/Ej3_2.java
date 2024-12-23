package Tema7;

/*Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).*/

public class Ej3_2 {

    public static void main(String[] args) {

        int x = 6; //eje x columnas
        int y = 5; // eje y filas
        int [][] tablero = new int[y][x];
        
        for (int i = 0; i < y-1; i++) { // almacenar los datos en las filas y columnas
            for (int j = 0; j < x-1; j++) {
                
                tablero[i][j]= (int)(Math.random()*900)+100;
                
            }
        }
        
        for (int i = 0; i < y; i++) { //suma de filas
            int sumfil=0;
            for (int j = 0; j < x; j++) {
                if (j==5) {
                    tablero[i][j]= sumfil;
                    
                } else {
                    sumfil= sumfil+tablero[i][j];
                    
                }
            }
        }
        
        for (int i = 0; i < x; i++) { //suma de columnas
            int sumcol=0;
            for (int j = 0; j < y; j++) {
                if (j==4) {
                    tablero[j][i]= sumcol;
                    
                } else {
                    sumcol= sumcol+tablero[j][i];// le doy la vuelta para que se introduzca en la zona correcta ya que i es filas y cambia j columnas
                    
                }
            }
        }
        
        for (int i = 0; i < y; i++) { // mostrar por pantalla
            for (int j = 0; j < x; j++) {
                
                System.out.print(tablero[i][j]+"\t");
                
            }
            System.out.println(" ");
        }
        
    }   //FIN PROGRAMA

}
