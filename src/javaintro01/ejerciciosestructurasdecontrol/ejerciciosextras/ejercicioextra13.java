/*
Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1 
12
123
 */
package javaintro01.ejerciciosestructurasdecontrol.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra13 {
      public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese la altura de la escalera: ");
    int altura = leer.nextInt();
    
    for (int i = 1; i <= altura; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
/*
En este programa, primero solicitamos la altura de la escalera al usuario utilizando un objeto de tipo Scanner.
Luego, utilizamos un bucle for anidado para imprimir cada línea de números. El bucle exterior se ejecuta una vez por cada línea de la escalera, y el bucle interior se ejecuta una vez por cada número en la línea actual.

Dentro del bucle interior, utilizamos el contador del bucle j para imprimir cada número de la línea actual, 
comenzando en 1 y terminando en el número de la línea actual (i). Después de imprimir todos los números 
de la línea actual, imprimimos una nueva línea utilizando el método println() de la clase System.out, 
lo que hace que la siguiente línea de números se imprima en la siguiente línea de la consola.
*/