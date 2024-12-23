/*
 * Ej11.java
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
 
		// Realiza un conversor de Kb a Mb.

import java.util.Scanner;

public class Ej11 {
	
	public static void main (String[] args) {		
		
		Scanner s = new Scanner(System.in);
		
		//introduzco una descripcion del programa y pido al usuario la cantidad de Kilobyte y lo agrego a una variable double
		
		System.out.println("Este programa es un conversor de Kilobyte a Megabyte");
		System.out.println("Introduzca la cantidad de Kilobyte que desee conversar");
		int kb = s.nextInt();
		
		//calculo el resultado de la conversion y lo muestro por pantalla
		
		int mb = kb / 10024 ;
		System.out.print(kb + " Kilobyte es un total de " + mb + " Megabyte");
		
	}	// Fin de programa
}

