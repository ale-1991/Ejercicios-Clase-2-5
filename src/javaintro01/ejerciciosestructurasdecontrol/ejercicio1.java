package javaintro01.ejerciciosestructurasdecontrol;


import java.util.Scanner;

/*
Crear un programa que dado un número determine si es par o impar.
package javaintro01.ejerciciosestructurasdecontrol;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea analizar");
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero ingresado es par");
        }else {
            System.out.println("El numero es impar");
        }
            
    }
    
}
