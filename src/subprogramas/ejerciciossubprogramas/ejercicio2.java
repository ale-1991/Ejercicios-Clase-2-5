/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package subprogramas.ejerciciossubprogramas;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas que desea registrar");
        int n = sc.nextInt();
        sc.nextLine(); // consume el carácter \n que queda en el búfer
        String seguir;
        for (int i = 1; i <= n; i++) {
            do {
                System.out.println("PERSONA " + i);
                registrarpersona();
                System.out.println("Desea seguir mostrando personas?");
                seguir = sc.nextLine();
            } while (seguir.equalsIgnoreCase("Si"));
        }
    }

    public static void registrarpersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad de la persona");
        int edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
    }
}
/*De esta manera, el programa consumirá el carácter \n que queda en el búfer 
después de cada llamada a nextInt(), permitiendo que la entrada del usuario
para la variable seguir se lea correctamente en la siguiente iteración del bucle do-while.
*/





