package tema5;

import java.util.Scanner;

public class PruebaExamen {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre");
        String nombre = s.nextLine();
        boolean salir=false;
        int num1=0;
        int num2=0;
        int total=0;
        int resultado=0;
        int operacion=0;
        
        do {    //Bucle que nos permite realizar todas las operaciones necesarias hasta que queramos salir
                
            System.out.println("-------MENU CALCULADORA--------");  //Menu del switch
            System.out.println("1.Multiplicacion\n2.Division\n3.Modulo\n4.Salir");
            int op= s.nextInt();
        
            switch (op) {   //Switch con las diferentes opciones que tiene nuestro menu
                case 1 -> {     
                    
                    System.out.println("--------MULTIPLICACION----------"); //calculo multiplicacion
                    
                    do {                        
                        System.out.println("Introduzca el primer valor de la multiplicacion");
                        num1=s.nextInt();
                        System.out.println("Introduzca el segundo valor de la multiplicacion");
                        num2= s.nextInt();
                    } while (num1<=-15 || num2<=-15);
                    
                    for (int i = 0; i < num2; i++) {
                        
                        total=num1+total;
                        
                    }
                    System.out.println("---------RESULTADO-----------");
                    System.out.println(num1 + " x " + num2 + " = " + total);
                    
                    resultado=resultado+total;
                    operacion=operacion+1;
                    
                }  
                case 2 -> {
                    
                    System.out.println("--------DIVISION----------");   //calculo division
                    
                    do {                        
                        System.out.println("Introduzca el primer valor de la division");
                        num1=s.nextInt();
                        System.out.println("Introduzca el segundo valor de la division");
                        num2= s.nextInt();
                    } while (num1<=-15 || num2<=-15 || num2<1 || num1<1);
                    
                    int cont=0;
                    total=num1;
                    
                    while (total>=num2) {                        
                        
                        total=total-num2;
                        cont=cont+1;
                        
                    }
                    
                    System.out.println("---------RESULTADO-----------");    
                    System.out.println(num1 + " / " + num2 + " = " + cont);
                    
                    resultado=resultado+cont;
                    operacion=operacion+1;
                    
                }
                case 3 -> {
                
                    System.out.println("--------MODULO----------");     //calculo modulo
                    
                    do {                        
                        System.out.println("Introduzca el primer valor del modulo");
                        num1=s.nextInt();
                        System.out.println("Introduzca el segundo valor del modulo");
                        num2= s.nextInt();
                    } while (num1<=-15 || num2<=-15);
                    
                    int cont=0;
                    total=num1;
                    
                    while (total>=num2) {                        
                        
                        total=total-num2;
                        cont=cont+1;
                        
                    }
                    
                    System.out.println("---------RESULTADO-----------");
                    System.out.println(num1 + " % " + num2 + " = " + total);
                    
                    resultado=resultado+total;
                    operacion=operacion+1;
                    
                }
                case 4 -> {salir=true;}     //condicion para salir del menu
                default -> {
                    System.out.println("Operacion Introducida no valida vuelva a introducirla");    //Default en caso de no introducir un valor correcto
                }
            }
            
        } while (!salir);
        
        System.out.println("Hola " + nombre + " el resultado de las medias de todas las operaciones es " + (double) (resultado/operacion));     //Resultado del programa
        
        
    }   //FIN PROGRAMA

}
