/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01.ejerciciosestructurasdecontrol.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra7version2 {
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont =0;
        double suma=0;
        double num;
        /*
        utilizamos Double.MIN_VALUE y Double.MAX_VALUE para inicializar 
        las variables max y min respectivamente, de modo que puedan compararse con
        los números introducidos por el usuario y obtener los valores máximo y mínimo del conjunto.
        */
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
       
       do{
           System.out.println("Ingrese la cantidad de numeros con las que desea trabajar");
           num = leer.nextInt();
           
       }while(num<=0);
       
       
       do{
            System.out.println("Ingrese un numero entero mayor de cero");
            double n = leer.nextDouble();
            max=Math.max(max,n);
            min=Math.min(min,n);
            cont++;
            suma+=n;
       }while(cont<num);
       
        double promedio = suma/num;
        System.out.println("El promedio es " + promedio);
        System.out.println("El numero minimo es " + min);
        System.out.println("El numero maximo es " + max);
    }
}
