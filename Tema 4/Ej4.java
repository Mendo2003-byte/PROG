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
	
	/* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
	las horas extras. Escribe un programa que calcule el salario semanal de un
	trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
	trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
	euros la hora.
	*/

import java.util.Scanner;

public class Ej4 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Pido al usuario que introduzca la cantidad de horas trabajadas en la semana y lo almaceno en una variable int		
		
		System.out.println("Este programa calcula tu salario semanal en funcion de las horas hechadas");
		System.out.println("Introduzca la cantidad de horas trabajadas en la semana");
		int hora = s.nextInt();
		
		//Condicional que evalua la cantidad de horas introducidas y en funcion de dichas horas se multiplicara por una base u otra y se mostrara
		//por pantalla el salario final

		
		if (hora < 0 || hora > 52){
		
			System.out.println("Error");
		
		} else if (hora <= 40){
					System.out.println("Su salario semanal es " + hora * 12 + " euros");
				
			} else
					System.out.println("Su salario semanal es " + (hora * 12 + (hora - 40) * 16) + " euros");
		
	}
}

