/*
 * Ej5.java
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

	/*Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+
	b = 0)*/

import java.util.Scanner;

public class Ej5 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Pido al usuario que introduzca las variables a y b para resolver una ecuacion de primer grado y lo almaceno en una variable int		
		
		System.out.println("este programa resuelve una ecuacion de primer grado");
		System.out.println("introduzca el valor de a");
		int a = s.nextInt();
		System.out.println("introduzca el valor de b");
		int b = s.nextInt();

		//cambio las variables int a double para que se puedan dividir y den un numero decimal en x y lo muestro en pantalla solo con dos decimales

		if (a == 0) {
			System.out.print("Error");
			
			} else {
				double x = (double)(b*-1)/(double) a  ;
				System.out.printf("el resultado de x es igual a %.2f", x);	
				
				}

	
		
	}
}

