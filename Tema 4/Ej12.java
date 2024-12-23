/*
 * Ej12.java
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
	/*Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
	que se imparten en el curso. Cada pregunta acertada sumará un punto. El
	programa mostrará al final la calificación obtenida. Pásale el minicuestionario
	a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
	*/

import java.util.Scanner;

public class Ej12 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		int nota = 0;
		
		System.out.println("Esto es un cuestionario con 10 preguntas de tipo test sobre java");
		System.out.println("Para contestar las preguntas te ayudaremos con 4 posibles respuestas tu solo deberas de introducir a, b, c, d\n");
		
		System.out.println("Pregunta 1: Como se declara una variable entera en Java?\n\na) int num;\nb) int num:\nc) num;\nd) num int;");
		char pregunta1 = s.next().charAt(0);
		
		
		if (pregunta1 != 'a' && pregunta1 != 'b' && pregunta1 != 'c' && pregunta1 != 'd'){
			System.out.println("Respuesta no valida");
			} else if (pregunta1 == 'a'){
				nota = nota +1;	
				}	
				
		System.out.println("Pregunta 2: que se utiliza para comentar una linea en Java?\n\na) */\nb) ||\nc) //\nd) \\");
		char pregunta2 = s.next().charAt(0);
		
		if (pregunta2 != 'a' && pregunta2 != 'b' && pregunta2 != 'c' && pregunta2 != 'd'){
			System.out.println("Respuesta no valida");
			} else if (pregunta2 == 'c'){
				nota = nota +1;	
				}		
		
		System.out.println("Pregunta 3: que tipo de datos se usa para almacenar texto en Java?\n\na) double\nb) char\nc) String\nd) bolean");
		char pregunta3 = s.next().charAt(0);
		
		if (pregunta3 != 'a' && pregunta3 != 'b' && pregunta3 != 'c' && pregunta3 != 'd'){
			System.out.println("Respuesta no valida");
			} else if (pregunta3 == 'c'){
				nota = nota +1;	
				}		
		
		System.out.println("Pregunta 4: Cual es el operador de comparacion para la igualdad en Java?\n\na) =\nb) ==\nc) ===\nd) !=");
		char pregunta4 = s.next().charAt(0);	
		
		if (pregunta4 != 'a' && pregunta4 != 'b' && pregunta4 != 'c' && pregunta4 != 'd'){
			System.out.println("Respuesta no valida");
			} else if (pregunta4 == 'b'){
				nota = nota +1;	
				}		
		
		System.out.println("Pregunta 5: Cual de estos es un bucle en Java?\n\na) do while\nb) while\nc) for\nd) Todas son correctas");
		char pregunta5 = s.next().charAt(0);		
		
		if (pregunta5 != 'a' && pregunta5 != 'b' && pregunta5 != 'c' && pregunta5 != 'd'){
			System.out.println("Respuesta no valida");
			} else if (pregunta5 == 'd'){
				nota = nota +1;	
				}				
		
		System.out.println("Pregunta 6: que se utiliza para comparar si dos valores son diferentes en Java?\n\na) !=\nb) =!\nc) ==!\nd) !==");
		char pregunta6 = s.next().charAt(0);

		if (pregunta6 != 'a' && pregunta6 != 'b' && pregunta6 != 'c' && pregunta6 != 'd'){
			System.out.println("Respuesta no valida");
			} else if (pregunta6 == 'a'){
				nota = nota +1;	
				}					
		
		System.out.println("Pregunta 7: Cual es el resultado de 2 + '2' en Java?\n\na) 4\nb) 2\nc) 0\nd) 22");
		char pregunta7 = s.next().charAt(0);	
		
		if (pregunta7 != 'a' && pregunta7 != 'b' && pregunta7 != 'c' && pregunta7 != 'd'){
			System.out.println("Respuesta no valida");
			} else if (pregunta7 == 'd'){
				nota = nota +1;	
				}			
		
		System.out.println("Pregunta 8: que hace el metodo nextInt() de la clase Scanner?\n\na) Lee un numero decimal\nb) Imprime un numero enteron\nc) Lee un numero entero\nd) Imprime una cadena");
		char pregunta8 = s.next().charAt(0);	
		
		if (pregunta8 != 'a' && pregunta8 != 'b' && pregunta8 != 'c' && pregunta8 != 'd'){
			System.out.println("Respuesta no valida");
			} else if (pregunta8 == 'c'){
				nota = nota +1;	
				}		
		
		System.out.println("Pregunta 9: Cual de estos se utiliza para hacer una estructura condicional en Java?\n\na) if\nb) else\nc) else if\nd) Todas son correctas");
		char pregunta9 = s.next().charAt(0);			
		
		if (pregunta9 != 'a' && pregunta9 != 'b' && pregunta9 != 'c' && pregunta9 != 'd'){
			System.out.println("Respuesta no valida");
			} else if (pregunta9 == 'd'){
				nota = nota +1;	
				}		
		System.out.println("Pregunta 10: Cual es el resultado de 10 % 3 en Java (sin decimales)?\n\na) 1\nb) 3,33\nc) 3\nd) Todas son falsas");
		char pregunta10 = s.next().charAt(0);	
		
		if (pregunta10 != 'a' && pregunta10 != 'b' && pregunta10 != 'c' && pregunta10 != 'd'){
			System.out.println("Respuesta no valida");
			} else if (pregunta10 == 'a'){
				nota = nota +1;	
				}			 

		System.out.print("Su nota del cuestionario es un " + nota);		
			
	}	//Fin programa
}

