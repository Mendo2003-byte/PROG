/*
 * Ej20.java
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


	/*Realiza un programa que diga si un número entero positivo introducido por
	teclado es capicúa. Se permiten números de hasta 5 cifras.*/

import java.util.Scanner;

public class Ej20 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Este prgrama te indica si el numero que has introducido por teclado es capicua o no, este numero no podra ser superior a 5 cifras");
		System.out.println("Introduzca un numero");
		int num = s.nextInt();
		
		if ((num/10 != 0 && num/100 != 0 && num/1000 != 0 && num/10000 != 0) && num/100000 != 0){
			System.out.println("El numero tiene mas de 5 cifras");
		
			} else if (num / 10 == 0){
				System.out.println("El numero es capicua");				
				
			} else if (num % 10 == num / 10){
				System.out.println("El numero es capicua");
			
			} else if (num % 10 == num / 100){
				System.out.println("El numero es capicua");
				
			} else if ((num % 10 == num / 1000) && ((num %100) /10 == (num /100) % 10)){
				System.out.println("El numero es capicua");	
			
			} else if ((num % 10 == num / 10000) && ((num %100) /10 == (num /1000) % 10)){
				System.out.println("El numero es capicua");
				
			} else {
				System.out.println("El numero no es capicua");
				
				}
			
	}	//Fin programa
}

