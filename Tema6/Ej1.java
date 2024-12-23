package Tema6;

/*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).*/

public class Ej1 {

    public static void main(String[] args) {

        int total = 0;
        
        for (int i = 0; i < 3; i++) {
            
            int dado = (int)(Math.random()*6)+1;
            System.out.println("El dado en esta tirada tiene un valor de " + dado);
            total = total + dado;
            
        }
        System.out.println("El total de la suma de los resultado de los dados es " + total);
        
        
    }

}
