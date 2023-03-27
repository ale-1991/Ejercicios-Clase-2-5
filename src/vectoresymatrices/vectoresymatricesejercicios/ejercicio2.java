/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package vectoresymatrices.vectoresymatricesejercicios;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = sc.nextInt();
         int[] vector = new int[n]; 
        
        System.out.println("Ingrese el numero a buscar en el vector");
        int buscar = sc.nextInt();
        

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10); // Genera un número aleatorio entre 0 y 99
            if (vector[i]== buscar){
                System.out.println("El numero a buscar se encuentra en el subindice vector [" + i + "]");
            }

        }
        System.out.println("VECTOR COMPLETO");

        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        

        
        
    }
}