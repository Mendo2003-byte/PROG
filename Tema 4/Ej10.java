/*
 * Ej10.java
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
 
	/*Escribe un programa que nos diga el horóscopo a partir del día y el mes de
	nacimiento.
	*/
	
import java.util.Scanner;

public class Ej10 {
	
	public static void main (String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Este programa te indica el horoscopo a partir del dia y el mes de nacimiento");
	System.out.println("Introduce tu mes de nacimento segun el numero");
	int mes = s.nextInt();
	
	System.out.println("Introduce tu dia de nacimento ");
	int dia = s.nextInt();
		
	if ((dia <= 0 || dia > 31)||(mes < 0 || mes > 12)){
			System.out.print("Error");
			
		} else {
			switch (mes){	
				case 1:					
					if (dia <= 19) {
						System.out.print("Capricornio");
									
						} else {
							System.out.print("Acuario");
										
						}
				break;			
				case 2:
					if (dia > 28) {
						System.out.println("febrero solo tiene 28 dias");
						
						} else {
							if (dia <= 18) {
								System.out.print("Acuario");
											
								} else {
									System.out.print("Piscis");
								}							
							}
				break;
				case 3:
					if (dia <= 20) {
						System.out.print("Piscis");
									
						} else {
							System.out.print("Aries");
						}
				break;			
				case 4:
					if (dia > 30) {
						System.out.println("Abril solo tiene 30 dias");
						
						} else {
							if (dia <= 19) {
								System.out.print("Aries");
											
								} else {
									System.out.print("Tauro");
								}							
							}
				break;		
				case 5:
					if (dia <= 20) {
						System.out.print("Tauro");
									
						} else {
							System.out.print("Geminis");
						}
				break;		
				case 6:
					if (dia > 30) {
						System.out.println("Junio solo tiene 30 dias");
						
						} else {
							if (dia <= 20) {
								System.out.print("Geminis");
											
								} else {
									System.out.print("Cancer");
								}							
							}				
				break;
				case 7:
					if (dia <= 22) {
						System.out.print("Cancer");
									
						} else {
							System.out.print("Leo");
						}
				break;
				case 8:
					if (dia <= 22) {
						System.out.print("Leo");
									
						} else {
							System.out.print("Virgo");
						}
				break;
				case 9:
					if (dia > 30) {
						System.out.println("Septiembre solo tiene 30 dias");
						
						} else {
							if (dia <= 22) {
								System.out.print("Virgo");
											
								} else {
									System.out.print("Libra");
								}							
							}				
				break;
				case 10:
					if (dia <= 22) {
						System.out.print("Libra");
									
						} else {
							System.out.print("Escorpio");
						}
				break;
				case 11:
				
					if (dia > 30) {
						System.out.println("Noviembre solo tiene 30 dias");
						
						} else {
							if (dia <= 21) {
								System.out.print("Escorpio");
											
								} else {
									System.out.print("Sagitario");
								}							
							}				
				break;
				case 12:
					if (dia <= 22) {
						System.out.print("Sagitario");
									
						} else {
							System.out.print("Capricornio");
						}
				break;																																				
			}		
		}			
	}	//Fin programa
}

