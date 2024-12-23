/*
 * Ej13.java
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

	/*Realiza un programa que calcule la nota que hace falta sacar en el segundo
	examen de la asignatura Programación para obtener la media deseada. Hay
	que tener en cuenta que la nota del primer examen cuenta el 40% y la del
	segundo examen un 60%.
	*/

import java.util.Scanner;

public class Ej13 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//introduzco una descripcion del programa y pido al usuario la primera nota y la nota finla que desea sacar y los agrego a una variable double
		
		System.out.println("Este es un programa que calcula la nota que hace falta sacar en el segundo examen de programacion para obtener la media deseada");
		System.out.println("Introduzca la nota del primer examen");
		double nota1 = s.nextDouble();
		System.out.println("Introduzca la nota que desees tener finalmente");
		double notafinal = s.nextDouble();
		
		//calculo la segunda nota y lo muestro por pantalla
		
		double nota2 = (notafinal - ( nota1 * 0.4 ))/0.6 ;
		System.out.printf("la nota que necesitas sacar en el segundo examen es un %.2f",nota2);
		
		
	}	//Fin de programa
}

