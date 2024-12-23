package Tema6;

/*Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.*/

public class Ej9 {

    public static void main(String[] args) {

        int aleatorio;
        int cont = 0;
        
        do {            
            aleatorio = (int) (Math.random()*101);
            cont+=1;
            
            if (aleatorio % 2 == 0) {
                System.out.println(aleatorio);
                
            } 
            
        } while (aleatorio != 24);
        
        System.out.println("La cantidad de digitos generados son " + cont);
        
        
    }

}
