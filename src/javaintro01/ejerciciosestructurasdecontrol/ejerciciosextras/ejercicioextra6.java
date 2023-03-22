/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package javaintro01.ejerciciosestructurasdecontrol.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra6 {
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int n = leer.nextInt();
        
        double sumTotal = 0;
        double sumBajo160 = 0;
        int countBajo160 = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la estatura de la persona " + i + " en metros: ");
            double altura = leer.nextDouble();
            sumTotal += altura;
            if (altura < 1.60) {
                sumBajo160 += altura;
                countBajo160++;
            }
        }
        
        double promedioTotal = sumTotal / n;
        double promedioBajo160 = sumBajo160 / countBajo160;
        
        System.out.println("Promedio de estaturas en general: " + promedioTotal + " mts.");
        System.out.println("Promedio de estaturas por debajo de 1.60 mts.: " + promedioBajo160 + " mts.");
    }
}
