package Tema7;

public class Ej10_mejora {

    public static void main(String[] args) {

        int num[] = new int[20];
        int ordenpar[] = new int[20];
        int par = 0;
        int impar = 0;

        for (int i = 0; i < num.length; i++) {  //Genera numeros aleatorios

            num[i] = (int) (Math.random() * 101);

        }

        System.out.print("Los numero generados son los siguientes: ");

        for (int i = 0; i < num.length; i++) {

            System.out.print(num[i] + " ");

            if (num[i] % 2 == 0) {  //Ordena primero los pares
                ordenpar[par] = num[i];
                par++;
            }
        }

        for (int i = 0; i < num.length; i++) {
            
            if (num[i] % 2 != 0) {  //Ordena primero los pares
                ordenpar[impar+par] = num[i];
                impar++;
            }
            
        }

        System.out.println(" ");

        System.out.print("El array ordenado es el siguiente: ");
        for (int i = 0; i < ordenpar.length; i++) { //Muestra el resultado

            System.out.print(ordenpar[i] + " ");

        }

        System.out.println("");

    }

}
