/*
 * Ej22.java
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

	/*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
	hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
	Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
	por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
	a las 15:00h.*/

import java.util.Scanner;

public class Ej22 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Este programa calcula el tiempo que flata para el fin de semana segun el dia de la semana y la hora que sea");
		System.out.println("Introduce el dia de la semana en el que te encuentras con la primera letra en mayuscula");
		String dia = s.next();
		System.out.println("Introduce la hora a la que se encuentra");
		int hora = s.nextInt();
		System.out.println("Introduce los minutos en los que se encuentra");
		int min = s.nextInt();	
		
		
		if ((hora < 0 || hora >= 24)|| (min < 0 || min >= 60)){
			System.out.println("Hora introducida no valida");
			
			}else {	
		
				switch (dia){
				
					case ("Lunes"):
								System.out.println("Para el fin de semana falta un total de " + (6660 - (hora * 60 + min)) + " minutos" ); 

						break;
					case ("Martes"):
								System.out.println("Para el fin de semana falta un total de " + (5220 - (hora * 60 + min)) + " minutos" ); 
	
						break;
					case ("Miercoles"):
								System.out.println("Para el fin de semana falta un total de " + (3780 - (hora * 60 + min)) + " minutos" ); 
		
						break;
					case ("Jueves"):
								System.out.println("Para el fin de semana falta un total de " + (2340 - (hora * 60 + min)) + " minutos" ); 
		
						break;
					case ("Viernes"):
							if (hora >= 15){
								System.out.println("Ya es fin de semana");
								
								} else {
									System.out.println("Para el fin de semana falta un total de " + (900 - (hora * 60 + min)) + " minutos" ); 

									}
						break;
					default:		
							System.out.print("Dia introducido incorrecto");
						break;
			}
		}
	}
}

