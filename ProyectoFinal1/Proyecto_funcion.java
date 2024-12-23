package ProyectoFinal1;

import java.util.Scanner;

public class Proyecto_funcion {

    public static void menu() {

        System.out.println("--------------MENU---------------");
        System.out.println("1.Reglas");
        System.out.println("2.Juego");
        System.out.println("3.Salir");

    }

    public static void reglas() {

        System.out.println("--------------REGLAS--------------");
        System.out.println("1. Usted tendra al inicio del juego un total de 10 creditos para apostar");
        System.out.println("2. Podra apostar la cantidad que usted desee y se recibira el doble de dicha cantidad");
        System.out.println("3.En este juego gana el caballo llegue o se quede mas cerca de la meta ");
        System.out.println("4.Para avanzar debera de coincidir con el del palo de la carta levantada");
        System.out.println("5.Cuando todos los palos avanzen una casilla se levantara una");
        System.out.println("carta a su derchas y el palo que se muestre retrocedera");

    }

    public static void Bienvenida() {

        System.out.println("---------------------------------");
        System.out.println("BIENVENIDO A LA CARRERA DE NAIPES");
        System.out.println("---------------------------------");

    }

    public static int pedirApuesta(Scanner s, int totalCreditos) {
        int apuesta;
        do {
            System.out.println("¿Cuántos créditos deseas apostar? (Tienes " + totalCreditos + " créditos)");
            apuesta = s.nextInt();
        } while (apuesta < 1 || apuesta > totalCreditos);
        return apuesta;
    }

    public static String eligePalo(Scanner s) {
        String palo;
        do {
            System.out.println("Elige un palo: corazón, trébol, rombo o pica");
            palo = s.next().toLowerCase();
        } while (!palo.equals("corazón") && !palo.equals("trébol") && !palo.equals("rombo") && !palo.equals("pica"));
        return palo;
    }

    public static void muestraTablero(String[][] tablero) {
        for (String[] fila : tablero) {
            for (String celda : fila) {
                System.out.print(celda);
            }
            System.out.println();
        }
    }

    public static void siguienteCarta(boolean salir, Scanner s) {
        if (!salir) {
            System.out.println("Pulse enter para mostrar la siguiente carta...");
            s.nextLine();
        }
    }

    public static int ganadorJuego(int cont, int[] contpalos, String paloelegido, String[] resultado, int creditos, int totalcreditos) {
        if (cont == 44 && (contpalos[0] == contpalos[1] || contpalos[0] == contpalos[2] || contpalos[0] == contpalos[3] || contpalos[1] == contpalos[2] || contpalos[1] == contpalos[3] || contpalos[2] == contpalos[3])) {
            System.out.println("Ha habido un empate por lo tanto se le devolverán los créditos.");
            return totalcreditos;
        } else if (paloelegido.equals(resultado[1])) {
            System.out.println("El palo ganador ha sido " + resultado[1]);
            System.out.println("¡Enhorabuena, ha ganado!");
            totalcreditos += creditos;
            System.out.println("Ahora tiene un total de " + totalcreditos + " créditos.");
            return totalcreditos;
        } else {
            System.out.println("El palo ganador ha sido " + resultado[1]);
            System.out.println("Lo siento, ha perdido " + creditos + " créditos.");
            totalcreditos -= creditos;
            System.out.println("Le queda un total de " + totalcreditos + " créditos.");
            return totalcreditos;
        }
    }

