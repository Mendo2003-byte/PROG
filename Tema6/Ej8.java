package Tema6;

/*Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.*/
public class Ej8 {

    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            System.out.print(i + "\t");
            if (i == 15) {
                int aleatorio = (int) (Math.random() * 6);
                switch (aleatorio) {
                    case 1,2,3 ->
                        System.out.print(" | 1");
                    case 4,5 ->
                        System.out.print(" | X");
                    default ->
                        System.out.print(" | 2");
                }
            } else {
                for (int j = 0; j < 3; j++) {

                    int aleatorio = (int) (Math.random() * 6);

                    switch (aleatorio) {
                        case 1,2,3 ->
                            System.out.print(" | 1");
                        case 4,5 ->
                            System.out.print(" | X");
                        default ->
                            System.out.print(" | 2");
                    }
                }

            }
            System.out.println(" | ");

        }

    }
}
