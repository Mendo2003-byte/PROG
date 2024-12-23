package Tema8Funciones;

public class Funcion1_14 {

    public static void menu() {

        System.out.println("----------MENU-----------");
        System.out.println("1.CAPICUA");
        System.out.println("2.PRIMO");
        System.out.println("3.SIGUIENTE PRIMO");
        System.out.println("4.POTENCIA");
        System.out.println("5.DIGITOS");
        System.out.println("6.VOLTEA");
        System.out.println("7.POSICION DEL DIGITO");
        System.out.println("8.QUITA POR DETRAS");
        System.out.println("9.QUITA POR DELANTE");
        System.out.println("10.QUITA POR DELANTE");
        System.out.println("11.PEGA POR DETRAS");
        System.out.println("12.PEGA POR DELANTE");
        System.out.println("13.TROZO DE NUMERO");
        System.out.println("14.JUNTA NUMEROS");
        System.out.println("15.SALIR");

    }

    public static boolean esCapicua(int num) {

        int num1 = num;
        int cont = 0;
        int mod;
        int result = 0;

        while (num1 > 0) {
            num1 = num1 / 10;
            cont = cont + 1;
        }

        num1 = num;

        while (cont > 0) {
            mod = num1 % 10;
            num1 = num1 / 10;
            result = result + (int) (mod * Math.pow(10, cont - 1));
            cont = cont - 1;

        }
        return result == num;
    }

    public static boolean esPrimo(int num) {

        int div = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                div += 1;
            }
        }

        return div <= 2;

    }

    public static int siguientePrimo(int num1) {

        boolean bandera = true;
        int total = num1;

        while (num1 <= total && bandera) {

            total = total + 1;
            int div = 0;
            for (int i = 1; i <= total; i++) {
                if (total % i == 0) {
                    div += 1;
                }
            }

            if (div == 2) {
                bandera = false;

            }
        }
        return total;
    }

    public static int potencia(int num, int num2) {

        return (int) Math.pow(num, num2);
    }

    public static int digitos(int num2) {
        
        int cont = 0;

        while (num2 > 0) {
            num2 = num2 / 10;
            cont = cont + 1;
        }

        return cont;

    }

    public static int voltea(int num) {

        int num1 = num;
        int cont = 0;
        int mod;
        int result = 0;

        while (num1 > 0) {
            num1 = num1 / 10;
            cont = cont + 1;
        }

        num1 = num;

        while (cont > 0) {
            mod = num1 % 10;
            num1 = num1 / 10;
            result = result + (int) (mod * Math.pow(10, cont - 1));
            cont = cont - 1;

        }
        return result;

    }

    public static int digitoN(int num, int num2) {

        int num1 = num;
        int cont = 0;
        int contdig = 0;
        int dig = 0;
        boolean salir = true;

        while (num1 > 0) {
            num1 = num1 / 10;
            cont = cont + 1;
        }

        while (cont > 0 && salir) {

            dig = (int) (num / Math.pow(10, cont - 1));
            num = (int) (num % Math.pow(10, cont - 1));
            cont = cont - 1;
            contdig = contdig + 1;

            if ((contdig - 1) == num2) {
                salir = false;
            }

        }

        if ((contdig - 1) == num2) {
            return dig;
        } else {
            return -1;
        }
    }

    public static int posiciondigito(int num, int num2) {

        System.out.println("-----------POSICION DIGITO-----------");

        int cont = 0;
        int mod = 0;
        boolean salir = true;

        while (num > 0 && salir) {

            mod = num % 10;
            num = num / 10;
            cont = cont + 1;

            if (num2 == mod) {
                salir = false;
            }

        }

        if (num2 == mod) {
            return cont;
        } else {
            return -1;
        }

    }

    public static int quitadetras(int num, int num2) {

        System.out.println("----------QUITA DETRAS---------");

        int result = (int) (num / Math.pow(10, num2));

        return result;
    }

    public static int quitadelante(int num, int num2) {

        System.out.println("----------QUITA DELANTE---------");

        int result = (int) (num % Math.pow(10, num2));

        return result;
    }

    public static int añadedetras(int num, int num2) {

        System.out.println("-----------AÑADE DETRAS------------");

        int num1 = num;
        int cont = 0;
        int result = 0;
        int mod;

        while (num1 > 0) {
            num1 = num1 / 10;
            cont = cont + 1;
        }

        for (int i = 0; i <= cont; i++) {
            if (i == 0) {
                result = (int) (result + (num2 * Math.pow(10, i)));

            } else {
                mod = num % 10;
                num = num / 10;
                result = (int) (result + (mod * Math.pow(10, i)));

            }

        }

        return result;

    }
    
    public static int añadedeltante (int num,int num2){
    
        int num1 = num;
        int cont = 0;
        int result;

        while (num1 > 0) {
            num1 = num1 / 10;
            cont = cont + 1;
        }
        
        result= (int) (num+num2*Math.pow(10, cont));
        return result;
    }
    
    public static int trozodenumero (int num,int num2,int num3) {
    
        int num1 = num;
        int cont = 0;

        while (num1 > 0) {
            num1 = num1 / 10;
            cont++;
        }
        
        int cont2=cont;
        
        for (int i = 0; i < cont; i++) {
            if (i<=num2) {
                num=(int) (num% Math.pow(10, cont2-1));
                cont2--;
            } else if (i>=num3){
                num=num/10;
            }
            
        }
        
        return num;
    }
    
    public  static int peganumero (int num,int num2){
        
        int num1 = num;
        int num22 = num2;
        int cont = 0;
        int total = 0;
        int mod;
        
        while (num22 > 0) {
            num22 = num22 / 10;
            cont++;
        }  
        
        while (num1 > 0) {

            mod = num1%10;
            total=(int) (total+mod*Math.pow(10, cont));
            num1 = num1 / 10;
            cont++;
            
            
        }
        
        return total+num2;
        
    }

}
