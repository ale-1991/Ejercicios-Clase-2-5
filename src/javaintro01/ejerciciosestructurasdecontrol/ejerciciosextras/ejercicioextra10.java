/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package javaintro01.ejerciciosestructurasdecontrol.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra10 {
      public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num1 = (int) (Math.random() * 11); //genera un número aleatorio entre 0 y 10
    int num2 = (int) (Math.random() * 11); //genera un número aleatorio entre 0 y 10
    /*
    En esta línea de código, Math.random() devuelve un número aleatorio de punto flotante entre 
    0.0 (inclusive) y 1.0 (exclusivo). Luego, se multiplica por 11 para obtener un número aleatorio entre 0 y 10.
    La expresión (int) convierte el número aleatorio de punto flotante en un número entero.
    
    El número máximo especificado en la multiplicación debe ser 1 más que el 
    número más grande que deseas generar aleatoriamente.
    */
    int resultado = num1 * num2;
    int respuesta;

    do {
      System.out.print("¿Cuánto es " + num1 + " x " + num2 + "? ");
      respuesta = leer.nextInt();

      if (respuesta == resultado) {
        System.out.println("¡Correcto!");
      } else {
        System.out.println("Incorrecto. Intente nuevamente.");
      }
    } while (respuesta != resultado);
  }
}
