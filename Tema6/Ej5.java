package Tema6;

/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.*/

public class Ej5 {

    public static void main(String[] args) {

        int max = 0;
        int min = 199;
        int media = 0;
        
        for (int i = 0; i < 50; i++) {
            
            int aleatorio = (int) (Math.random()*100)+100;
            System.out.println(aleatorio + " ");
           
            media = aleatorio +media;
            
            if (aleatorio>max) {
                max = aleatorio;
                
            }
            
            if (aleatorio<min){
                min = aleatorio;
            }
            
        }
        System.out.println("El numero maximo de los numeros aleatorios es " + max);
        System.out.println("El numero minimo de los numeros aleatorios es " + min);
        System.out.println("La media de los numeros aleatorios es " + (media/50));
        
    }

}
