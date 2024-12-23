/*
 * Ej9.java
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

	/*Realiza un programa que resuelva una ecuación de segundo grado (del tipo
	ax2 + bx + c = 0).*/
	
	// EJ 9 tema 4
	// Extra 1,2 tema 5

import java.util.Scanner;

public class Ej9 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Este programa resuelve una ecuacion de segundo grado");
		System.out.println("Introduce el valor de a");
		double a = s.nextDouble();
		
		System.out.println("Introduce el valor de b");
		double b = s.nextDouble();
		
		System.out.println("Introduce el valor de c");
		double c = s.nextDouble();
		double x = 0;
		double raiz1 = Math.pow(b,2)-4*a*c;
		double raiz2 = (-c/a);
		
		if ((a == 0) || (raiz1 < 0)|| (raiz2 < 0)){
			System.out.print("Error");

			} else if (b == 0 && c == 0){
					System.out.println("la solucion de la ecuacion es 0");
			
			} else if (c == 0){
					x =  -b / a;
					System.out.printf("la solucion de la ecuacion es 0 y %.2f",x);
					
			} else if (b == 0){	
					x = -Math.sqrt(raiz2);
					System.out.printf("la solucion de la ecuacion es %.2f\n",x);
					
					x = Math.sqrt(raiz2);
					System.out.printf("la solucion de la ecuacion es %.2f", x);
	
				} else {
					x = (b * -1 + Math.sqrt(raiz1))/2*a;
					System.out.printf("la solucion de la ecuacion es %.2f\n",x );
					
					x = (b * -1 - Math.sqrt(raiz1))/2*a;
					System.out.printf("la otra solucion de la ecuacion es %.2f",x );
			
		}
		
	}	// Fin programa
}

