/*
Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class Clase4Ejercicio8 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.println("Ingrese la nota (entre 0 y 10): ");
        nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Error: la nota debe estar entre 0 y 10.");
            System.out.println("Ingrese la nota nuevamente (entre 0 y 10): ");
            nota = scanner.nextInt();
        }

        System.out.println("La nota ingresada es: " + nota);
    }
}