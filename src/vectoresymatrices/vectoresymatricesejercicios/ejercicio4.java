/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
1  0  4
0  5  0
6  0 -9

1  0  6
0  5  0
4  0 -9

 */
package vectoresymatrices.vectoresymatricesejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[][] matriz = new int[4][4];
        
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz[i][j]= rand.nextInt(10);
            }
        }
        graficar(matriz);
        graficartranspuesta(matriz);
        graficartranspuesta2(matriz);
    }

    public static void graficar(int[][] matriz) {
        System.out.println("MATRIZ ORIGINAL");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }

    public static void graficartranspuesta(int[][] matriz) {
        
        System.out.println("MATRIZ TRANSPUESTA");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }
    
      public static void graficartranspuesta2(int[][] matriz) {
        System.out.println("MATRIZ TRANSPUESTA 2");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[j][i] + "] ");
            }
            System.out.println("");
        }
    }

}

