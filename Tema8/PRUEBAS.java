package Tema8;


public class PRUEBAS {

    public static void main(String[] args) {

        int filaaux=2;
        int colaux=2;
        int [][] generado = new int [5][5];
        
        for (int i = 0; i < generado.length; i++) {
            for (int j = 0; j < generado[0].length; j++) {
                
                generado[i][j]=(int) (Math.random()*10);
                
            }
        }
        
        for (int[] is : generado) {
            for (int i : is) {
                System.out.print(i+"\t");
            }
            System.out.println("");
        }
        
        
        for (int i = generado.length-1; i >= 0; i--) {
            for (int j = generado[0].length-1; j >= 0; j--) {

                if (i<=generado.length && i>=0 && j<=generado[0].length && j>=0 && colaux==j && filaaux==i) {
                    System.out.println(generado[i][j]);
                    filaaux--;
                    colaux++;
                }
                
            }
        } 
    } 
    
        
        
    }
