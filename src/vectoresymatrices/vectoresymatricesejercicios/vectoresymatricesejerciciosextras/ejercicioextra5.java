/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package vectoresymatrices.vectoresymatricesejercicios.vectoresymatricesejerciciosextras;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra5 {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas");
        int N = sc.nextInt(); // Número de filas de la matriz
        System.out.println("Ingrese la cantidad de columnas");
        int M =sc.nextInt(); // Número de columnas de la matriz
        
        int[][] matriz = new int[N][M];
        Random rand = new Random();
        
        // Llenar matriz con valores aleatorios
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = rand.nextInt(10); // Generar valor aleatorio entre 0 y 9
            }
        }
        
        // Mostrar matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Calcular la suma de los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma += matriz[i][j];
            }
        }
        
        // Mostrar la suma de los elementos de la matriz
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
    
}
