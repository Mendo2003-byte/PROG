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


public class Ej4 {
	
	public static void main (String[] args) {
		
		/*Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
		convertir deberá estar almacenada en una variable.
		*/
		
		/*
		 * Math.round es una funcion que se utiliza para redondear
		 * Math.floor es una funcion que se utiliza para redondear pero solo hacia abajo
		 * Math.ceil es una funcion que se utiliza para redondear pero solo hacia arriba
		 * System.out.printf("%.4f", numero) se utiliza para declarar el numero maximo de decimales que se quieran mostrar
		 */
		 
		//variables
		
		double euro = 5.58;
		double pesetas = Math.round (euro * 166.387);
		
		
		//salida por pantalla
		
		System.out.print( euro + " euros es un total de " + pesetas + " pesetas");
		
	}
}

