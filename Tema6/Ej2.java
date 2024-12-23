package Tema6;

/*Realiza un programa que muestre al azar el nombre de una carta de la
baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
sería el 1). Para convertir un número en una cadena de caracteres podemos
usar String.valueOf(n).*/

public class Ej2 {

    public static void main(String[] args) {

        int palo = (int) (Math.random() * 4);
        int valor = (int) (Math.random() * 13) + 1;

        if (valor >=2 && valor <=10) {
            System.out.print(valor);
            
        } else {
          
            switch (valor) {
                case 1 -> System.out.print("A");         
                case 11 -> System.out.print("K");  
                case 12 -> System.out.print("Q"); 
                default -> System.out.print("K");
            }
        }
        
        switch (palo) {
            case 1 -> System.out.println(" Dimantes");
            case 2 -> System.out.println(" Treboles");
            case 3 -> System.out.println(" Corazones");
            default -> System.out.println(" Picas");
        }

    }

}
