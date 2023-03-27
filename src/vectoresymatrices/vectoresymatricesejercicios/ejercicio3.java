/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package vectoresymatrices.vectoresymatricesejercicios;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector:");
        int n = sc.nextInt();

        // Declarar un vector de contadores para contar los números por cantidad de dígitos
        int[] contadores = new int[6];

        // Generar los números aleatorios y contar los dígitos de cada número
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * 90000) + 10000;
            int digitos = contarDigitos(num);

            // Incrementar el contador correspondiente
            if (digitos >= 1 && digitos <= 5) {
                contadores[digitos]++;
            }
        }

        // Imprimir los resultados
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hay " + contadores[i] + " números de " + i + " dígitos.");
        }
    }

    // Función para contar la cantidad de dígitos de un número entero
    public static int contarDigitos(int num) {
        int contador = 0;
        while (num != 0) {
            num /= 10;
            contador++;
        }
        return contador;
    }
}
