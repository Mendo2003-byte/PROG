package Tema6;

/*Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
ha perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.*/

public class Ej16 {

    public static void main(String[] args) {

        boolean salir = false;
       
        while (!salir) {
            
                int figura1 = 0;
                int figura2 = 0;
                int figura3 = 0;
            
            for (int i = 0; i < 3; i++) {

                int figura = (int) (Math.random()*5);

                switch (figura) {
                    case 0 -> {System.out.print("corazon ");}
                    case 1 -> {System.out.print("Diamante ");}
                    case 2 -> {System.out.print("herradura ");}
                    case 3 -> {System.out.print("campana ");}
                    case 4 -> {System.out.print("limon ");}      
                }

                switch (i) {
                    case 0 -> figura1= figura;
                    case 1 -> figura2 = figura;
                    default -> figura3 = figura;
                }

            }

            System.out.println("");
            
            if (figura1 != figura2 && figura2 != figura3 && figura1 !=figura3) {
                System.out.println("Lo siento has perdido");
                salir = true;
                
            } else if (figura1 == figura2 && figura2 == figura3 && figura1 == figura3 ){
                System.out.println("Enhorabuena, ha ganado 10 monedas");
                salir = true;
                
            } else {
                System.out.println("Bien, ha recuperado su moneda");
                salir = true;
                
            }
            
        }

    }   //FIN PROGRAMA

}
