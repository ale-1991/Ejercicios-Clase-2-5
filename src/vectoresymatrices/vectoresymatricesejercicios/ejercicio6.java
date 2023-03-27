/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresymatrices.vectoresymatricesejercicios;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio6 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] sumaFilas = new int[3];
        int[] sumaColumnas = new int[3];
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;

        // Pedir al usuario que ingrese los números para cada posición de la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el número para la posición [" + i + "][" + j + "]: ");
                int num = sc.nextInt();
                if (num < 1 || num > 9) {
                    System.out.println("El número ingresado no es válido. Debe estar entre 1 y 9.");
                    return;
                }
                matriz[i][j] = num;
            }
        }

        // Calcular la suma de cada fila, columna y diagonal de la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
                if (i == j) {
                    sumaDiagonal1 += matriz[i][j];
                }
                if (i + j == 2) {
                    sumaDiagonal2 += matriz[i][j];
                }
            }
        }

        // Verificar que la suma de cada fila, columna y diagonal sea igual
        int sumaMagica = sumaFilas[0];
        for (int i = 1; i < 3; i++) {
            if (sumaFilas[i] != sumaMagica || sumaColumnas[i] != sumaMagica) {
                System.out.println("El cuadrado no es mágico.");
                return;
            }
        }
        if (sumaDiagonal1 != sumaMagica || sumaDiagonal2 != sumaMagica) {
            System.out.println("El cuadrado no es mágico.");
            return;
        }

        // Si la suma de cada fila, columna y diagonal es igual, entonces el cuadrado es mágico
        System.out.println("El cuadrado es mágico.");
    }
}

