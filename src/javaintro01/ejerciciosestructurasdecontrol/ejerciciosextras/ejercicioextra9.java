/*
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
 */
package javaintro01.ejerciciosestructurasdecontrol.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra9 {
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dividendo, divisor, cociente = 0, residuo;
        
        System.out.println("Introduce el dividendo:");
        dividendo = leer.nextInt();
        
        System.out.println("Introduce el divisor:");
        divisor = leer.nextInt();
        
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        
        residuo = dividendo;
        
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);
        
    
    }
}
/*
En este programa, le pedimos al usuario que introduzca el dividendo y el divisor mediante la consola.
Luego, utilizamos un bucle while que se ejecuta mientras el dividendo sea mayor o igual que el divisor. 
En cada iteración, restamos el divisor del dividendo y aumentamos el contador de cociente en uno.
Finalmente, cuando el dividendo es menor que el divisor, el valor del dividendo es el residuo.
*/