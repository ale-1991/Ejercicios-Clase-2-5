/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package vectoresymatrices.vectoresymatricesejercicios.vectoresymatricesejerciciosextras;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del vector");
        int n = sc.nextInt();
        int [] vector = new int [n];
        llenar(vector,n);
        mostrar(vector,n);
    }
    
    public static void llenar(int[] vector, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(10);
        }
    }

    public static void mostrar(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
    
}
