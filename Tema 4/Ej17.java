/*
 * Ej17.java
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

	/*Escribe un programa que diga cuál es la última cifra de un número entero
	introducido por teclado.
	*/

import java.util.Scanner;

public class Ej17 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Este programa te indica cual es la ultima cifra del numeo entero que introduzcas");
		System.out.println("Introduzca un numero");
		
		int num = s.nextInt();
		int cf = num % 10;
		
		if (num < 0){
			System.out.println("la ultima cifra es " + -cf);
			
			} else {
				System.out.println("la ultima cifra es " + cf);		
				}
	
	}	//Fin programa
}

