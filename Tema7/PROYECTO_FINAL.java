package Tema7;

import java.util.Scanner;

public class PROYECTO_FINAL {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //VARIABLES DEL PROGRAMA
        String[][] tablero = new String[11][5];

        int totalcreditos = 10;
        int creditos = 0;
        String paloelegido = null;
        String ganador = null;

        // INICIO DEL JUEGO
        System.out.println("---------------------------------");
        System.out.println("BIENVENIDO A LA CARRERA DE NAIPES");
        System.out.println("---------------------------------");
        boolean bandera = true;

        do {    //WHILE HASTA QUE SE QUIERA SALIR DEL PROGRAMA Y NO SEGURI JUGANDO

            //MENU DEL PROGRAMA CON SUS OPERACIONES
            System.out.println("--------------MENU---------------");
            System.out.println("1.Reglas");
            System.out.println("2.Juego");
            System.out.println("3.Salir");
            int menu = s.nextInt();

            //SWITH CON CADA UNA DE LAS OPERACIONES
            switch (menu) {
                case 1:

                    //REGLAS DEL JUEGO
                    System.out.println("--------------REGLAS--------------");
                    System.out.println("1. Usted tendra al inicio del juego un total de 10 creditos para apostar");
                    System.out.println("2. Podra apostar la cantidad que usted desee y se recibira el doble de dicha cantidad");
                    System.out.println("3.En este juego gana el caballo llegue o se quede mas cerca de la meta ");
                    System.out.println("4.Para avanzar el palo de la carta debera de coincidir con el del caballo");
                    System.out.println("5.Cuando todos los caballos avanzen una casilla se levantara una");
                    System.out.println("carta a su derchas y el caballo que coincida con dicho palo retrocedera");
                    break;
                case 2:

                    int[] palo = new int[44];
                    int[] salidos = new int[45];
                    boolean salir = false;
                    boolean repetido;
                    int cont = 0;
                    int cont2;
                    int contcora = 10;
                    int conttrebol = 10;
                    int contrombo = 10;
                    int contpicas = 10;
                    int pasoatras = 9;

                    do {
                        System.out.println("¿Cuantos creditos desea usted apostar ? ");
                        System.out.println("Su cantidad de creditos para apostar es " + totalcreditos + " creditos");
                        creditos = s.nextInt();
                    } while (creditos < 1 || creditos > totalcreditos);

                    do {
                        System.out.println("Introduzca a que palo desea jugar (corazon, rombo, trebol o pica)");
                        paloelegido = s.next().toLowerCase();
                    } while (!"corazon".equals(paloelegido) && !"rombo".equals(paloelegido) && !"trebol".equals(paloelegido) && !"pica".equals(paloelegido));

                    //JUEGO
                    do {

                        for (int i = 0; i < tablero.length; i++) {
                            for (int j = 0; j < tablero[0].length; j++) {
                                if (j == 4 && i == 10) {

                                    // BUCLE PARA QUE NO SE REPITAN LOS VALORES
                                    repetido = true;
                                    do {
                                        palo[cont] = (int) (Math.random() * 44);
                                        salidos[cont] = palo[cont];
                                        cont2 = 0;

                                        for (int k = 0; k < salidos.length && k <= cont; k++) {
                                            if (salidos[k] == palo[cont]) {
                                                cont2 = cont2 + 1;
                                            }
                                        }

                                        repetido = cont2 == 2;

                                    } while (repetido);

                                    // PALOS QUE SALEN
                                    if (palo[cont] < 11) {
                                        tablero[i][j] = "♥";
                                        contcora--;
                                        tablero[contcora][3] = "♥ ";
                                    } else if (palo[cont] < 22) {
                                        tablero[i][j] = "♣️️";
                                        conttrebol--;
                                        tablero[conttrebol][2] = "♣ ";
                                    } else if (palo[cont] < 33) {
                                        tablero[i][j] = "♦";
                                        contrombo--;
                                        tablero[contrombo][1] = "♦ ";
                                    } else {
                                        tablero[i][j] = "♠️";
                                        contpicas--;
                                        tablero[contpicas][0] = "♠ ";
                                    }

                                    cont = cont + 1;

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
                                } else if (i < contcora && i < conttrebol && i < contrombo && i < contpicas) {
                                    tablero[i][j] = "🂠 ";
                                }
                            }
                        }

                        // MOSTRAR TABLERO Y CONDICIONES DE SALIDA
                        for (String[] tablero1 : tablero) {
                            for (int j = 0; j < tablero[0].length; j++) {
                                System.out.print(tablero1[j]);
                            }
                            System.out.println(" ");
                        }

                        //CONDICIONES DE SALIDAS O CONTINUAR
                        if (contcora == 0 || (contcora <= conttrebol && contcora <= contrombo && contcora <= contpicas && cont == 44)) {
                            salir = true;
                            ganador = "corazon";
                        } else if (conttrebol == 0 || (conttrebol <= contcora && conttrebol <= contrombo && conttrebol <= contpicas && cont == 44)) {
                            salir = true;
                            ganador = "trebol";
                        } else if (contrombo == 0 || (contrombo <= contcora && contrombo <= conttrebol && contrombo <= contpicas && cont == 44)) {
                            salir = true;
                            ganador = "rombo";
                        } else if (contpicas == 0 || (contpicas <= conttrebol && contpicas <= contrombo && contpicas <= contcora && cont == 44)) {
                            salir = true;
                            ganador = "pica";
                        }

                        if (!salir) {
                            System.out.println("Pulse una tecla para mostrar la siguiente carta...");
                            s.next();
                        }

                        //REALIZANDO PASO ATRAS CUANDO SE AVANCE LA PRIMERA CASILLA
                        if ((contcora < pasoatras && conttrebol < pasoatras && contpicas < pasoatras && contrombo < pasoatras) && !salir) {
                            for (int i = 0; i < tablero.length; i++) {
                                for (int j = 0; j < tablero[0].length; j++) {
                                    if (j == 4 && i == 10) {
                                        // BUCLE PARA QUE NO SE REPITAN LOS VALORES
                                        repetido = true;
                                        do {
                                            palo[cont] = (int) (Math.random() * 44);
                                            salidos[cont] = palo[cont];
                                            cont2 = 0;

                                            for (int k = 0; k < salidos.length && k <= cont; k++) {
                                                if (salidos[k] == palo[cont]) {
                                                    cont2 = cont2 + 1;
                                                }
                                            }
                                            repetido = cont2 == 2;

                                        } while (repetido);
                                        // PALOS QUE SALEN
                                        if (palo[cont] < 11) {
                                            tablero[pasoatras][j] = "♥ ";
                                            tablero[i][j] = "🂠 ";
                                            tablero[contcora][3] = "🂠 ";
                                            contcora++;
                                        } else if (palo[cont] < 22) {
                                            tablero[pasoatras][j] = "♣ ";
                                            tablero[i][j] = "🂠 ";
                                            tablero[conttrebol][2] = "🂠 ";
                                            conttrebol++;
                                        } else if (palo[cont] < 33) {
                                            tablero[pasoatras][j] = "♦ ";
                                            tablero[i][j] = "🂠 ";
                                            tablero[contrombo][1] = "🂠 ";
                                            contrombo++;
                                        } else {
                                            tablero[pasoatras][j] = "♠ ";
                                            tablero[i][j] = "🂠 ";
                                            tablero[contpicas][0] = "🂠 ";
                                            contpicas++;
                                        }
                                        pasoatras--;
                                        cont = cont + 1;

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
                                    } else if (i < contcora && i < conttrebol && i < contrombo && i < contpicas) {
                                        tablero[i][j] = "🂠 ";
                                    }

                                }

                            }

                            // MOSTRAR TABLERO POR SEGUNDA VEZ SI RETROCEDE EL PALO
                            for (String[] tablero1 : tablero) {
                                for (int j = 0; j < tablero[0].length; j++) {
                                    System.out.print(tablero1[j]);
                                }
                                System.out.println(" ");
                            }

                            //CONDICIONES DE SALIDAS O CONTINUAR
                            //BARAJAR POSIBILIDAD DE EMPATE Y QUE EL QUE ESTE MAS CECA DE LA META GANE
                            // GANADOR DEL PROGRAMA
                            if (contcora == 0 || (contcora <= conttrebol && contcora <= contrombo && contcora <= contpicas && cont == 44)) {
                                salir = true;
                                ganador = "corazon";
                            } else if (conttrebol == 0 || (conttrebol <= contcora && conttrebol <= contrombo && conttrebol <= contpicas && cont == 44)) {
                                salir = true;
                                ganador = "trebol";
                            } else if (contrombo == 0 || (contrombo <= contcora && contrombo <= conttrebol && contrombo <= contpicas && cont == 44)) {
                                salir = true;
                                ganador = "rombo";
                            } else if (contpicas == 0 || (contpicas <= conttrebol && contpicas <= contrombo && contpicas <= contcora && cont == 44)) {
                                salir = true;
                                ganador = "pica";
                            }

                            if (!salir) {
                                System.out.println("Pulse una tecla para mostrar la siguiente carta...");
                                s.next();
                            }
                        }

                    } while (!salir && cont < 44);

                    if (cont == 44 && (contcora==conttrebol || contcora==contrombo || contcora==contpicas || conttrebol==contrombo || conttrebol==contpicas || contrombo==contpicas)) {
                        System.out.println("Ha habido un empate por lo tanto se le devolvera los creditos");
                    }else if (paloelegido.equals(ganador)){
                        System.out.println("El palo ganador a sido " + ganador);
                        System.out.println("Enhorabuena a ganado !!!");
                        totalcreditos = totalcreditos + creditos;
                        System.out.println("Ahora tiene un total de " + totalcreditos + " creditos");
                    
                    } else {
                        System.out.println("El palo ganador a sido " +ganador);
                        System.out.println("Lo siento, a perido " + creditos + " creditos");
                        totalcreditos = totalcreditos - creditos;
                        System.out.println("Le queda un total de " + totalcreditos + " creditos");
                    }

                    if (totalcreditos == 0) {
                        System.out.println("Lo siento usted se ha quedado sin creditos vuelva otro dia");
                        bandera = false;
                    }

                    break;

                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("OPERACION NO VALIDA");

            }

        } while (bandera);

    }
}
