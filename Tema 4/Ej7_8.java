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
 
	/* 7. Realiza un programa que calcule la media de tres notas.
	8. Amplía el programa anterior para que diga la nota del boletín (insuficiente,
	suficiente, bien, notable o sobresaliente).*/


import java.util.Scanner;

public class Ej7_8 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Pido al usuario que introduzca las notas de sus ultimos 3 examenes y lo almaceno en una variable double					
		
		System.out.println("Este es un programa calcula la nota media de tus examenes");
		System.out.println("Introduzca la nota de su primer examen");		
		double nota1 = s.nextDouble();
		
		System.out.println("Introduzca la nota de su segundo examen");		
		double nota2 = s.nextDouble();
		
		System.out.println("Introduzca la nota de su tercer examen");		
		double nota3 = s.nextDouble();
		
		//Calculo la nota media y la almaceno en una variable double
		
		double media = (nota1 + nota2 + nota3)/3;
		
		//condicional que evalua la media que tiene en los 3 examenes y muestra por pantalla su resultado numerico y en funcion de su valor
				
		if ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10) || (nota3 < 0 || nota3 > 10)){
				System.out.print("Error");
			
			} else if (media < 5) {
				System.out.printf("Su nota media es de %.2f ",media );
				System.out.println("la media es insuficiente");
				
			} else if (media < 6) {
				System.out.printf("Su nota media es de %.2f ",media );
				System.out.println("la media es suficiente");
				
			} else if (media < 7) {
				System.out.printf("Su nota media es de %.2f ",media );
				System.out.println("la media es un bien");
				
			} else if (media < 9) {
				System.out.printf("Su nota media es de %.2f ",media );
				System.out.println("la media es notable");
				
		} else {
			System.out.printf("Su nota media es de %.2f ",media );
			System.out.println("la media es sobresaliente");
		}
	}
}

