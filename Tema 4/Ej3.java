/*
 * Ej3.java
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

	/*Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.*/


import java.util.Scanner;

public class Ej3 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Pido al usuario que introduzca un numero del menu referente a un dia de la semana y lo almaceno en una variable int
		
		System.out.println("Este programa indica que dia de la semana segun el numero que introduzcas");
		System.out.println("MENU:\n\nLunes:1\nMartes:2\nMiercoles:3\nJueves:4\nViernes:5\nSabado:6\nDomindo:7\n");
		
		System.out.println("introduce el numero del dia de la semana");
		int dia = s.nextInt();
		
		//condicional switch que evalua segun el numero introducido y en funcion de este muestra por pantalla el dia de la semana que hace referencia a ese numero
		
		switch (dia) {
			
			case 1:

				System.out.print("Lunes");
				break;
				
			case 2:
				System.out.print("Martes");
				break;
				
			case 3:	
				System.out.print("Miercoles");
				break;
				
			case 4:	
				System.out.print("Jueves");
				break;				
				
			case 5:	
				System.out.print("Viernes");
				break;
								
			case 6:	
				System.out.print("Sabado");
				break;

			case 7:	
				System.out.print("Domingo");
				break;
				
			default:
				System.out.print("Debe de introducir uno de los valores indicados en el menu");
				
			}
	}	//Fin programa
}

