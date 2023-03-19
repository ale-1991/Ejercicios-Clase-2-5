/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

  System.out.println("--ELIJA UNA OPCION");
        System.out.println("---MENU---");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");

 */
package javaintro01.ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero con el que desea trabajar");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero entero con el que desea trabajar");
        int num2 = leer.nextInt();
        int eleccion = 0; //lo tuve que definir afuera del bucle sino me daba error
        do{
        System.out.println("--ELIJA UNA OPCION");
        System.out.println("---MENU---");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        
        eleccion = leer.nextInt();
        
        switch (eleccion){
            
            case 1:
                System.out.println("El resultado de la suma de los numeros ingresados es " + (num1+num2));
                break;
            case 2:
                System.out.println("El resultado de la resta de los numeros ingresados es " + (num1-num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion de los numeros ingresados es " + (num1*num2));
                break;
            case 4:
                System.out.println("El resultado de la division de los numeros ingresados es " + (num1/num2));
                break;
            case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    String confirmacion = leer.next();
                    
                    if ("s".equals(confirmacion) || "S".equals(confirmacion)){
                        System.out.println("Saliendo del programa...");
                    } else {
                        eleccion = 0;
                    }
                    break;
            default: 
                   System.out.println("Opción inválida. Por favor, elija una opción del 1 al 5.");
                    break;
        }
        } while (eleccion != 5);
        
    }
}
        
        
        
                   
    
