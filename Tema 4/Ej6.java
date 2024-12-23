/*
 * Ej6.java
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

	/*Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s2*/

import java.util.Scanner;

public class Ej6 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Pido al usuario que introduzca la altura desde la que cae un objeto y lo almaceno en una variable double			
		
		System.out.println("Este programa calcula el tiempo que tardara en caer un objeto desde una altura");
		System.out.println("Introduce la altura desde la que caera el objeto");
		double h = s.nextDouble();
		
		//condicional que evalua la altura ya que la altura no puede <= 0 y calcula el resultado para mostrarlo en pantalla
		
		if (h <= 0) {
				System.out.println("Error");
			
			} else
				System.out.printf("Tardara en caer el objeto %.3f segundos",  Math.sqrt(2*h/9.81));
		
	}
}

