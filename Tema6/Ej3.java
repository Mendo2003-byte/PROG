package Tema6;

/*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*/

public class Ej3 {

    public static void main(String[] args) {

        int palo = (int) (Math.random() * 4);
        int valor = (int) (Math.random() * 11) + 1;

        if (valor >=2 && valor <=7) {
            System.out.print(valor);
            
        } else {
          
            switch (valor) {
                case 8 -> System.out.print("Sota");         
                case 9 -> System.out.print("Caballo");  
                case 10 -> System.out.print("Rey"); 
                default -> System.out.print("As");
            }
        }
        
        switch (palo) {
            case 1 -> System.out.println(" Espada");
            case 2 -> System.out.println(" Basto");
            case 3 -> System.out.println(" Moneda");
            default -> System.out.println(" Copa");
        }
        
    }

}
