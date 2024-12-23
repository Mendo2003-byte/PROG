/*
 * Ej21.java
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

 /*Calcula la nota de un trimestre de la asignatura Programación. El programa
	pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
	Si la media de los dos controles da un número mayor o igual a 5, el alumno
	está aprobado y se mostrará la media. En caso de que la media sea un número
	menor que 5, el alumno habrá tenido que hacer el examen de recuperación
	que se califica como apto o no apto, por tanto se debe preguntar al usuario
	¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
	resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
	mantiene la nota media anterior.
 */
import java.util.Scanner;

public class Ej21 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa calcula la nota del trimestre de programacion");
        System.out.println("Introduzca la primera nota");
        double nota1 = s.nextDouble();
        System.out.println("Introduzca la segunda nota");
        double nota2 = s.nextDouble();
        double media = (nota1 + nota2) / 2;


		if (nota1 >10 || nota1 < 0 || nota2 >10 || nota2 < 0){
			
			System.out.println("Notas introducidas no validas");
			
			} else if (media >= 5) {
				System.out.println("Estas aprobado su nota media es un " + media);

				} else {
					s.nextLine();
					System.out.println("cual a sido el resultado de su recuperacion?(apto/no apto)");
					String recuperacion = s.nextLine();

						if (recuperacion.equals("apto")) {
							System.out.println("Estas aprobado su nota final es un 5");

						} else {
							System.out.print("Su nota final sigue siendo un " + media);

            }
        }

    }	//Fin programa
}
