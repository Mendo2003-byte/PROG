/*
 * Ej19.java
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

	/*Realiza un programa que nos diga cuántos dígitos tiene un número entero que
	puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.*/

import java.util.Scanner;

public class Ej19 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Este programa nos dira la cantidad de digitos que tiene el nuemro entero que introduzcas, el numero entero no puede tener mas de 5 digitos");
		System.out.println("Introduzca un numero entero");
		int num = s.nextInt();
		
		if (num/10 == 0){
			System.out.println("El numero tiene 1 cifras");
			
			} else if (num/100 == 0){
				System.out.println("El numero tiene 2 cifras");
			
			} else if (num/1000 == 0){
				System.out.println("El numero tiene 3 cifras");
			
			} else if (num/10000 == 0){
				System.out.println("El numero tiene 4 cifras");
			
			} else if (num/100000 == 0){
				System.out.println("El numero tiene 5 cifras");
			
			} else {
				System.out.println("El numero introducido tiene mas de 5 cifras");
				
				}
		
	}	//Fin programa
}

