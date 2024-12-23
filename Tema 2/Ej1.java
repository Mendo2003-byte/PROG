/*
 * Ej1.java
 * 
 * Copyright 2024 miguel angel <miguel angel@DESKTOP-NQO1TN8>
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


public class Ej1 {
	
	public static void main (String[] args) {
		
		/*Escribe un programa en el que se declaren las variables enteras x e y. Asignales
		los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
		el valor de cada variable, la suma, la resta, la división y la multiplicación.
		*/
		
		//variables
		
		int e = 144 , x = 999; 
		int suma = x + e ;
		int resta = x - e ;
		int mult = x * e ;
		double div = (double) x / (double) e ;
		
		//salida por pantalla
		
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(mult);
		System.out.println(div);
		
	}
}

