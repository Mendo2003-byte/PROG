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
 
		/*Escribe un programa que calcule el volumen de un cono según la fórmula V =(1/3πr^2)h
		*/

import java.util.Scanner;

public class Ej9 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//introduzco una descripcion del programa y pido al usuario el radio y la altura y los agrego a una variable double
		
		System.out.println("Este es un programa que calcula el volumen de un cono");
		System.out.println("Introduzca el radio del cono: ");
		double radio = s.nextDouble();
		System.out.println("Introduzca la altura del cono: ");
		double altura = s.nextDouble();
		
		//calculo el volumen del cono y lo muestro por pantalla
		
		double volumen = (Math.PI * Math.pow (radio,2) * altura) / 3;
		System.out.println("el volumen del cono es: " + volumen);
		
	}	// Fin de programa
}

