/*
Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 */
package javaintro01.ejerciciosestructurasdecontrol.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra11 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número
        System.out.print("Ingresa un número entero: ");
        int num = scanner.nextInt();

        int numDigitos = 0;

        // Calcular la cantidad de dígitos utilizando el operador de división
        while (num != 0) {
            num = num / 10;
            numDigitos++;
        }

        // Imprimir la cantidad de dígitos del número ingresado
        System.out.println("El número ingresado tiene " + numDigitos + " dígitos.");
    }
}
