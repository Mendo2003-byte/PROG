package ProyectoFinal1;

import java.util.Scanner;

public class proyecto_final_Sfunciones {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //VARIABLES DEL PROGRAMA
        String[][] tablero = new String[11][5];
        int totalcreditos = 10;
        boolean bandera = true;
        String[] resultado = new String[2];
        // INICIO DEL JUEGO
        Proyecto_funcion.Bienvenida();

        do {    //WHILE HASTA QUE SE QUIERA SALIR DEL PROGRAMA Y NO SEGURI JUGANDO

            //MENU DEL PROGRAMA CON SUS OPERACIONES
            Proyecto_funcion.menu();
            int menu = s.nextInt();

            //SWITH CON CADA UNA DE LAS OPERACIONES
            switch (menu) {
                case 1:
                    //REGLAS DEL JUEGO
                    Proyecto_funcion.reglas();
                    break;
                case 2:
                    //REINICIO DE LOS VALORES
                    int[] palo = new int[44];
                    int[] salidos = new int[45];
                    boolean salir = false;
                    boolean repetido = true;
                    int[] contpalos = {10, 10, 10, 10};
                    int  pasoatras = 9;
                    int cont = 0;
                    resultado[0]=null;
                    
                    //CANTIDAD QUE SE DESEE APOSTAR
                    int creditos = Proyecto_funcion.pedirApuesta(s, totalcreditos);

                    //PALO AL QUE SE DESEA APOSTAR
                    String paloelegido = Proyecto_funcion.eligePalo(s);
                    s.nextLine();
                    //JUEGO
                    do {

                        //ASIGNACION DE VALORES AL TABLERO
                        cont=Proyecto_funcion.asignarTablero(tablero, contpalos, palo, salidos, repetido, cont);
                        // MOSTRAR TABLERO Y CONDICIONES DE SALIDA
                        Proyecto_funcion.muestraTablero(tablero);

                        //CONDICIONES DE SALIDAS O CONTINUAR
                        Proyecto_funcion.ganador(contpalos, cont, resultado);
                        if ("true".equals(resultado[0])) {
                            salir = true;
                        }

                        //SACAR LA SIGUIENTE CARTA
                        Proyecto_funcion.siguienteCarta(salir, s);

                        //REALIZANDO PASO ATRAS CUANDO SE AVANCE
                        if ((contpalos[0] < pasoatras && contpalos[1] < pasoatras && contpalos[2] < pasoatras && contpalos[3] < pasoatras) && !salir) {

                            //ASIGNA AL TABLERO LOS NUEVOS VALORES CON EL PASO HACIA ATRAS DEL PALO
                            cont = Proyecto_funcion.retrocederTablero(tablero, contpalos, palo, salidos, repetido, cont,pasoatras);
                            pasoatras--;
                            // MOSTRAR TABLERO POR SEGUNDA VEZ SI RETROCEDE EL PALO
                            Proyecto_funcion.muestraTablero(tablero);

                            //CONDICIONES DE SALIDAS O CONTINUAR
                            //BARAJAR POSIBILIDAD DE EMPATE Y QUE EL QUE ESTE MAS CECA DE LA META GANE
                            Proyecto_funcion.ganador(contpalos, cont, resultado);

                            if ("true".equals(resultado[0])) {
                                salir = true;
                            }

                            //SACAR LA SIGUIENTE CARTA
                            Proyecto_funcion.siguienteCarta(salir, s);
                        }

                    } while (!salir && cont < 44);

                    // GANAR, EMPATAR O PERDER
                    totalcreditos=Proyecto_funcion.ganadorJuego(cont, contpalos, paloelegido, resultado, creditos, totalcreditos);

                    //TERMINAR PROGRAMA CUANDO NO TENGA MAS CREDITOS
                    if (totalcreditos == 0) {
                        System.out.println("Lo siento usted se ha quedado sin creditos vuelva otro dia");
                        bandera = false;
                    }

                    break;

                case 3:
                    
                    //TERMINAR PROGRAMA
                    bandera = false;
                    break;
                default:
                    System.out.println("OPERACION NO VALIDA");
            }
        } while (bandera);

    }
}
