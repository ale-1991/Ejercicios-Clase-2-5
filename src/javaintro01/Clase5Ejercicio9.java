/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse.
 */
package javaintro01;

import java.util.Scanner;

public class Clase5Ejercicio9 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, sum = 0;
        boolean encontrado = false;
        int i = 0; //contador
        
        do {
            System.out.print("Ingrese un número: ");
            num = leer.nextInt();
            
            if (num == 0) {
                System.out.println("Se capturó el número cero");
                encontrado = true;
            }
            
            if (num > 0) {
                sum = sum + num;
            }
            
            i++;
        } while (i < 20 && !encontrado);
        
        if (!encontrado) {
            System.out.println("No se capturó el número cero");
        }
        
        System.out.println("La suma de los números positivos es: " + sum);
    }
}

