package Tema8;

import java.util.Scanner;

public class Simulacro_1 {

    public static void main(String[] args) {

        Scanner s =new Scanner (System.in);

        
        System.out.println("Numero de personas: ");
        int p = s.nextInt();
        
        double[] altura = new double[p];  
        
        double total=0;
        
        System.out.println("Acontinuacion debes de introducir sus alturas (entre 100 y 250)");
        
        for (int i = 0; i < altura.length; i++) {
            
            do {                
                
                System.out.print("Altura de la persona "+(i+1)+": ");
                altura[i]=s.nextDouble();
                
                if (altura[i]<100 || altura[i]>250) {
                    System.out.println("No es una altura valida vuelve a intentarlo");
                }
                
            } while (altura[i]<100 || altura[i]>250);
                
            total=total+altura[i];
        }
        
        double media= total/altura.length+1;
        int menores=0;
        int mayores=0;
        
        for (int i = 0; i < altura.length; i++) {
            System.out.println("Persona "+(i+1)+" = "+ altura[i]);
            
            if (altura[i]>media) {
                mayores++;
            } else {
                menores++;
            }
            
        }
        
        System.out.println("Estatura media: "+media);
        System.out.println("Personas con estatura superior a la media: "+ mayores);
        System.out.println("Personas con Estatura inferior a la media: "+menores);
        
        
    }

}
