/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */
package subprogramas.ejerciciossubprogramas;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero a analizar");
        int num = sc.nextInt();
        
        boolean esPrimo = esPrimo(num);
         
        if (esPrimo){
            System.out.println("El numero " + num + " es primo");
        }else{
            System.out.println("El numero " + num + " no es primo");
        }
         
    }
    
    
    public static boolean esPrimo(int num){
        if(num<=1){
            return false;
        }
        
        for (int i=2; i<num; i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}

