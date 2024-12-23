/*
 * Ej18.java
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
 
	/*Escribe un programa que diga cuál es la primera cifra de un número entero
	introducido por teclado. Se permiten números de hasta 5 cifras.
	*/

import java.util.Scanner;

public class Ej18 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Este programa te indica cual es la primera cifra del numeo entero que introduzcas, como limite el numero no puede contener mas de 5 cifras");
		System.out.println("Introduzca un numero");
		
		int num = s.nextInt();
		int cp = 0;
		
		if (num < 0) {
			num = -num;
			
			} 
			
		if (num <= 9){	
			cp = num / 1; 
			System.out.println(cp);
			
			} else if (num <= 99) {
				cp = num / 10; 
				System.out.println("La primera cifra es " + cp);
								
			} else if (num <=999) {
				cp = num /100;
				System.out.println("La primera cifra es " + cp);
				
			} else if (num <= 9999) {
				cp = num / 1000; 
				System.out.println("La primera cifra es " + cp);
				
			} else if (num <= 99999) {
				cp = num / 10000; 
				System.out.println("La primera cifra es " + cp);	
						
			} else {
				
				System.out.print("El numero introducido tiene mas de 5 cifras");
				}
		
	}	//Fin programa
}

