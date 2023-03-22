/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package javaintro01.ejerciciosestructurasdecontrol.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra14 {
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de familias: ");
    int numFamilias = leer.nextInt();

    double sumaEdades = 0.0;
    int totalHijos = 0;

    for (int i = 1; i <= numFamilias; i++) {
      System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
      int numHijos = leer.nextInt();

      System.out.println("Ingrese las edades de los hijos de la familia " + i + ":");
      for (int j = 1; j <= numHijos; j++) {
        System.out.print("Edad del hijo " + j + ": ");
        double edadHijo = leer.nextDouble();
        sumaEdades += edadHijo;
        totalHijos++;
      }
    }

    double mediaEdad = sumaEdades / totalHijos;

    System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
  }
}
