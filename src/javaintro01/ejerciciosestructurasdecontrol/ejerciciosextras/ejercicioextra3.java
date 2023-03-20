/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package javaintro01.ejerciciosestructurasdecontrol.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        
        do {
            System.out.println("Ingrese una sola letra a analizar:");
            letra = leer.nextLine();
        } while (letra.length() != 1);
        
        if ("a".equals(letra) || "e".equals(letra) || "i".equals(letra) || "o".equals(letra) || "u".equals(letra)) {
            System.out.println("Es una vocal!");
        } else {
            System.out.println("No se trata de una vocal!");
        }
    }
}
