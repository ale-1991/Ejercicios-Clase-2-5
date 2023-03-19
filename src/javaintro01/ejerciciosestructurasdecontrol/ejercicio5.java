/*
. Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.

 */
package javaintro01.ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor limite");
        int limite = leer.nextInt();
        int suma = 0;
        int numero;
        
        while(suma <= limite){
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            suma+= numero;
            
        } 
        System.out.println("La suma de los números ingresados es: " + suma);
                                 
    }
    
}
