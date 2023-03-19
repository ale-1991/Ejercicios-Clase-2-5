/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package javaintro01.ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabraClave = "eureka";
        System.out.println("Ingrese una palabra");
        String palabra = leer.next();
        if (palabra.equals(palabraClave)){
            System.out.println("Correcto!");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
}
