/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package javaintro01;
import java.util.Scanner;
/**
 *
 * @author Alejandro Caro
 */
public class Clase2Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un nÃºmero");
        int numero = leer.nextInt();
        int numeroDoble = numero * 2;
        int numeroTriple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("Su doble es: " + numeroDoble);
        System.out.println("Su triple es: " + numeroTriple);
        System.out.println("Su raiz cuadrada es: " + raizCuadrada);
    }
    
}
