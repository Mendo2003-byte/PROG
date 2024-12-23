package Tema6;

/*Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas).*/
public class Ej7 {

    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            System.out.print(i + "\t");
            if (i == 15) {
                int aleatorio = (int) (Math.random() * 3);
                switch (aleatorio) {
                    case 1 ->
                        System.out.print(" | " + aleatorio);
                    case 2 ->
                        System.out.print(" | " + aleatorio);
                    default ->
                        System.out.print(" | X");
                }
            } else {
                for (int j = 0; j < 3; j++) {

                    int aleatorio = (int) (Math.random() * 3);

                    switch (aleatorio) {
                        case 1 ->
                            System.out.print(" | " + aleatorio);
                        case 2 ->
                            System.out.print(" | " + aleatorio);
                        default ->
                            System.out.print(" | X");
                    }
                }

            }
            System.out.println(" | ");

        }

    }

}