    public static int asignarTablero(String[][] tablero, int[] contpalos, int[] palo, int[] salidos, boolean repetido, int cont) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (j == 4 && i == 10) {
                    repetido = true;
                    do {
                        // BUCLE PARA QUE NO SE REPITAN LOS VALORES
                        palo[cont] = (int) (Math.random() * 44);
                        salidos[cont] = palo[cont];
                        int cont2 = 0;

                        //COMPROBANTE DE SI EL PALO YA SALIO
                        for (int k = 0; k < salidos.length && k <= cont; k++) {
                            if (salidos[k] == palo[cont]) {
                                cont2++;
                            }
                        }
                        repetido = cont2 == 2;
                    } while (repetido);

                    // ASIGNAR AL TABLERO LOS PALOS QUE SALEN
                    if (palo[cont] < 11) {
                        tablero[i][j] = "♥";
                        contpalos[3]--; // Corazones
                        tablero[contpalos[3]][3] = "♥ ";
                    } else if (palo[cont] < 22) {
                        tablero[i][j] = "♣️️";
                        contpalos[2]--; // Tréboles
                        tablero[contpalos[2]][2] = "♣ ";
                    } else if (palo[cont] < 33) {
                        tablero[i][j] = "♦";
                        contpalos[1]--; // Diamantes
                        tablero[contpalos[1]][1] = "♦ ";
                    } else {
                        tablero[i][j] = "♠️";
                        contpalos[0]--; // Picas
                        tablero[contpalos[0]][0] = "♠ ";
                    }
                    cont++;

                    // PALOS DE LA PARTE INFERIOR 
                } else if (j == 3 && i == 10) {
                    tablero[i][j] = "♥ ";
                } else if (j == 2 && i == 10) {
                    tablero[i][j] = "♣ ";
                } else if (j == 1 && i == 10) {
                    tablero[i][j] = "♦ ";
                } else if (j == 0 && i == 10) {
                    tablero[i][j] = "♠ ";

                    // CARTAS SOBRANTES  
                } else if (i < contpalos[0] && i < contpalos[1] && i < contpalos[2] && i < contpalos[3]) {
                    tablero[i][j] = "🂠 ";
                }
            }
        }
        return cont;
    }

    public static int retrocederTablero(String[][] tablero, int[] contpalos, int[] palo, int[] salidos, boolean repetido, int cont, int pasoatras) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (j == 4 && i == 10) {
                    // BUCLE PARA QUE NO SE REPITAN LOS VALORES
                    repetido = true;
                    do {
                        palo[cont] = (int) (Math.random() * 44);
                        salidos[cont] = palo[cont];
                        int cont2 = 0;

                        for (int k = 0; k < salidos.length && k <= cont; k++) {
                            if (salidos[k] == palo[cont]) {
                                cont2 = cont2 + 1;
                            }
                        }
                        repetido = cont2 == 2;

                    } while (repetido);
                    // PALOS QUE SALEN Y HACEN RETROCEDER
                    if (palo[cont] < 11) {
                        tablero[pasoatras][j] = "♥ ";
                        tablero[i][j] = "🂠 ";
                        tablero[contpalos[3]][3] = "🂠 ";
                        contpalos[3]++;
                    } else if (palo[cont] < 22) {
                        tablero[pasoatras][j] = "♣ ";
                        tablero[i][j] = "🂠 ";
                        tablero[contpalos[2]][2] = "🂠 ";
                        contpalos[2]++;
                    } else if (palo[cont] < 33) {
                        tablero[pasoatras][j] = "♦ ";
                        tablero[i][j] = "🂠 ";
                        tablero[contpalos[1]][1] = "🂠 ";
                        contpalos[1]++;
                    } else {
                        tablero[pasoatras][j] = "♠ ";
                        tablero[i][j] = "🂠 ";
                        tablero[contpalos[0]][0] = "🂠 ";
                        contpalos[0]++;
                    }
                    cont++;

                    // PALOS DE LA PARTE INFERIOR    
                } else if (j == 3 && i == 10) {
                    tablero[i][j] = "♥ ";
                } else if (j == 2 && i == 10) {
                    tablero[i][j] = "♣ ";
                } else if (j == 1 && i == 10) {
                    tablero[i][j] = "♦ ";
                } else if (j == 0 && i == 10) {
                    tablero[i][j] = "♠ ";

                    // CARTAS SOBRANTES    
                } else if (i < contpalos[0] && i < contpalos[1] && i < contpalos[2] && i < contpalos[3]) {
                    tablero[i][j] = "🂠 ";
                }
            }
        }
        return cont;
    }

    public static String[] ganador(int[] contpalos, int cont, String[] resultado) {

        if (contpalos[3] == 0 || (contpalos[3] <= contpalos[1] && contpalos[3] <= contpalos[2] && contpalos[3] <= contpalos[0] && cont == 44)) {
            resultado[0] = "true";
            resultado[1] = "corazon";
        } else if (contpalos[2] == 0 || (contpalos[2] <= contpalos[0] && contpalos[2] <= contpalos[1] && contpalos[2] <= contpalos[3] && cont == 44)) {
            resultado[0] = "true";
            resultado[1] = "trebol";
        } else if (contpalos[1] == 0 || (contpalos[1] <= contpalos[0] && contpalos[1] <= contpalos[2] && contpalos[1] <= contpalos[3] && cont == 44)) {
            resultado[0] = "true";
            resultado[1] = "rombo";
        } else if (contpalos[0] == 0 || (contpalos[0] <= contpalos[1] && contpalos[0] <= contpalos[2] && contpalos[0] <= contpalos[3] && cont == 44)) {
            resultado[0] = "true";
            resultado[1] = "pica";
        }
        return resultado;
    }

}
