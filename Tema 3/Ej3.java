/*
 * Ej3.java
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
 
	 /* Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
		convertir debe ser introducida por teclado.
	 */
	 
 // importo la herrmienta escaner
 
 import java.util.Scanner;


public class Ej3 {
	
	public static void main (String[] args) {
		
		
		
		//llamo a la herramienta escaner y le agrego una variable
		
		Scanner s = new Scanner(System.in);
		
		//introduzco una descripcion del programa
		
		System.out.println("Este es un conversor de pesetas a euros");
		
		// pido al usuario la cantidad de pesetas y lo agrego a una variable double

		System.out.println("Introduzca la cantidad de pesetas que desee conversar:");
		double pesetas = s.nextDouble();
		
		//calculo el resultado de la conversion y lo muestro por pantalla
		
		double euros = Math.round (pesetas / 166.387);
		System.out.print(pesetas + " pesetas es un total de " + euros + " euros");
		
		
	}   // Fin Programa
}

