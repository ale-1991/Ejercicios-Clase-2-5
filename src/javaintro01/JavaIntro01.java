/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class JavaIntro01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se crea una variable scanner que se utiliza para leer datos del usuario (equivalente al leer de pseint)
        Scanner leer = new Scanner(System.in);
        //se crea variable cadena
        String nombre;
        //Muestra un msj por pantalla
        System.out.println("Ingresa tu nombre");
        //leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //mostramos por consola un saludo personalizado
        System.out.println("Hola Mundo! soy " + nombre + " y estoy programando en JAVA!");
    }
    
}
