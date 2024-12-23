package Tema8Funciones;

public class Funcion20_28 {
    
        public static void menu() {

        System.out.println("----------MENU-----------");
        System.out.println("1.GENERA ARRAY");
        System.out.println("2.MINIMO ARRAY");
        System.out.println("3.MAXIMO ARRAY");
        System.out.println("4.MEDIA ARRAY");
        System.out.println("5.ESTA EN ARRAY");
        System.out.println("6.POSICION EN ARRAY");
        System.out.println("7.VOLTEA ARRAY");
        System.out.println("8.ROTA DERECHA");
        System.out.println("9.ROTA IZQUIERDA");
        System.out.println("10.SALIR");

    }
        
    public static int [] array (int num,int max, int min){
    
        int [] numero = new int [num];
        
        for (int i = 0; i < numero.length; i++) {
            
            numero[i]=(int) (Math.random()*(max-min+1))+ min;
            
        }
        
        return numero;
        
    }
    
    public static void minimoarray (int numero[],int max) {
        
        int minimo=max;
        
        for (int i = 0; i < numero.length; i++) {
            if (numero[i]<minimo) {
                minimo=numero[i];
            } 
        }
        
        System.out.println(minimo);
        
    }
    
    public static void maximoarray (int numero[],int min) {
        
        int maximo=min;
        
        for (int i = 0; i < numero.length; i++) {
            if (numero[i]>maximo) {
                maximo=numero[i];
            }
        }
        
        System.out.println(maximo);
        
    }
    
    public static void mediaarray (int numero[]) {
        
        double total=0;
        
        for (int i = 0; i < numero.length; i++) {
            total=total+numero[i];   
        }
        
        System.out.println(total/numero.length);
        
    }
    
    
    public static void numeroarray (int numero[],int num1) {
        
        boolean result=false;
        
        for (int i = 0; i < numero.length; i++) {
            if (numero[i]==num1) {
                result=true;
            } else {
                result=false;
            }
  
        }
        
        System.out.println(result);
        
    }
    
    public static void posicionarray (int numero[],int num1) {
        
        int posicion=0;
        
        for (int i = 0; i < numero.length; i++) {
            if (numero[i]==num1) {
                System.out.println(i);
            } else {
                posicion=-1;
            }
        }
        
        if (posicion==-1) {
            System.out.println("No se encontro el numero");
        }
        
    }
    
    public static void volteaarray (int numero[]) {
        
        int [] volteado = new int [numero.length];
        
        for (int i = numero.length-1; i >= 0; i--) {
            volteado[i]=numero[numero.length-i-1];
        }     
        
        for (int i : volteado) {
            System.out.println(i);
        }
    }
    
    public static void rotaderechaarray (int numero[],int num1) {
        
        int [] rotaderecha = new int [numero.length];
        
        for (int i = numero.length-1; i >= 0; i--) {

            if (i<=numero.length-1-num1) {
                
                rotaderecha[i+num1]=numero[i];
                
            } else {
                
                rotaderecha[num1-(numero.length-i)]=numero[i];
                
            }
            
        }     
        
        for (int i : rotaderecha) {
            System.out.println(i);
        }
    }
    
        public static void rotaizquierdaarray (int numero[],int num1) {
        
        int [] rotaizquierda = new int [numero.length];
        
        for (int i = 0; i < numero.length; i++) {

            if (i>numero.length-1-num1) {
                
                rotaizquierda[i]=numero[num1-(numero.length-i)];
                
            } else {
                rotaizquierda[i]=numero[i+num1];
                
            }
            
        }     
        
        for (int i : rotaizquierda) {
            System.out.println(i);
        }
    }    
    
}
