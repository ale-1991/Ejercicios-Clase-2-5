/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresymatrices.vectoresymatricesejercicios;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [100];
        int aux=0;
        for (int i=0;i<100;i++){
            numeros[i]=i+1;
            
        }
        
        for (int i=99 ;i>=0; i--){
            System.out.println(  "[" + numeros[i] + "]" );
        }
    }
}