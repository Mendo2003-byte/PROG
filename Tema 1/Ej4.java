/*
 * Ej4.java
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


public class Ej4 {
	
	public static void main (String[] args) {
	
	/*Escribe un programa que muestre tu horario de clase. Puedes usar espacios o
	tabuladores para alinear el texto.
	*/
	
	//variables
	
	String rojo = "\033[31m";
	String verde = "\033[32m";
	String naranja = "\033[33m";
	String azul = "\033[34m";
	String morado = "\033[35m";
	String cyan = "\033[36m";
	String blanco = "\033[37m";
	String reset = "\033[0m";
	String cyan_claro = "\033[1;36m";
	String naranja_claro = "\033[1;33m";

	//salida por patalla
	
	System.out.println("\n\t\t\t Lunes \t Martes \t Miercoles \t Jueves \t Viernes\n");
	System.out.println("\t08:00 - 09:00 \t" + verde + " PROG \t" + azul + " LMSGI \t\t" + morado + " IPEI \t\t" + verde + " PROG \t\t PROG" + reset);
	System.out.println("\t09:00 - 10:00 \t" + verde + " PROG \t" + azul + " LMSGI \t\t" + naranja + " BD \t\t" + verde + " PROG \t\t" + verde + " PROG" + reset);
	System.out.println("\t10:00 - 11:00 \t" + naranja + " BD \t" + azul + " LMSGI \t\t" + naranja + " BD \t\t" + verde + " PROG \t\t" + verde + " PROG" + reset);
	System.out.println("\t11:30 - 12:30 \t" + naranja_claro + " ED \t" + reset + morado + " IPEI \t\t" + cyan + " SOS \t\t" + rojo + " SI \t\t" + naranja + " BD" + reset);
	System.out.println("\t12:30 - 13:30 \t" + naranja_claro + " ED \t" + reset + morado + " IPEI \t\t" + rojo + " SI \t\t" + rojo + " SI \t\t" + naranja + " BD" + reset);
	System.out.println("\t13:30 - 14:30 \t" + naranja_claro + " ED \t" + reset + cyan_claro + " DIG \t\t" + reset + rojo + " SI \t\t" + rojo + " SI \t\t" + naranja + " BD" + reset);
		
	}
}

