/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
package javaintro01.ejerciciosestructurasdecontrol.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra8 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, count = 0, countPar = 0, countImpar = 0;
        
        while (true) {
            System.out.println("Introduce un número entero:");
            num = leer.nextInt();
            
            if (num % 5 == 0) {
                break;
            }
            
            if (num < 0) {
                continue;
            }
            
            count++;
            
            if (num % 2 == 0) {
                countPar++;
            } else {
                countImpar++;
            }
        }
        
        System.out.println("Cantidad de números leídos: " + count);
        System.out.println("Cantidad de números pares: " + countPar);
        System.out.println("Cantidad de números impares: " + countImpar);
        
        
    }
}
