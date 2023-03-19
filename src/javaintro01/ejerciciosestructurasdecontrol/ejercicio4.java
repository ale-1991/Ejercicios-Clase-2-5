/*
Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package javaintro01.ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase, se validara si la primera letra es una A");
        String palabra = leer.nextLine();
        if(palabra.substring(0,1).equals( "A")){
            System.out.println("CORRECTO!");
        }else
            System.out.println("INCORRECTO");
    }
    
}
/*
En este caso, utilizamos la función substring() para obtener el primer 
carácter de la palabra ingresada y luego la función equals() 
para comparar si es igual a "A". Si es así, se imprime "CORRECTO", 
de lo contrario se imprime "INCORRECTO".
*/