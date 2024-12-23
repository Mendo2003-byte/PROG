/*
 * Ej1.java
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
 
 		/*Realiza un programa que pida dos números y que luego muestre el resultado
		de su multiplicación.
		*/
		
 // importo la herrmienta escaner
 
import java.util.Scanner;

public class Ej1 {
	
	public static void main (String[] args) {


		
		//llamo a la herramienta escaner y le agrego una variable
		
		Scanner s = new Scanner(System.in);
		
		//introduzco una descripcion del programa y lo que se debe introducir

		System.out.println("Este programa se va a utilizar para multiplicar dos valores introducidos");
		
		// pido al usuario los valores y los agrego a una variable double

		
		System.out.println("introduzca el primer valor: ");
		double valor1 = s.nextDouble();
		System.out.println("introduzca el segundo valor: ");
		double valor2 = s.nextDouble();
		
		//calculo el resultado de la multiplicacion y lo muestro por pantalla
		
		double resultado = valor1 * valor2;
		System.out.println("el resultado de la multiplicacion es: " + resultado);
		
	}	// Fin Programa
}

