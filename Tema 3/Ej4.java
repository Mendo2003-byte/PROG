/*
 * Ej4.java
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
 
 		/*Escribe un programa que sume, reste, multiplique y divida dos números
		introducidos por teclado.
		*/
		
 // importo la herrmienta escaner

import java.util.Scanner;

public class Ej4 {
	
	public static void main (String[] args) {
		

		
		//llamo a la herramienta escaner y le agrego una variable
		
		Scanner s = new Scanner(System.in);
		
		//introduzco una descripcion del programa
		
		System.out.println("Este es un programa que calcula la suma, resta, multiplicacion y division de dos valores");
		
		// pido al usuario los valores y los agrego a una variable double
		
		System.out.println("Introduzca el primer valor: ");
		double valor1 = s.nextDouble();
		System.out.println("Introduzca el segundo valor: ");
		double valor2 = s.nextDouble();
		
		//calculo los resultado de las operaciones y lo muestro por pantalla
		
		double sum = valor1 + valor2;
		double rest = valor1 - valor2;
		double mult = valor1 * valor2;
		double div = valor1 / valor2;
		System.out.println("suma: " + sum + "\nresta: " + rest + "\ndivision: " + div + "\nmultiplicacion: " + mult);

		
	}	// Fin Programa
}

