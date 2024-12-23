/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema8Funciones;

/**
 *
 * @author Usuario
 */
public class Funcion1 {
    
    public static String esPar (int num) {
        
        if (num%2==0){
            return "Es par";
        } else {
            return "Es impar";
        }
        
    }
    
    public static boolean even (int num) {
        
        if (num%2==0){
            return true;
        } else {
            return false;
        }
        
    }
    
    public static void mensaje (String palabra){
    
        System.out.println("Hola mundo " + palabra);
    
    }
    
}
