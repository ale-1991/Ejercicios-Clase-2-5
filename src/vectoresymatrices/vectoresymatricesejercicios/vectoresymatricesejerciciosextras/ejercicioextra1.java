/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package vectoresymatrices.vectoresymatricesejercicios.vectoresymatricesejerciciosextras;

import java.util.Scanner;

import java.util.Random;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Ingrese la dimension del vector");
        int n = sc.nextInt();
        int [] vector = new int [n];
        int suma =0;
        
        for (int i=0;i<n;i++){
            vector[i]=rand.nextInt(10);
            suma=suma+vector[i];
        }
        
        System.out.println("Vector");
        
        for (int i=0;i<n;i++){
            System.out.print("["+ vector[i] + "]");
        }
        System.out.println("");
        System.out.println("La suma de todos los elementos del vector es: " + suma);
    }
    
}
