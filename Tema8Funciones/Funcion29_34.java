package Tema8Funciones;

public class Funcion29_34 {

    public static void menu() {

        System.out.println("----------MENU-----------");
        System.out.println("1.GENERA ARRAY");
        System.out.println("2.FILA ARRAY");
        System.out.println("3.COLUMNA ARRAY");
        System.out.println("4.CORDENADAS ARRAY");
        System.out.println("5.PUNTO DE SILLA ARRAY");
        System.out.println("6.DIAGONAL ARRAY");
        System.out.println("7.SALIR");

    }

    public static int[][] array(int n, int m, int max, int min) {

        int[][] numero = new int[n][m];

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[0].length; j++) {

                numero[i][j] = (int) (Math.random() * (max - min + 1)) + min;

            }
        }

        return numero;

    }

    public static void filaarray(int generado[][], int fila) {

        for (int i = 0; i < generado.length; i++) {
            for (int j = 0; j < generado[0].length; j++) {

                if (i == fila) {
                    System.out.print(generado[i][j] + "\t");
                }
            }
            System.out.println("");
        }

    }

    public static void columnaarray(int generado[][], int columna) {

        for (int i = 0; i < generado.length; i++) {
            for (int j = 0; j < generado[0].length; j++) {

                if (j == columna) {
                    System.out.print(generado[i][j] + "\t");
                }
            }
            System.out.println("");
        }

    }

    public static void primeraocurrencia(int generado[][], int num) {

        boolean salir = false;

        for (int i = 0; i < generado.length && !salir; i++) {
            for (int j = 0; j < generado[0].length; j++) {
                if (generado[i][j] == num) {
                    System.out.println(i + " , " + j);
                    salir = true;
                }
            }
        }

        if (!salir) {
            System.out.println("-1,-1");
        }

    }

    public static void puntosilla(int generado[][], int num) {

        boolean salir = false;
        boolean puntoc = true;
        boolean puntof = true;
        int fila = 0;
        int columna = 0;

        for (int i = 0; i < generado.length && !salir; i++) {
            for (int j = 0; j < generado[0].length; j++) {
                if (generado[i][j] == num) {
                    fila = i;
                    columna = j;
                    salir = true;
                }
            }
        }

        for (int i = 0; i < generado.length; i++) {
            for (int j = 0; j < generado[0].length; j++) {
                if (columna == j && generado[i][j] > num) {
                    puntoc = false;
                } else if (fila == i && generado[i][j] < num) {
                    puntof = false;
                }

            }
        }

        if (puntoc && puntof) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static void diagonal(int generado[][], String direccion, int fila, int columna) {

        int filaaux = fila;
        int colaux = columna;
        int [] diagonales = new int [generado.length];
        int cont=0;

        if (direccion.equals("nose")) {

            filaaux = fila;
            colaux = columna;            
            
            System.out.println("---------------DIAGONAL---------------");
            System.out.println("");
            
            for (int i = 0; i < generado.length; i++) {
                for (int j = 0; j < generado[0].length; j++) {

                    if (i <= generado.length && i >= 0 && j <= generado[0].length && j >= 0 && colaux == j && filaaux == i) {
                        diagonales[cont]=generado[i][j];
                        cont++;
                        filaaux++;
                        colaux++;
                    }

                }
            }

            filaaux = fila - 1;
            colaux = columna - 1;

            for (int i = generado.length - 1; i >= 0; i--) {
                for (int j = generado[0].length - 1; j >= 0; j--) {

                    if (i <= generado.length && i >= 0 && j <= generado[0].length && j >= 0 && colaux == j && filaaux == i) {
                        diagonales[cont]=generado[i][j];
                        cont++;
                        filaaux--;
                        colaux--;
                    }

                }
            }

        } else if(direccion.equals("neso")) {

            filaaux = fila;
            colaux = columna;
            
            System.out.println("---------------DIAGONAL---------------");
            System.out.println("");

            for (int i = 0; i < generado.length; i++) {
                for (int j = 0; j < generado[0].length; j++) {

                    if (i <= generado.length && i >= 0 && j <= generado[0].length && j >= 0 && colaux == j && filaaux == i) {
                        diagonales[cont]=generado[i][j];
                        cont++;
                        filaaux++;
                        colaux--;
                    }

                }
            }

            filaaux = fila-1;
            colaux = columna+1;
            
            for (int i = generado.length - 1; i >= 0; i--) {
                for (int j = generado[0].length - 1; j >= 0; j--) {

                    if (i <= generado.length && i >= 0 && j <= generado[0].length && j >= 0 && colaux == j && filaaux == i) {
                        diagonales[cont]=generado[i][j];
                        cont++;
                        filaaux--;
                        colaux++;
                    }

                }
            } 
        }
        
        for (int i = 0; i < diagonales.length && i<cont; i++) {
            System.out.print(diagonales[i]+" ");
        }
        System.out.println("");
    }

}
