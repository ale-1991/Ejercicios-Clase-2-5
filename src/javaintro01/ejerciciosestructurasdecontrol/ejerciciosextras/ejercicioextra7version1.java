/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package javaintro01.ejerciciosestructurasdecontrol.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra7version1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros con las que desea trabajar");
        double num = leer.nextInt();
        int cont =0;
        double suma=0;
        /*
        utilizamos Double.MIN_VALUE y Double.MAX_VALUE para inicializar 
        las variables max y min respectivamente, de modo que puedan compararse con
        los números introducidos por el usuario y obtener los valores máximo y mínimo del conjunto.
        */
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
       
        while (cont<num){
            
            System.out.println("Ingrese un numero entero mayor de cero");
            int n = leer.nextInt();
            if(n<=0){
                while(n<=0){
                    System.out.println("Numero incorrecto! Ingrese un numero entero mayor de cero");
                    n = leer.nextInt();
                }
            }
            max = Math.max(max, n);
            min = Math.min(min, n);
            

                  
            suma=suma+n;
            cont=cont+1;
        }
        double promedio = suma/num;
        System.out.println("El promedio es " + promedio);
        System.out.println("El numero minimo es " + min);
        System.out.println("El numero maximo es " + max);
    }
}
