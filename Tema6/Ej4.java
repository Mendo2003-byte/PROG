package Tema6;

/*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.*/

public class Ej4 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 20; i++) {
            
            int aleatorio = (int) (Math.random()*11);
            System.out.println(aleatorio + " ");
            
        }

    }

}
