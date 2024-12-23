package Tema7;

/*Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.*/

public class Ej13 {

    public static void main(String[] args) {

        int max=0;
        int min=500;
        
        int[] num = new int [100];
        
        for (int i = 0; i < num.length; i++) {  //Genera numeros aleatorios
            
            num [i]= (int) (Math.random()*500);
            
        }
        
        for (int i = 0; i < num.length; i++) {  //Averigua Max y Min
         
            if (num[i]>max) {
                max=num[i];    
            } 
            
            if (num[i]<min) {
                min=num[i];
            }
            
        }
        
        for (int i = 0; i < num.length; i++) {  //Muestra Max y Min entre "*"
            
            if (num[i]==max) {
                System.out.print("*"+max+"*,");
            } else if (num[i]==min){
                System.out.print("*"+min+"*,");
            } else if (i==num.length-1){
                System.out.println(num[i]); 
            } else {
                System.out.print(num[i]+","); 
            }
            
              
            
        }
        
    }

}
