package Tema7;

/*Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.*/

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Este programa te muestra la temperatura media anual con un diagrama de barras horizontales");
        
        int temp[] = new int[12];
        String mes = null;
        int max=0;
        
        for (int i = 0; i < temp.length; i++) {
            
            switch (i) {
                case 0 -> {mes = "Enero";}
                case 1 -> {mes = "Febrero";}
                case 2 -> {mes = "Marzo";}
                case 3 -> {mes = "Abril";}
                case 4 -> {mes = "Mayo";}
                case 5 -> {mes = "Junio";}
                case 6 -> {mes = "Julio";}
                case 7 -> {mes = "Agosto";}
                case 8 -> {mes = "Septiembre";}
                case 9 -> {mes = "Octubre";}
                case 10 -> {mes = "Noviembre";}
                case 11 -> {mes = "Diciembre";}

            }
            
            System.out.println("Introduce la temperatura media de " + mes);
            temp[i]=s.nextInt();
            
            if (temp[i]>max) {
                max=temp[i];
                
            }
            
        }
        
        for (int i = 0; i < temp.length; i++) {
            
            switch (i) {
                case 0 -> {mes = "Enero";}
                case 1 -> {mes = "Febrero";}
                case 2 -> {mes = "Marzo";}
                case 3 -> {mes = "Abril";}
                case 4 -> {mes = "Mayo";}
                case 5 -> {mes = "Junio";}
                case 6 -> {mes = "Julio";}
                case 7 -> {mes = "Agosto";}
                case 8 -> {mes = "Septiembre";}
                case 9 -> {mes = "Octubre";}
                case 10 -> {mes = "Noviembre";}
                case 11 -> {mes = "Diciembre";}

            }
            
            for (int j = 0; j < max; j++) {
                
                if (j<temp[i]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println(" " + mes);
            
        }
        
    }//FIN PROGRAMA

}
