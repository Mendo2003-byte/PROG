/*
 * Ej2.java
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
 
	/*Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
			convertir debe ser introducida por teclado.
			*/
			
 // importo la herrmienta escaner

import java.util.Scanner;

public class Ej2 {
	
	public static void main (String[] args) {
		
		
		
		//llamo a la herramienta escaner y le agrego una variable
		
		Scanner s = new Scanner(System.in);
		
		//introduzco una descripcion del programa
		
		System.out.println("Este es un conversor de euros a pesetas");
		
		// pido al usuario la cantidad de euros y lo agrego a una variable double
		
		System.out.println("Introduzca la cantidad de euros que desee conversar:");
		double euro = s.nextDouble();
		
		//calculo el resultado de la conversion y lo muestro por pantalla
		
		double pesetas = Math.round(euro * 166.387);
		System.out.print(euro + " euro es un total de " + pesetas + " pesetas");
		
	}	// Fin Programa
}

