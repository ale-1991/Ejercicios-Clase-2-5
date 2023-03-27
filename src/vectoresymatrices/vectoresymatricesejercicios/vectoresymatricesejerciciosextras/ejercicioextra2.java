/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package vectoresymatrices.vectoresymatricesejercicios.vectoresymatricesejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del vector");
        int n = sc.nextInt();
        int[] vector1 = new int [n];
        int[] vector2 = new int [n];
        llenar( vector1,  vector2, n);
         
        
        boolean iguales = true;
        
        System.out.println("Comparacion en proceso...");
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }
        
        if (iguales) {
            System.out.println("Comparacion finalizada.");
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores no son iguales.");
        }
        
    }
    
    public static void llenar(int[] vector1, int[] vector2, int n) {
       System.out.println("Ingrese los elementos del primer vector: ");
       Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            vector1[i] = sc.nextInt();
        }
        
        System.out.println("Ingrese los elementos del segundo vector: ");
        for (int i = 0; i < n; i++) {
            vector2[i] = sc.nextInt();
        }
    }
    
    
}
