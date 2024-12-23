/*
 * Ej2.java
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
 
	/*Realiza un programa que pida una hora por teclado y que muestre luego
	buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
	tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
	cuenta las horas, los minutos no se deben introducir por teclado.
	*/

import java.util.Scanner;

public class Ej2 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Pido al usuario la hora y lo almaceno en una variable int
		
		System.out.println("Que hora es?");
		int hora = s.nextInt();
		
		//condicional que evalua la hora y en funcion de esta muestra por pantalla un mensaje diferente
		
		if (hora < 24 && hora >= 0){
			   
			  if (hora >= 6){
				System.out.print("Buenos dias");
				
			} else if (hora >= 13){
				System.out.print("buenas tardes");
					
			} else if(hora >= 21){
				System.out.print("Buenas noches");
				
			} else {
					System.out.print("Buenas noches");
					
		    }
		    
		} else 
			System.out.print("Error");
			
		
	}	//Fin de programa
}

