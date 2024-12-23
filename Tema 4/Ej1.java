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

	/*Escribe un programa que pida por teclado un día de la semana y que diga qué
	asignatura toca a primera hora ese día.
	*/

import java.util.Scanner;

public class Ej1 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Pido al usuario el dia y lo almaceno en una variable String
		
		System.out.println("Este programa indica que asignaruta tienes a primera el dia de la semana que introduzcas");
		System.out.println("introduce el dia de la semana todo en minusculas");
		String dia = s.next();
		
		//condicional switch que evalua el dia que hemos introducio y en funcion de esta muestra por pantalla la primera asignatura del dia
		
		switch (dia) {
			
			case "lunes":
			case "jueves":
			case "viernes":		
				System.out.println("Programacion");
				break;
				
			case "martes":
				System.out.println("Lenguaje de marca");
				break;
				
			case "miercoles":	
				System.out.print("IPEI");
				break;
				
			default:
				System.out.print("Debe de introducir un dia de la semana en el cual haya isntituto en minusculas");
				
			}
	}	//Fin programa
}

