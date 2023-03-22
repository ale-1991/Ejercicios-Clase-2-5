/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package subprogramas.ejerciciossubprogramas;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2 = sc.nextDouble();
        int eleccion;
        
        do{
        System.out.println("--ELIJA UNA OPCION");
        System.out.println("---MENU---");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        
        eleccion = sc.nextInt();
        
        switch (eleccion){
            
            case 1:
                double suma = sumar(num1,num2);
                System.out.println(num1 + " + " + num2 + " = " + suma);
                break;
            case 2:
                double resta = restar(num1,num2);
                System.out.println(num1 + " - " + num2 + " = " + resta);
                break;
            case 3:
                double multiplicacion = multiplicar(num1,num2);
                System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
                break;
            case 4:
                double division = dividir(num1,num2);
                  if (Double.isNaN(division)) {
                    System.out.println("No se puede dividir entre cero.");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + division);
                }
                break;
            case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    String confirmacion = sc.next();
                    
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
    
    public static double sumar(double num1, double num2){
        return num1+num2;
        
    }
    
    public static double restar(double num1, double num2){
        return num1-num2;
        
    }
    
    public static double multiplicar(double num1, double num2){
        return num1*num2;
        
    }
    
    public static double dividir(double num1, double num2){
        return num1/num2;
        
    }
      
     
}
