package Tema7;

/*Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto,
si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
personas como máximo e intente de nuevo”. Para el grupo que llega,
se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
grupo es de dos personas, se podrá colocar donde haya una o dos personas.
Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
funcionamiento del programa se ilustra a continuación:*/
import java.util.Scanner;

public class Ej15 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] mesa = new int[10];
        int personas = 0;
        boolean salir = false;
        boolean silla;

        for (int i = 0; i < mesa.length; i++) { // Genera los numero aleatorio de sitios en las mesas
            mesa[i] = (int) (Math.random()*5);
        }

        do {    //Bucle que se ejecuta siempre que no se introduzca -1 para salir
            System.out.println("Nº Mesa  1 2 3 4 5 6 7 8 9 10");
            System.out.print("Nº Silla ");
            for (int i : mesa) {    //foreach que muestra por pantalla el sitio en las mesas
                System.out.print(i + " ");
            }
            System.out.println("");
            do {    //Bucle que se ejecuta siempre que haya no se introduzca bien el numero de personas o -1 para salir

                System.out.println("¿Cuantos son?(Introduzca -1 para salir del programa)");
                personas = s.nextInt();

                if (personas == -1) {   //Condicion de salida
                    salir = true;
                }

            } while ((personas > 4 || personas < 1) && !salir);

            if (!salir) {   //No se introduzco -1 para salir
                silla = false;
                for (int i = 0; i < mesa.length && !silla; i++) {   //For que introduce el numero de personas en las mesas de 0
                    if (mesa[i] == 0) {
                        mesa[i] = personas;
                        silla = true;
                    }

                }
                if (!silla) {
                    for (int i = 0; i < mesa.length && !silla; i++) { //For que introduce el numero de personas cuando ya no hay mas mesas de 0
                        if (mesa[i] + personas <= 4) {
                            System.out.println("Tendra que compartir mesa sientese en la mesa" + (i+1));
                            mesa[i] = mesa[i] + personas;
                            silla = true;
                        }
                    }
                }
                
                if (!silla){    //Cuando ya no hay mas sitio para ese grupo de personas
                    System.out.println("Lo siento no hay sitio disponible para un grupo tan grande");
                }
                
            }

        } while (!salir);

    }

}
