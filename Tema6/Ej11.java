package Tema6;

/*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.*/
public class Ej11 {

    public static void main(String[] args) {

        int sus = 0;
        int suf = 0;
        int bien = 0;
        int not = 0;
        int sob = 0;

        for (int i = 0; i < 20; i++) {

            int nota = (int) (Math.random() * 11);

            if (nota < 5) {
                sus += 1;
                System.out.println("suspenso");

            } else if (nota < 6) {
                suf += 1;
                System.out.println("suficiente");

            } else if (nota < 7) {
                bien += 1;
                System.out.println("bien");

            } else if (nota < 9) {
                not += 1;
                System.out.println("notable");

            } else {
                sob += 1;
                System.out.println("sobresaliente");

            }

        }

        System.out.println("numero de suspensos: " + sus);
        System.out.println("numero de suficiente: " + suf);
        System.out.println("numero de bien: " + bien);
        System.out.println("numero de notable: " + not);
        System.out.println("numero de sobresaliente: " + sob);

    }

}
