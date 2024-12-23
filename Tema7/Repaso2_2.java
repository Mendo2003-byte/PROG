package Tema7;


import java.util.Scanner;

public class Repaso2_2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int [][] tablero = new int[5][6];
        int sumfila;
        int sumacol;
        
        for (int i = 0; i < tablero.length-1; i++) {
            for (int j = 0; j < tablero[0].length-1; j++) {
                
                tablero[i][j]= (int) ((Math.random()*900)+100);
                
            }
        }      
        
        for (int i = 0; i < tablero.length; i++) {
            sumfila=0;
            for (int j = 0; j < tablero[0].length; j++) {
            
                if (j==5) {
                    tablero[i][j]=sumfila;
                }else{
                    sumfila=sumfila+tablero[i][j];
                }  
            }
        }
        
        for (int i = 0; i < tablero[0].length; i++) {
            sumacol=0;
            for (int j = 0; j < tablero.length; j++) {
            
                if (j==4) {
                    tablero[j][i]=sumacol;
                }else{
                    sumacol=sumacol+tablero[j][i];
                }  
            }
        }
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                
                System.out.print(tablero[i][j]+"\t");
                
            }
            System.out.println("");
        }
        
    }

}
