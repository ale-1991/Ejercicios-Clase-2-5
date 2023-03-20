/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package javaintro01.ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado:");
        int lados = scanner.nextInt();

        // Iterar sobre las filas
        for (int i = 0; i < lados; i++) {

            // Iterar sobre las columnas
            for (int j = 0; j < lados; j++) {
                // Imprimir * en las esquinas y en el borde
                if (i == 0 || i == lados - 1 || j == 0 || j == lados - 1) {
                    System.out.print("* ");
                } else {
                    // Imprimir espacio en el interior del cuadrado
                    System.out.print("  ");
                }
            }

            // Saltar a una nueva línea después de cada fila
            System.out.println();
        }
    }
}
