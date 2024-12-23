package Tema7;

/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario.*/
public class Ej10 {

    public static void main(String[] args) {

        int num[] = new int[20];
        int ordenpar[] = new int[20];
        int par = 0;
        int impar = num.length-1;

        for (int i = 0; i < num.length; i++) {  //Genera numeros aleatorios

            num[i] = (int) (Math.random() * 101);

        }

        System.out.print("Los numero generados son los siguientes: ");
        
        for (int i = 0; i < num.length; i++) {

            System.out.print(num[i] + " ");
            
            if (num[i] % 2 == 0) {  //Ordena primero los pares
                ordenpar[par] = num[i];
                par++;

            } else {    //Ordena los impares desde el final
                ordenpar[impar] = num[i];
                impar--;
            }

        }
        System.out.println(" ");
        
        System.out.print("El array ordenado es el siguiente: ");
        for (int i = 0; i < ordenpar.length; i++) { //Muestra el resultado
            
            System.out.print(ordenpar[i]+" ");
            
        }
        
        System.out.println("");

    }   //FIN PROGRAMA

}
