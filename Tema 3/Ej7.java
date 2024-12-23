/*
 * Ej7.java
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
 
		/*Escribe un programa que calcule el total de una factura a partir de la base
		imponible.
		*/
		
 // importo la herrmienta escaner

import java.util.Scanner;

public class Ej7 {
	
	public static void main (String[] args) {
		

		
		//llamo a la herramienta escaner y le agrego una variable
		
		Scanner s = new Scanner(System.in);
		
		//introduzco una descripcion del programa
		
		System.out.println("Este es un programa que calcula la factura de un ordenador a partir de la base imponible");
		
		// pido al usuario la base imponible y lo agrego a una variable double
		
		System.out.println("introduzca la base imponible: ");
		double bi = s.nextDouble();
		
		//calculo el precio final de la factura y lo muestro por pantalla
		
		double fact = bi + (bi * 0.16);
		System.out.print("El total de la factura es de " + fact + " euros"); 
		
	}	// Fin de programa
}

