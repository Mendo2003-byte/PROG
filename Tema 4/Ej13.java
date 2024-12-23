/*
 * Ej13.java
 * 
 * Copyright 2024 Usuario <Usuario@DESKTOP-FU37H5C>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
	/*Escribe un programa que ordene tres números enteros introducidos por
	teclado*/

import java.util.Scanner;

public class Ej13 {
	
	public static void main (String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	System.out.println("Este es un programa que compara los tres numeros introducido por teclado y los ordena");	
	System.out.println("Introduzca el primer numero");
	int num1 = s.nextInt();
	
	System.out.println("Introduzca el segundo numero");
	int num2 = s.nextInt();
		
	System.out.println("Introduzca el tercer numero");
	int num3 = s.nextInt();	
		
	if (num1 <= num2 && num1 <= num3 && num2 <= num3){
		System.out.print("El orden es correcto es " + num1 + " " + num2  + " " + num3);
			
		} else if (num1 <= num3 && num1 <= num2 && num3 <= num2) {
			System.out.print("El orden es correcto es " + num1 + " " + num3 + " " + num2);			
		
		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1){
			System.out.print("El orden es correcto es " + num2 + " " + num3 + " " + num1);
				
		} else if (num2 <= num1 && num2 <= num3 && num3 >= num1){
			System.out.print("El orden es correcto es " + num2 + " " + num1 + " " +num3);
					
		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1){
			System.out.print("El orden es correcto es " + num3 + " " + num2 + " " + num1);
					
		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2){
			System.out.print("El orden es correcto es " + num3 + " " + num1 + " " + num2);
				
		} 
		
	}	//Fin programa
}

