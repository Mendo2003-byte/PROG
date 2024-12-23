package tema5;

/*Realiza un programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como
una cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario
introduce los datos correctamente y que el segundo día es posterior al primero.
A continuación se muestra un ejemplo:*/
import java.util.Scanner;

public class Ej30 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean salir = true;

        while (salir) {

            System.out.println("MENU:\n1.Lunes\n2.Martes\n3.Miercoles\n4.Jueves\n5.Viernes\n6.Sabado\n7.Domingo");
            System.out.println("Por favor, introduzca la primera hora");
            System.out.print("Dia: ");
            String dia = s.next().toLowerCase();
            System.out.print("Hora: ");
            int hora = s.nextInt();
            System.out.println("Por favor, introduzca la segunda hora");
            System.out.print("Dia: ");
            String dia2 = s.next().toLowerCase();
            System.out.print("Hora: ");
            int hora2 = s.nextInt();
            int dia1_total;
            int dia2_total;
            int total;

            dia1_total = switch (dia) {
                case "lunes", "1" ->
                    0 + hora;
                case "martes", "2" ->
                    24 + hora;
                case "miercoles", "3" ->
                    48 + hora;
                case "jueves", "4" ->
                    72 + hora;
                case "viernes", "5" ->
                    96 + hora;
                case "sabado", "6" ->
                    120 + hora;
                case "domingo", "7" ->
                    144 + hora;
                default ->
                    0;
            };

            dia2_total = switch (dia2) {
                case "lunes", "1" ->
                    0 + hora2;
                case "martes", "2" ->
                    24 + hora2;
                case "miercoles", "3" ->
                    48 + hora2;
                case "jueves", "4" ->
                    72 + hora2;
                case "viernes", "5" ->
                    96 + hora2;
                case "sabado", "6" ->
                    120 + hora2;
                case "domingo", "7" ->
                    144 + hora2;
                default ->
                    0;
            };

            if (((hora < 0 || hora >= 24) || (hora2 < 0 || hora2 >= 24)) || (dia2_total< dia1_total) || (dia2_total == 0 || dia1_total ==0)) {
                System.out.println("LOS DATOS INTRODUCIDOS SON ERRONEOS");
                
            } else {
                total = dia2_total-dia1_total;
                System.out.println("El total de horas que faltan desde el dia " + dia + " hora " + hora + " al dia " + dia2 + " hora " + hora2 + " son " + total + " horas");
                salir= false;

            }
        }

    }//FIN PROGRAMA

}
