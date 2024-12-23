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

 // importo la herrmienta escaner

import java.util.Scanner;

public class Ej5 {
	
	public static void main (String[] args) {
		
		//Escribe un programa que calcule el área de un rectángulo.
		
		//llamo a la herramienta escaner y le agrego una variable
		
		Scanner s = new Scanner(System.in);
		
		//introduzco una descripcion del programa
		
		System.out.println("Este es un programa que calcula el area de un rectangulo");
		
		// pido al usuario la base y la altura y los agrego a una variable double
		
		System.out.println("Introduzca la base del rectangulo: ");
		double base = s.nextDouble();
		System.out.println("Introduzca la altura del rectangulo: ");
		double altura = s.nextDouble();
		
		//calculo el area y lo muestro por pantalla
		
		double area = base * altura;
		System.out.print("el area del rectangulo es igual a: " + area);
		
	}	// Fin de programa
}

