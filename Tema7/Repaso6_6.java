package Tema7;


public class Repaso6_6 {

    public static void main(String[] args) {

        
        int [][] tablero = new int [6][10];
        int max =0;
        int min = 200;
        boolean repetido = false;
        int [] numeros = new int [60];
        int cont=0;
        int cont2;
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                repetido=false;
                do {                    
                    cont2=0;
                    tablero[i][j]= (int) ((Math.random()*101)+100);
                    numeros[cont]=tablero[i][j];
                    
                    for (int k = 0; k < numeros.length && cont2<2; k++) {
                        if (numeros[k]==tablero[i][j]) {
                            cont2++;
                        } 
                    }

                    repetido=cont2==2;
             
                } while (repetido);
                
                System.out.print(tablero[i][j]+"\t");
                cont++;
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
