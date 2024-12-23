package Tema6;

/*Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
sol, la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera.*/
public class Ej15 {

    public static void main(String[] args) {

        int melodia;
        int primer = 0;

        do {

            melodia = (int) (Math.random() * 25) + 4;

        } while (melodia % 4 != 0);

        System.out.println(melodia);

        for (int i = 0; i < (melodia/4); i++) {
            
            for (int j = 0; j < 4; j++) {
                
                int nota = (int) (Math.random() * 7) + 1;

                if (i+j>0 && ((i+1)*(j+1)<melodia)) {
                    
                    switch (nota) {
                        case 1 -> System.out.print("do ");
                        case 2 -> System.out.print("re ");
                        case 3 -> System.out.print("mi ");
                        case 4 -> System.out.print("fa ");
                        case 5 -> System.out.print("sol ");
                        case 6 -> System.out.print("la ");
                        case 7 -> System.out.print("si ");
                    }
                    
                } else if (i+j==0 ){
                    primer = nota;
                    
                    switch (nota) {
                        case 1 -> System.out.print("do ");
                        case 2 -> System.out.print("re ");
                        case 3 -> System.out.print("mi ");
                        case 4 -> System.out.print("fa ");
                        case 5 -> System.out.print("sol ");
                        case 6 -> System.out.print("la ");
                        case 7 -> System.out.print("si ");
                    }
                    
                } else {
                
                    switch (primer) {
                        case 1 -> System.out.print("do |");
                        case 2 -> System.out.print("re |");
                        case 3 -> System.out.print("mi |");
                        case 4 -> System.out.print("fa |");
                        case 5 -> System.out.print("sol |");
                        case 6 -> System.out.print("la |");
                        case 7 -> System.out.print("si |");
                    }
                
                }
                  
                
            }
            
            System.out.print(" | ");

        }

    }//FIN PROGRAMA

}
