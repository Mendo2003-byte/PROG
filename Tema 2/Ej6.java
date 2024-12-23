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


public class Ej6 {
	
	public static void main (String[] args) {
		
		/*Escribe un programa que calcule el total de una factura a partir de la base
		imponible (precio sin IVA). La base imponible estará almacenada en una
		variable.
		*/
		
		//variables
		
		double siva = 2000.50;
		double iva = 16 / 100 ;
		double civa = siva + (siva * iva);
		
		//salida por pantalla
		
		System.out.println("el precio del ordenador con iva incluido es de " + civa + " euros");
		System.out.print("el precio del ordenador sin iva incluido es de " + siva + " euros");

	}
}

