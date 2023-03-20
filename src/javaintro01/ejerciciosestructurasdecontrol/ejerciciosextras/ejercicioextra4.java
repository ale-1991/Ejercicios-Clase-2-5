/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano
 */
package javaintro01.ejerciciosestructurasdecontrol.ejerciciosextras;

import java.util.Scanner;



/**
 *
 * @author Administrador
 */
public class ejercicioextra4 {
    public static void main(String[] args){
            Scanner leer = new Scanner(System.in);  
        System.out.println("Ingrese el numero(del 1 al 10)");
        int numero = leer.nextInt();
        
        switch(numero){
            case 1: 
                System.out.println("Equivalente numero romano: I");
                break;
            case 2: 
                System.out.println("Equivalente numero romano: II");
                break;
            case 3: 
                System.out.println("Equivalente numero romano: III");
                break;
            case 4: 
                System.out.println("Equivalente numero romano: IV");
                break;
            case 5: 
                System.out.println("Equivalente numero romano: V");
                break;
            case 6: 
                System.out.println("Equivalente numero romano: VI");
                break;
            case 7: 
                System.out.println("Equivalente numero romano: VII");
                break;
            case 8: 
                System.out.println("Equivalente numero romano: VIII");
                break;
            case 9: 
                System.out.println("Equivalente numero romano: IX");
                break;
            case 10:
                System.out.println("Equivalente numero romano: X");
                break;
            default:
                System.out.println("Numero incorrecto");
                break;
                
                
        }
            
        
    }
}
