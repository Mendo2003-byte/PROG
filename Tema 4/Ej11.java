/*
 * Ej11.java
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
 
	/*Escribe un programa que dada una hora determinada (horas y minutos),
	calcule los segundos que faltan para llegar a la medianoche.*/

import java.util.Scanner;

public class Ej11 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Este es un programa que determina los segundos que faltan para llegar a la media noche a partir de la hora introducida");
		System.out.println("Introduce la hora");
		int hora = s.nextInt();
		
		System.out.println("Introduce los minutos");
		int min = s.nextInt();
		int seg = 0;

		if ((hora < 0 || hora >= 24) || (min < 0 || min >= 60)){
			System.out.print("Hora introducida no valida");

		} else if (hora == 0 && min == 0){
			System.out.print("Ya es media noche");
			
			} else {
				seg = (min *60 + hora * 3600);			
				System.out.print("Falta para la media noche un total de " + (86400 - seg) + " segundos");				
				}
				
	}	//Fin programa
}

