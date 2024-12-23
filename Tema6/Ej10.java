package Tema6;

/*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter con el que se pinta cada línea se elige de forma aleatoria
entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
aleatoria entre 1 y 40 caracteres.*/
public class Ej10 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int largo = (int) (Math.random() * 40) + 1;
            int aleatorio = (int) (Math.random() * 6);
            
            for (int j = 0; j < largo; j++) {

                switch (aleatorio) {
                    case 1 -> { System.out.print("*");}
                    case 2 -> {System.out.print("-");}
                    case 3 -> {System.out.print("=");}
                    case 4 -> {System.out.print(".");}
                    case 5 -> {System.out.print("@");}
                    default ->
                        System.out.print("|");      
                }

            }
            
            System.out.println(" ");
        }

    }

}
