/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresymatrices;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] equipo = new String[10];
        
        for(int i=0;i<10;i++){
            System.out.println("Ingrese el nombre numero " + (i+1));
            equipo[i]= sc.nextLine();
            
            
        }
        
          for(int i=0;i<10;i++){
            System.out.println(equipo[i]);
            
        }
            
                
    }
    
}
