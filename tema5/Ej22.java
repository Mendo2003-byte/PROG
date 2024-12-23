package tema5;

/*Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.*/
public class Ej22 {

    public static void main(String[] args) {

        
        for (int i = 2; i <= 100; i++) {
            int div = 0;
            
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    div = div + 1;

                }
            }    
            if (div == 2) {
                System.out.println(i);   
                
            }

        }

    }   // FIN PROGRAMA

}
